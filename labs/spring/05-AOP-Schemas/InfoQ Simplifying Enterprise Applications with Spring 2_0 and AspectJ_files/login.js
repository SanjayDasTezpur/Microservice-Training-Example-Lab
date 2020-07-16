var loginWindowActive = false;
var action = new Function("void(0);");

var ALIGN_RIGHT = 1;
var ALIGN_LEFT = 2;
var loginWidget;

function showLoginWindow(position, align, a ){
	if (loginWindowActive) {
		hideLoginWindow();
		return;
	}
	action = a;
	loginWindowActive = true;
	var verticalPosition = findPosY(position)+position.offsetHeight-1;
	var horizontalPosition = align==ALIGN_RIGHT?'':(align==ALIGN_LEFT?'left: '+findPosX(position)+'px;':'');		
	Element.update('loginWindow',
		'<div id="innerLoginWindow" class="popup login-popup" style="display:none; '+
		'z-index: 25550; position:absolute; top: '+verticalPosition+'px; '+
		horizontalPosition+' "><div class="popup-wrapper">'+
		'<p class="popup-close"><a href="javascript:void(0);" onClick="javascript:hideLoginWindow();">Close</a></p>'+
		'<h2>Existing Users:</h2><div id="loginArea">'+		
		getLoginArea()+
		'</div></div></div>');					
	Element.show('loginWindow');
	if (align == ALIGN_RIGHT) {
		horizontalPosition = 'left:'+Number(findPosX(position)-Element.getDimensions('innerLoginWindow').width+
			Element.getDimensions(position).width+8)+'px;';
		Element.update('loginWindow',
			'<div id="innerLoginWindow" class="popup login-popup" style="display:none; '+
			'z-index: 25550; position:absolute; top: '+verticalPosition+'px; '+
			horizontalPosition+' "><div class="popup-wrapper">'+
			'<p class="popup-close"><a href="javascript:void(0);" onClick="javascript:hideLoginWindow();">Close</a></p>'+
			'<h2>Existing Users:</h2><div id="loginArea">'+		
			getLoginArea()+
			'</div></div></div>');							
	}	
	Element.show('innerLoginWindow');

}

function showReactivationWindow(email) {
	Element.update('loginUpperArea',getReactivationArea(email));
}

function showResetPasswordWindow() {
	Element.update('loginUpperArea',getResetPasswordArea());
}

function getRegister() {
	return '<h2>New Users:</h2>'+
	'<p><input value="Register" id="submitButton" type="button" onClick="javascript:document.location.href=\''+registerURL+'\'"/></p>';
}

function getReactivationArea(email) {
	return '<p><label for="newemail">Resend activation:</label> <input type="text" id="newemail" name="newemail" style="width: 100%" value="'+email+'"/></p>'+
	'<p><input value="Resend" type="button" onClick="doReactivate(true)"/></p></div>';
}

function getResetPasswordArea() {
	return '<p><label for="email">Email:</label> <input type="text" id="email" name="email" style="width: 100%" /></p>'+
	'<p><input value="Send" type="button" onClick="doResetPassword()"/></p></div>';
}


function getLoginArea() {
	return '<div id="loginUpperArea">'+
	'<p><label for="username">Email:</label> <input type="text" id="username" name="username" style="width: 100%" /></p>'+
	'<p><label for="password">Password:</label> <input type="password" id="password" name="password" style="width: 100%" onkeydown="if ((event.which && event.which == 13)||(event.keyCode && event.keyCode == 13)){doLogin();return false;} else return true;"/></p>'+
	'<p><input value="Login" type="button" onClick="doLogin()"/></p></div>'+
	'<div style="display:none; text-align: left;" id="loginMessage"></div>'+
	getRegister();
}

function hideLoginWindow() {
	Element.hide('innerLoginWindow');	
	Element.hide('loginWindow');
	loginWindowActive = false;
}

function doReactivate(newEmail) {
	var handlerFunc = function(t) {
		var response = trim(t.responseText);
		if (response.substring(0,6)=='error:') {
			Element.update('loginMessage',response.substring(6,response.length));
		}
		else {
		 	Element.update('loginMessage',response);
		 	setTimeout('hideLoginWindow()',3000);		 	
		}
	}
	
	var errFunc = function(t) {
	    alert('Error ' + t.status + ' -- ' + t.statusText);
	}
	
	Element.update('loginMessage','Sending request ...');		
	Element.show('loginMessage');	
	if (newEmail) {
		var tempValue = $(('newemail')).value;
		$(('newemail')).value = '';
		$(('newemail')).value = tempValue;	
		new Ajax.Request(reactivateURL, 
			{method:'post', 
			parameters:'newAddress=true&email='+fullEscape($(('newemail')).value), 
			onSuccess:handlerFunc, onFailure:errFunc});
	}
	else {
		new Ajax.Request(reactivateURL, 
			{method:'post', 
			parameters:'', 
			onSuccess:handlerFunc, onFailure:errFunc});
	}
}

function doResetPassword() {
	var handlerFunc = function(t) {
		var response = trim(t.responseText);
		if (response.substring(0,6)=='error:') {
			Element.update('loginMessage',response.substring(6,response.length));
		}
		else if (response.substring(0,2)=='ok') {
		 	Element.update('loginMessage','<p>Email sent</p>');
		 	setTimeout('hideLoginWindow()',3000);
		}
	}
	
	var errFunc = function(t) {
	    alert('Error ' + t.status + ' -- ' + t.statusText);
	}
	
	Element.update('loginMessage','Sending request ...');		
	Element.show('loginMessage');
	var tempValue = $(('email')).value;
	$(('email')).value = '';
	$(('email')).value = tempValue;	
	new Ajax.Request(reserpasswordURL, 
		{method:'post', 
		parameters:'email='+fullEscape($(('email')).value), 
		onSuccess:handlerFunc, onFailure:errFunc});
}

function doLogin() {
	var handlerFunc = function(t) {
		var response = trim(t.responseText);
		if (response.substring(0,6)=='error:') {
			Element.update('loginMessage',response.substring(6,response.length));
		}
		else if (response.substring(0,2)=='ok') {
		 	Element.update('loginMessage','<p>Login ok<p>');	
			loggedIn = true;
			loginWidget = response.substring(3,response.length);
			decoratePage();
		 	hideLoginWindow();
		 	action();
		}
	}
	
	var errFunc = function(t) {
	    alert('Error ' + t.status + ' -- ' + t.statusText);
	}
	
	Element.update('loginMessage','Sending request ...');		
	Element.show('loginMessage');
	var tempValue = $(('username')).value;
	$(('username')).value = '';
	$(('username')).value = tempValue;
	var tempValue = $(('password')).value;
	$(('password')).value = '';
	$(('password')).value = tempValue;
	new Ajax.Request(loginURL, 
		{method:'post', 
		parameters:'username='+fullEscape($(('username')).value)+'&password='+fullEscape($(('password')).value) + '&language=' + loginLanguage, 
		onSuccess:handlerFunc, onFailure:errFunc});
}


function decoratePage() {
	if (document.getElementById('mainLoginArea')!=null) {
		Element.update('mainLoginArea',loginWidget);
	}
	if (document.getElementById('mainCommunitiesArea')!=null) {
		DWRActionUtil.execute({namespace: '/widgets', action: 'communityWidget', executeResult: 'true'}, {}, updateCommunityWidget);
	}
	
}

function updateCommunityWidget(text){
	if(text != "") {
		var communityWidget = document.getElementById('communities');
		if(communityWidget){
			communityWidget.innerHTML = text;
		}
	}
}


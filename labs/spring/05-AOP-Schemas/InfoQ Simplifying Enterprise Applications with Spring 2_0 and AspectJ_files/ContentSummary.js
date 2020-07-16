var ContentSummary = {
	switchTab : function(tabName) {
		document.getElementById('selectedTab').value=tabName;
		document.getElementById('startIndex').value = '-99999';
		this.updateContent();
	},
	
	setStartIndex : function(index) {
		document.getElementById('startIndex').value = index;
		this.updateContent();
	},
	
	updateBanner : function() {
		//this.setErrorHandler();
		var emptyParams= {};
		try {
			DWRActionUtil.execute({namespace: '/ads', action: 'skyscraper', executeResult: 'true'}, emptyParams, renderBanner);
		} catch(err) {};
	},
	
	updateAds : function() {
		// this.setErrorHandler();
		var emptyParams= {};
		try {
			if(document.getElementById('textlinksparagraph') != null) {
				DWRActionUtil.execute({namespace: '/ads', action: 'homepageads', executeResult: 'true'}, emptyParams, renderTextLinks);
			}
			if(document.getElementById('leftbartextlinks') != null) {
				DWRActionUtil.execute({namespace: '/ads', action: 'textlinks', executeResult: 'true'}, emptyParams, renderLeftbarTextLinks);
			}
		} catch(err) {};
	},
	
	updateContent : function() {
		// this.setErrorHandler();
		DWRErrorHandlerUtil.setNoErrorReporterHandler();
		this.updateBanner();
		this.updateAds();
		
		try {
			DWRActionUtil.execute({namespace: '/', action: 'rightbar', executeResult: 'true'}, 'tabstateform', doOnResult, "Loading...");
		} catch(err) {};
	},
	
	setSelectedTab : function() {
		var tabs= document.getElementById('tabsmenu').getElementsByTagName('LI');
		for(var i= 0; i < tabs.length; i++) {
			if(tabs[i].className.indexOf("-on") != -1) {
				tabs[i].className= tabs[i].className.replace(/-on/, "-off");
			}
		}
		// set the active one
		var selectedTabName = document.getElementById('selectedTab').value;
		document.getElementById('tab_' + selectedTabName).className='m-'+selectedTabName+'-on';
	}
/*	
	setErrorHandler : function() {
		DWREngine.setErrorHandler(dummyErrorHandler);
	},
	
	resetErrorHandler : function() {
		DWREngine.setErrorHandler(DWREngine.defaultMessageHandler);
	}
*/
};

/** tab content update */
function doOnResult(text) {
	if(text != "" && document.getElementById('rightbarcontentbox') != null) {
		document.getElementById('rightbarcontentbox').innerHTML = text;
		ContentSummary.setSelectedTab();
	}
	
	// ContentSummary.resetErrorHandler();
	DWRErrorHandlerUtil.resetErrorHandler();
}

/** banner update */
function renderBanner(text) {
	if(text != "" && document.getElementById('bannerparagraph') != null) {
		document.getElementById('bannerparagraph').innerHTML = text;
	}
}

/** textlinks update */
function renderTextLinks(text) {
	if(text != "" && document.getElementById('textlinksparagraph') != null) {
		document.getElementById('textlinksparagraph').innerHTML = text;
	}
}
/** leftbar textlinks update */
function renderLeftbarTextLinks(text) {
	if(text != "" && document.getElementById('leftbartextlinks') != null) {
		document.getElementById('leftbartextlinks').innerHTML = text;
	}
}
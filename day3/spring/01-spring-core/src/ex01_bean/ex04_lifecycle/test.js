function saveCoupons(){
    console.log("Inside save button");
    var table = document.getElementById('ctab');
   
    for (var r = 0, n = table.rows.length; r < n; r++) {
        for (var c = 0, m = table.rows[r].cells.length; c < m; c++) {
            if(c == 0){
                timeStamp =  "{ \"date\" : \"" + myDate + " "+ table.rows[r].cells[c].innerHTML+ ".000" +"\","
                bData = bData + timeStamp ;
            }
            if(c==1){
                bData = bData + "\"cType\" : \"" + "type3" + "\","
                bData = bData + "\"cValue\" : \"" + table.rows[r].cells[c].innerHTML + "\" },"
            }
            if(c==2){
               bData = bData + timeStamp + "\"cType\" : \"" + "type1" + "\","
               bData = bData + "\"cValue\" : \"" + table.rows[r].cells[c].innerHTML + "\" },"
            }
            if(c==3){
               bData = bData + timeStamp + "\"cType\" : \"" + "type2" + "\","
               bData = bData + "\"cValue\" : \"" + table.rows[r].cells[c].innerHTML + "\" }"
            }
        }
        if(r < n-1)
        {
             bData = bData + ","
        }
    }

    var fullJSON = bFirst + bData + bLast ;
    UserService.potsCoupons(fullJSON).then(function(value) {
        console.log(value.data);
        if (value.data == "200")
        {
            alert("Value Saved")
        }
        else
        {
            alert("Failed to Save Data");
        }
    }, function(reason) {
        console.log("error occured");
    }, function(value) {
        console.log("no callback");
    });
}
function editField(id, BOARDID, TRADEDATE, SHORTNAME, SECID, NUMTRADES, VALUE, OPEN,
                   LOW, HIGH, LEGALCLOSEPRICE, WAPRICE, CLOSE, VOLUME,
                   MARKETPRICE2, MARKETPRICE3,ADMITTEDQUOTE,MP2VALTRD6,MARKETPRICE3TRADESVALUE,
                   ADMITTEDVALUE,WAVAL) {

    document.getElementById("id").value = id;
    document.getElementById("BOARDID").value = BOARDID;
    document.getElementById("TRADEDATE").value = TRADEDATE;
    document.getElementById("SHORTNAME").value = SHORTNAME;
    document.getElementById("SECID").value = SECID;
    document.getElementById("NUMTRADES").value = NUMTRADES;
    document.getElementById("VALUE").value = VALUE;
    document.getElementById("OPEN").value = OPEN;
    document.getElementById("LOW").value = LOW;
    document.getElementById("HIGH").value = HIGH;
    document.getElementById("LEGALCLOSEPRICE").value = LEGALCLOSEPRICE;
    document.getElementById("WAPRICE").value = WAPRICE;
    document.getElementById("CLOSE").value = CLOSE;
    document.getElementById("VOLUME").value = VOLUME;
    document.getElementById("MARKETPRICE2").value = MARKETPRICE2;
    document.getElementById("MARKETPRICE3").value = MARKETPRICE3;
    document.getElementById("ADMITTEDQUOTE").value = ADMITTEDQUOTE;
    document.getElementById("MP2VALTRD6").value = MP2VALTRD6;
    document.getElementById("MARKETPRICE3TRADESVALUE").value = MARKETPRICE3TRADESVALUE;
    document.getElementById("admittedvalue").value = ADMITTEDVALUE;
    document.getElementById("waval").value = WAVAL;

    document.getElementById("form").action = '/history/update';
    document.getElementById("button").innerText = 'Change';


    if (!document.getElementById('cancel')) {
        var btn = document.createElement('button');
        btn.name = 'cancel';
        btn.id = 'cancel';
        btn.innerText = 'Cancel';
        btn.type = 'button';
        btn.onclick = cancelBtn;

        document.getElementById("space").appendChild(btn);
    }
}


function cancelBtn() {
    document.getElementById("id").value = "";
    document.getElementById("BOARDID").value =  "";
    document.getElementById("TRADEDATE").value =  "";
    document.getElementById("SHORTNAME").value =  "";
    document.getElementById("SECID").value =  "";
    document.getElementById("NUMTRADES").value =  "";
    document.getElementById("VALUE").value =  "";
    document.getElementById("OPEN").value =  "";
    document.getElementById("LOW").value =  "";
    document.getElementById("HIGH").value =  "";
    document.getElementById("LEGALCLOSEPRICE").value =  "";
    document.getElementById("WAPRICE").value =  "";
    document.getElementById("CLOSE").value =  "";
    document.getElementById("VOLUME").value =  "";
    document.getElementById("MARKETPRICE2").value =  "";
    document.getElementById("MARKETPRICE3").value =  "";
    document.getElementById("ADMITTEDQUOTE").value =  "";
    document.getElementById("MP2VALTRD").value =  "";
    document.getElementById("MARKETPRICE3TRADESVALUE").value =  "";
    document.getElementById("admittedvalue").value =  "";
    document.getElementById("waval").value =  "";

    document.getElementById("form").action = '/history/create';
    document.getElementById("button").innerText = 'Save';

    document.getElementById('cancel').remove();
}
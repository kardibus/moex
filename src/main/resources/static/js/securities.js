function editField(id, secid, shortname, regnumber, name, isin, is_traded, emitent_id,
                   emitent_title, emitent_inn, emitent_okpo, gosreg, type, group_,
                   primary_boardid, marketprice_boardid) {
    document.getElementById("id").value = id;
    document.getElementById("secid").value = secid;
    document.getElementById("shortname").value = shortname;
    document.getElementById("regnumber").value = regnumber;
    document.getElementById("name").value = name;
    document.getElementById("isin").value = isin;
    document.getElementById("is_traded").value = is_traded;
    document.getElementById("emitent_id").value = emitent_id;
    document.getElementById("emitent_title").value = emitent_title;
    document.getElementById("emitent_inn").value = emitent_inn;
    document.getElementById("emitent_okpo").value = emitent_okpo;
    document.getElementById("gosreg").value = gosreg;
    document.getElementById("type").value = type;
    document.getElementById("group_").value = group_;
    document.getElementById("primary_boardid").value = primary_boardid;
    document.getElementById("marketprice_boardid").value = marketprice_boardid;

    document.getElementById("form").action = '/securities/update';
    document.getElementById("button").innerText = 'Change';


    if (!document.getElementById('cancel')) {
        var btn = document.createElement('button');//создаём нашу кнопку
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
    document.getElementById("secid").value = "";
    document.getElementById("shortname").value = "";
    document.getElementById("regnumber").value = "";
    document.getElementById("name").value = "";
    document.getElementById("isin").value = "";
    document.getElementById("is_traded").value = "";
    document.getElementById("emitent_id").value = "";
    document.getElementById("emitent_title").value = "";
    document.getElementById("emitent_inn").value = "";
    document.getElementById("emitent_okpo").value = "";
    document.getElementById("gosreg").value = "";
    document.getElementById("type").value = "";
    document.getElementById("group_").value = "";
    document.getElementById("primary_boardid").value = "";
    document.getElementById("marketprice_boardid").value = "";

    document.getElementById("form").action = '/securities/create';
    document.getElementById("button").innerText = 'Save';

    document.getElementById('cancel').remove();

}

function checkInputName() {
    let x = document.forms["form"]["name"];
    let reg = /^[а-яА-ЯёЁ0-9\s]+$/;
    let result = reg.test(x.value);
    if (!result) {
        x.setAttribute("style", "border-color:rgb(255,0,0)");
        document.getElementById("button").disabled = true;
    } else {
        x.setAttribute("style", "border-color:rgb(118,118,118)");
        document.getElementById("button").disabled = false;
    }
    console.log(result);
}

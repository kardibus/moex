<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="/css/securities.css" type="text/css"/>
</head>
<body>
<form method="post" action="/securities/create" name="form" id="form">
    <div class="bblock" style="margin: 10px">
        <label >id</label>
        <input type="text" name="id" id="id">

        <label >secid</label>
        <input type="text" name="secid" id="secid">

        <label >shortname</label>
        <input type="text" name="shortname" id="shortname">

        <label >regnumber</label>
        <input type="text" name="regnumber" id="regnumber">

        <label >name</label>
        <input type="text" name="name" id="name" onchange="checkInputName()">

        <label >isin</label>
        <input type="text" name="isin" id="isin">

        <label >is_traded</label>
        <input type="text" name="is_traded" id="is_traded">
    </div>

    <div class="bblock" style="margin: 10px">
        <label >emitent_id</label>
        <input type="text" name="emitent_id" id="emitent_id">

        <label >emitent_title</label>
        <input type="text" name="emitent_title" id="emitent_title">

        <label >emitent_inn</label>
        <input type="text" name="emitent_inn" id="emitent_inn">

        <label >emitent_okpo</label>
        <input type="text" name="emitent_okpo" id="emitent_okpo">

        <label >gosreg</label>
        <input type="text" name="gosreg" id="gosreg">

        <label >type</label>
        <input type="text" name="type" id="type">
    </div>

    <div class="bblock" style="margin: 10px" id="space">
        <label >group_</label>
        <input type="text" name="group_" id="group_">

        <label >primary_boardid</label>
        <input type="text" name="primary_boardid" id="primary_boardid">

        <label >marketprice_boardid</label>
        <input type="text" name="marketprice_boardid" id="marketprice_boardid">

        <button type="submit" id="button">Save</button>

    </div>

</form>
<table border="1" width="70%" cellpadding="1">
    <thead>
    <tr>
        <th>Id</th>
        <th>secid</th>
        <th>shortname</th>
        <th>regnumber</th>
        <th>name</th>
        <th>isin</th>
        <th>is_traded</th>
        <th>emitent_id</th>
        <th>emitent_title</th>
        <th>emitent_inn</th>
        <th>emitent_okpo</th>
        <th>gosreg</th>
        <th>type</th>
        <th>group_</th>
        <th>primary_boardid</th>
        <th>marketprice_boardid</th>
    </tr>
    </thead>
    <tbody>
    <#list securities as sec>
        <tr>
            <th>${sec.id?string.computer}</th>
            <th>${sec.secid}</th>
            <th>${sec.shortname}</th>
            <th>${sec.regnumber}</th>
            <th>${sec.name}</th>
            <th>${sec.isin}</th>
            <th>${sec.is_traded}</th>
            <th>${sec.emitent_id}</th>
            <th>${sec.emitent_title}</th>
            <th>${sec.emitent_inn}</th>
            <th>${sec.emitent_okpo}</th>
            <th>${sec.gosreg}</th>
            <th>${sec.type}</th>
            <th>${sec.group_}</th>
            <th>${sec.primary_boardid}</th>
            <th>${sec.marketprice_boardid}</th>
            <th>
                <form method="post" action="/securities/delete/${sec.secid}" enctype="multipart/form-data">
                    <button type="submit" >Delete</button>
                </form>
            </th>
            <th>
                    <button type="submit" id="edit" onclick="editField('${sec.id?string.computer}','${sec.secid}','${sec.shortname}',
                            '${sec.regnumber}','${sec.name}','${sec.isin}','${sec.is_traded}',
                            '${sec.emitent_id}','${sec.emitent_title}','${sec.emitent_inn}',
                            '${sec.emitent_okpo}','${sec.gosreg}','${sec.type}','${sec.group_}',
                            '${sec.primary_boardid}','${sec.marketprice_boardid}')">Edit</button>
            </th>
        </tr>
    </#list>
    </tbody>
</table>
<script src="js/securities.js"></script>
</body>
</html>
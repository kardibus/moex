<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form method="post" action="/history/create" name="form" id="form">
    <div class="bblock" style="margin: 10px">
        <label>id</label>
        <input type="text" name="id" id="id">

        <label>BOARDID</label>
        <input type="text" name="BOARDID" id="BOARDID">

        <label>TRADEDATE</label>
        <input type="text" name="TRADEDATE" id="TRADEDATE">

        <label>SHORTNAME</label>
        <input type="text" name="SHORTNAME" id="SHORTNAME">

        <label>SECID</label>
        <input type="text" name="SECID" id="SECID">

        <label>NUMTRADES</label>
        <input type="text" name="NUMTRADES" id="NUMTRADES">

        <label>VALUE</label>
        <input type="text" name="VALUE" id="VALUE">
    </div>

    <div class="bblock" style="margin: 10px">
        <label>OPEN</label>
        <input type="text" name="OPEN" id="OPEN">

        <label>LOW</label>
        <input type="text" name="LOW" id="LOW">

        <label>HIGH</label>
        <input type="text" name="HIGH" id="HIGH">

        <label>LEGALCLOSEPRICE</label>
        <input type="text" name="LEGALCLOSEPRICE" id="LEGALCLOSEPRICE">

        <label>WAPRICE</label>
        <input type="text" name="WAPRICE" id="WAPRICE">

        <label>CLOSE</label>
        <input type="text" name="CLOSE" id="CLOSE">
    </div>
    <div class="bblock" style="margin: 10px">
        <label>VOLUME</label>
        <input type="text" name="VOLUME" id="VOLUME">

        <label>MARKETPRICE2</label>
        <input type="text" name="MARKETPRICE2" id="MARKETPRICE2">

        <label>MARKETPRICE3</label>
        <input type="text" name="MARKETPRICE3" id="MARKETPRICE3">

        <label>ADMITTEDQUOTE</label>
        <input type="text" name="ADMITTEDQUOTE" id="ADMITTEDQUOTE">

    </div>

    <div class="bblock" style="margin: 10px" id="space">
        <label>MP2VALTRD</label>
        <input type="text" name="MP2VALTRD" id="MP2VALTRD">

        <label>MARKETPRICE3TRADESVALUE</label>
        <input type="text" name="MARKETPRICE3TRADESVALUE" id="MARKETPRICE3TRADESVALUE">

        <label>admittedvalue</label>
        <input type="text" name="admittedvalue" id="admittedvalue">

        <label>waval</label>
        <input type="text" name="waval" id="waval">

        <button type="submit" id="button">Save</button>
    </div>
</form>

<table border="1" width="70%" cellpadding="1">
    <thead>
    <tr>
        <th>Id</th>
        <th>BOARDID</th>
        <th>TRADEDATE</th>
        <th>SHORTNAME</th>
        <th>SECID</th>
        <th>NUMTRADES</th>
        <th>VALUE</th>
        <th>OPEN</th>
        <th>LOW</th>
        <th>HIGH</th>
        <th>LEGALCLOSEPRICE</th>
        <th>WAPRICE</th>
        <th>CLOSE</th>
        <th>VOLUME</th>
        <th>MARKETPRICE2</th>
        <th>MARKETPRICE3</th>
        <th>ADMITTEDQUOTE</th>
        <th>MP2VALTRD</th>
        <th>MARKETPRICE3TRADESVALUE</th>
        <th>ADMITTEDVALUE</th>
        <th>WAVAL</th>
    </tr>
    </thead>
    <tbody>
    <#list history as his>
        <tr>
            <th>${his.id}</th>
            <th>${his.BOARDID}</th>
            <th>${his.TRADEDATE?iso_utc}</th>
            <th>${his.SHORTNAME}</th>
            <th>${his.secid.secid}</th>
            <th>${his.NUMTRADES}</th>
            <th>${his.VALUE}</th>
            <th>${his.OPEN}</th>
            <th>${his.LOW}</th>
            <th>${his.HIGH}</th>
            <th>${his.LEGALCLOSEPRICE}</th>
            <th>${his.WAPRICE}</th>
            <th>${his.CLOSE}</th>
            <th>${his.VOLUME}</th>
            <th>${his.MARKETPRICE2}</th>
            <th>${his.MARKETPRICE3}</th>
            <th>${his.ADMITTEDQUOTE}</th>
            <th>${his.MP2VALTRD}</th>
            <th>${his.MARKETPRICE3TRADESVALUE}</th>
            <th>${his.ADMITTEDVALUE}</th>
            <th>${his.WAVAL}</th>
            <th>
                <form method="post" action="/history/delete/${his.id}" enctype="multipart/form-data">
                    <button type="submit">Delete</button>
                </form>
            </th>
            <th>
                <button type="submit" id="edit" onclick="editField('${his.id}','${his.BOARDID}','${his.TRADEDATE?iso_utc}',
                        '${his.SHORTNAME}','${his.secid.secid}','${his.NUMTRADES}','${his.VALUE}','${his.OPEN}',
                        '${his.LOW}','${his.HIGH}','${his.LEGALCLOSEPRICE}','${his.WAPRICE}','${his.CLOSE}',
                        '${his.VOLUME}','${his.MARKETPRICE2}','${his.MARKETPRICE3}','${his.ADMITTEDQUOTE}','${his.MP2VALTRD}','${his.MARKETPRICE3TRADESVALUE}',
                        '${his.ADMITTEDVALUE}','${his.WAVAL}')">Edit</button>
            </th>
        </tr>
        </tr>
    </#list>
    </tbody>
</table>
</body>
<script src="/js/history.js"></script>
</html>
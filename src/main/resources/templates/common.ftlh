<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form method="post" action="/common/">
    <p><b>Search</b></p>
    <p><input name="itemRow" id="emt" type="radio" onclick="radioText()" value="emitent_title" checked>emitent_title</p>
    <p><input name="itemRow" id="trd" type="radio" onclick="radioDate()" value="tradedate">tradedate</p>
    <p><input name="filter" id="filter" type="text" > filter</p>
    <p><input type="submit" value="Select"></p>
</form>
<table  border="1" width="100%" cellpadding="5">
    <thead>
    <tr>
        <th>secid</th>
        <th>regnumber</th>
        <th>name</th>
        <th>emitent_title</th>
        <th>tradedate</th>
        <th>open</th>
        <th>close</th>
        <th>numtrades</th>
    </tr>
    </thead>
    <tbody>
    <#list common as com>
    <tr>
    <th>${com.secid}</th>
    <th>${com.regnumber}</th>
    <th>${com.name}</th>
    <th>${com.emitent_title}</th>
    <th>${com.tradedate}</th>
    <th>${com.open}</th>
    <th>${com.close}</th>
    <th>${com.numtrades}</th>
    </tr>
    </#list>
    </tbody>
</table>
</body>
<script src="/js/secHisCom.js"></script>
</html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
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
</html>
# Сервис для работы с Московской биржей

## Пример работы с Api

> ### GET ALL
 
    let response = await fetch('http://localhost:8888/api/history/', { 
    method: 'GET',
    headers: {
    'Content-Type': 'application/json;charset=utf-8'
    },
    });

    let result = await response.json();
    console.log(result);

> ### CREATE

    let history = {
    "tradedate": "2020-04-15",
    "low": "133.5",
    "legalcloseprice": "134.5",
    "high": "136.5",
    "close": "134.5",
    "value": "734875",
    "boardid": "TQBR",
    "open": "135.5",
    "volume": "5440",
    "secid": "ABRD",
    "numtrades": "171",
    "shortname": "АбрауДюрсо",
    "waprice": "135",
    "marketprice2": "135",
    "waval": "",
    "mp2VALTRD": "734875",
    "marketprice3": "135",
    "admittedquote": "134.5",
    "admittedvalue": "734875",
    "marketprice3TRADESVALUE": "734875"
    };

    let response = await fetch('http://localhost:8888/api/history/', {
    method: 'POST',
    headers: {
    'Content-Type': 'application/json;charset=utf-8'
    },
    body: JSON.stringify(history)
    });

    let result = await response.json();
    console.log(result);

> ### SEARCH

    let response = await fetch('http://localhost:8888/api/history/{id}', { 
    method: 'GET',
    headers: {
    'Content-Type': 'application/json;charset=utf-8'
    },
    });

    let result = await response.json();
    console.log(result);

> ### DELETE

    let response = await fetch('http://localhost:8888/api/history/{id}', { 
    method: 'DELETE',
    headers: {
    'Content-Type': 'application/json;charset=utf-8'
    },
    });

    let result = await response.json();
    console.log(result);

> ### UPDATE

    let history = {
    "tradedate": "1",
    "low": "1",
    "legalcloseprice": "1",
    "high": "1",
    "close": "1",
    "value": "1",
    "boardid": "TQBR",
    "open": "1",
    "volume": "1",
    "secid": "ABRD",
    "numtrades": "1",
    "shortname": "АбрауДюрсо",
    "waprice": "1",
    "marketprice2": "1",
    "waval": "",
    "mp2VALTRD": "1",
    "marketprice3": "1",
    "admittedquote": "1",
    "admittedvalue": "1",
    "marketprice3TRADESVALUE": "1"
    };

    let response = await fetch('http://localhost:8888/api/history/{id}', {
    method: 'PUT',
    headers: {
    'Content-Type': 'application/json;charset=utf-8'
    },
    body: JSON.stringify(history)
    });

    let result = await response.json();
    console.log(result);

## Описание Приложения

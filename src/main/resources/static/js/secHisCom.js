function radioDate(){
    var dateInput = document.getElementById("filter");
    dateInput.type ="date";
    dateInput.value =  new Date().toISOString().substring(0, 10);
}

function radioText(){
  var textInput =  document.getElementById("filter");
  textInput.type = "text";
  textInput.value = "";
}
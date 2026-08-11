function myFunction() {
    var input = document.getElementById("myInput").value;
    alert("You entered: " + input);
}

function myOverFunction() {
    alert("Mouse is over the input field!");
}

function myEnterFunction() {
    alert("Mouse has entered the input field!");
}

function myLeaveFunction() {
    alert("Mouse has left the input field!");
}
//
function displayInput(event){
    event.preventDefault();//Preventing the default form submission behavior
    var input1 = document.getElementById("myInput").value;
    var input2 = document.getElementById("myInput1").value;

    console.log("Input 1: " + input1);
    console.log("Input 2: " + input2);
    return true;
}

function displayFirstName(event) {

    var firstName = document.getElementById("myInput").value;
    console.log("First Name: " + firstName);    
}
   
function displayLastName(event) {
    var lastName = document.getElementById("myInput1").value;
    console.log("Last Name: " + lastName);    
}
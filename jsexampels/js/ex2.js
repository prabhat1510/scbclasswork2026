//Function to display a message in the console without any parameters
function displayMessage() {
    const message = "Hello, World!";
    console.log(message);
}

//Function to display a message in the console with a parameter
function displayMessageWithParameter(message) {
    console.log(message);
}

//Function to add two numbers and return the result
function addNumbers(num1, num2) {
    return num1 + num2;
}
//Function expression to display a message in the console
let myFunction = function() {
    console.log("This is a function expression.");
}
//Arrow function to display a message in the console
let myArrowFunction = () => {
    console.log("This is an arrow function.");
}

//Named function to display a message in the console
let myNamedFunction = function namedFunction() {
    console.log("This is a named function.");
}


displayMessage(); // Calling the function without any parameters
displayMessageWithParameter("Hello, JavaScript!"); // Calling the function with a parameter
let sum = addNumbers(5, 10);
console.log("The sum of 5 and 10 is: " + sum); // Calling the function to add two numbers and logging the result
myFunction();// Calling the function expression
myArrowFunction(); // Calling the arrow function
myNamedFunction(); // Calling the named function

var x= 'Declared outside the function'; //global variable  
exampleFunction(); // Calling the function to demonstrate variable scope

function exampleFunction() {
    var y="Declared inside the function"; //local variable
    console.log("Inside the function, x: " + x); // Accessing the global variable
    console.log("Inside the function, y: " + y); // Accessing the local variable
}
console.log("Outside the function, x: " + x); // Accessing the global variable
//console.log("Outside the function, y: " + y); // This will throw an error because y is not accessible outside the function

z="Hello All !!!"; // Implicitly declared global variable
//let z;
var z; // Explicitly declared global variable
console.log(z); // Accessing the implicitly declared global variable


let cars=["Toyota", "Honda", "Ford", "Chevrolet"];
for (let i = 0; i < cars.length; i++) {
    console.log(cars[i]); // Accessing each element of the array using a for loop
}   
//Using forEach method to iterate over the array
cars.forEach(function(car) {
    console.log(car); // Accessing each element of the array using forEach method
});

function tableOfEight() {
    for (let i = 1; i <= 10; i++) {
        console.log(`8 x ${i} = ${8 * i}`); // Displaying the multiplication table of 8
    }
}

tableOfEight(); // Calling the function to display the multiplication table of 8

//fibonacci series for 10 numbers : 0 1 1 2 3 5 8 13 21 25
function fibonacciSeries(n) {
    let fib = [0, 1]; // Initializing the first two numbers of the Fibonacci series
    for (let i = 2; i < n; i++) {
        fib[i] = fib[i - 1] + fib[i - 2]; // Calculating the next number in the series
    }
    return fib; // Returning the Fibonacci series
}

let fibSeries = fibonacciSeries(10);
console.log("Fibonacci series for 10 numbers: " + fibSeries.join(", ")); // Displaying the Fibonacci series


const primitiveStr = "Hello"; //This is a primitive string, which is a basic data type in JavaScript.
const objectStr = new String("Hello"); //This was introduced in ES6, and it creates a String object rather than a primitive string.

console.log(typeof primitiveStr);    // "string"
console.log(typeof objectStr);    // "object"
console.log(primitiveStr == objectStr);    // true -- value matches, but types are different
console.log(primitiveStr === objectStr);    // false -- strict equality checks both value and type
console.log("Hello, World!");
var undefinedVariable;
console.log(undefinedVariable); // This will log 'undefined' since the variable is declared but not assigned a value.   
console.log(typeof undefinedVariable); // This will log 'undefined' as well, indicating the type of the variable.
var nullVariable = null;
console.log(nullVariable);
console.log(typeof nullVariable); // This will log 'object', which is a known quirk in JavaScript where null is considered an object type.
var myAge = 25;
console.log(myAge);
console.log(typeof myAge);
var dolphinGoodBye="So long and thanks for all the fish!";
console.log(dolphinGoodBye);
console.log(typeof dolphinGoodBye);
var isIamAlive = true;
console.log(isIamAlive);
console.log(typeof isIamAlive);
var myNameArray = ["Alice", "Bob", "Charlie"];
console.log(myNameArray);
console.log(typeof myNameArray);
console.log(myNameArray[0]); // Accessing the first element of the array
console.log(myNameArray.length); // Getting the length of the array

var dog ={name: "Buddy", breed: "Golden Retriever", age: 5 };
console.log(dog);   
console.log(typeof dog);
console.log(dog.name); // Accessing the 'name' property of the dog object   
console.log(dog.breed); // Accessing the 'breed' property of the dog object
console.log(dog.age); // Accessing the 'age' property of the dog object
console.log(Object.keys(dog)); // Getting the keys of the dog object
console.log(Object.values(dog)); // Getting the values of the dog object
console.log("**************************String manipulation*******************************************")
/**
 * String manipulation
 * 
 */
let sone='Hello,SCB';
console.log(sone.length); // Getting the length of the string
console.log(sone);
let stwo='Welocome to the world of JavaScript';
console.log(stwo.length); // Getting the length of the string
console.log(stwo);
let sthree=`JavaScript is a versatile programming language .It's widely used for web development, allowing developers to create interactive and dynamic web pages.`;
console.log(sthree.length);
console.log(sone.toUpperCase()); // Converting the string to uppercase
console.log(sone.toLowerCase());
console.log(sone.charAt(0)); // Getting the character at index 0
console.log(sone.indexOf('SCB')); // Getting the index of the substring 'SCB' in the string
console.log(sone.replace('SCB', 'World')); // Replacing 'SCB' with 'World' in the string
console.log(sone.split(',')); // Splitting the string into an array using ',' as the delimiter
console.log(sone.substring(0, 5));// Extracting a section of the string from index 0 to 5
console.log(sone.slice(0, 5)); // Extracting a section of the string from index 0 to 5
console.log(sone.trim()); // Removing whitespace from both ends of the string
console.log(sone.startsWith('Hello')); // Checking if the string starts with 'Hello'
console.log(sone.endsWith('SCB')); // Checking if the string ends with 'SCB'
console.log(sone.includes('SCB')); // Checking if the string includes 'SCB'
console.log(sone.concat(' ', "Kindly remain awake !! Don't take any unnecessary risks of getting a mailer")); // Concatenating two strings

let num1 = 10;
let num2=3.14;
console.log(typeof num1);
console.log(typeof num2);
let num3= num1.toString();
console.log(num3);
console.log(typeof num3); // This will log 'string' since num3 is now a string representation of num1
let num4="12345";
let num5=Number(num4);
console.log(num5);
console.log(typeof num5); // This will log 'number' since num5 is now a number representation of num4


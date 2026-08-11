console.log("***********Arrays Examples***********");
var fruits = ["Apple", "Banana", "Cherry", "Date"];
//Accessing array elements using index
console.log("First fruit: " + fruits[0]); // Accessing the first element
console.log("Second fruit: " + fruits[1]); // Accessing the second element

for(let i = 0; i < fruits.length; i++) {
    console.log("Fruit at index " + i + ": " + fruits[i]); // Accessing each element of the array using a for loop
}
console.log("***********Using for...of loop***********");
for(let fruit of fruits) {
    console.log("Fruit: " + fruit); // Accessing each element of the array using for...of loop
}

console.log("***********Using forEach method***********");
fruits.forEach(function(fruit) {
    console.log("Fruit: " + fruit); // Accessing each element of the array using forEach method
});

console.log("***********Adding elements ***********");
fruits.push("Blueberry"); // Adding an element to the end of the array
console.log("Fruit at index 4: " + fruits[4]); // Accessing the newly added element

console.log("***********Removing elements ***********");
fruits.pop();
console.log("After removing the last element, the array is: " + fruits); // Displaying the array after removing the last element
fruits.shift(); // Removing the first element of the array
console.log("After removing the first element, the array is: " + fruits); // Displaying the array after removing the first element  
fruits.unshift("Mango"); // Adding an element to the beginning of the array
console.log("After adding an element to the beginning, the array is: " + fruits); // Displaying the array after adding an element to the beginning

var arr=[24,27,20,12,28];
console.log(arr); // Displaying the original array
arr.sort();
console.log(arr); // Sorting the array in ascending order
arr.reverse()
console.log(arr); // Reversing the array

let numbers = [5, 10,"Good", 15,"Hello", 20, 25,"World", 30];
//"5", "10", "15", "20", "25", "30", "Good", "Hello", "World"
console.log(numbers); // Displaying the original array
numbers.sort(); //10, 15, 20, 25, 30, 5, 'Good', 'Hello', 'World'
console.log(numbers); // Sorting the array with mixed data types
console.log("***********Using find method***********");
var arr1=["HTML","CSS","JavaScript","Python"];
var result = arr1.find(searchTechnology);

function searchTechnology(tech) {
    return tech == "JavaScript"; // Searching for the first element that matches "JavaScript"
}   
console.log(result);


var res =arr1.find((tech) => tech == "Python"); // Using an arrow function to search for the first element that matches "Python"
console.log(res);

var res1 = arr1.find(function(tech) {
    return tech == "CSS"; // Using a regular function to search for the first element that matches "CSS"
});
console.log(res1);

/**
 * Create an array of Strings which contains the values like [“
sTandarD CharTered banK ”] then
replace the array values with corresponding Uppercase values only.
[“STANDARD”,”CHARTERED”,”BANK”]
 */

let arrayOfStrings = ["sTandarD", "CharTered", "banK"];
arrayOfStrings = arrayOfStrings.map(str => str.toUpperCase());
console.log(arrayOfStrings);

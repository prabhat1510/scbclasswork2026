const withArrowFunction = (a, b) => {
    return a + b;
}

const withNormalFunction = function(a, b) {
    return a + b;
}

//calling the functions
console.log(withArrowFunction(2, 3));
console.log(withNormalFunction(2, 3));
let result = withArrowFunction(5, 7);
document.getElementById("demo").innerHTML = result;

let persons=[{firstname: "Alice", lastname: "Smith", age: 30}, {firstname: "Bob", lastname: "Johnson", age: 25}, {firstname: "Charlie", lastname: "Brown", age: 35}];

document.getElementById("demo").innerHTML = persons.map(person => person.firstname +
                 " " + person.lastname + " is " + 
                 person.age + " years old.").join("<br>");
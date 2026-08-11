class Employee{
    constructor(name, age, salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    getName(){
        return this.name;
    }
    
    getSalary(){
        return this.salary;
    }
    getAge()
    {
        return this.age;
    }
    
    toString(){
        return `Employee: ${this.name}, ${this.age}, ${this.salary}`;
    }
}

function start(){
    let emp= new Employee("Alice", 30, 50000);
    document.getElementById("demo").innerHTML = emp.toString();
}

const employee={
    name:"Alice",
    age:30,
    salary:50000
}
//Destructuring
const {name,age,salary} = employee;

const login={
    username:"",
    password:""
}

const {username,password}=login;
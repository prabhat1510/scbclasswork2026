package com.training.oops;

public class Employee {
    int id;
    String name;
    float salary;

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(float salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, float salary) {
        //constructor chaining to avoid repeatation or duplication
        this(id,name);//Here we are calling another constructor within the class
        this.salary = salary;
        //this(salary);//NOT Allowed
        /**this.id = id;
        this.name = name;
        this.salary = salary;*/
    }

    void display(){
        System.out.println(this.id + " " + this.name+ " " + this.salary);
    }
}

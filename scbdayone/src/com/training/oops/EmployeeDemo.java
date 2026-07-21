package com.training.oops;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();//invoking no arg or default constructor
        System.out.println("Employee Name : " + emp.name);
        System.out.println("Employee Salary : " + emp.salary);
        System.out.println("Employee ID : " + emp.id);

        Employee emp2 = new Employee(111,"Bill Clinton",155.5f);
        System.out.println("Employee Name : " + emp2.name);
        emp2=new Employee();
        //Employee.id;
    }
}

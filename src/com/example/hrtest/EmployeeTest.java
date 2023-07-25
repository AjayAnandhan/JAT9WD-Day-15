package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee = new Employee("Ajay", 1, 60000);

        employee.printName();
        employee.printSalary();
    }
}

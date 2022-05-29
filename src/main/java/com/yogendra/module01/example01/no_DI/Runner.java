package com.yogendra.module01.example01.no_DI;

public class Runner {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        employeeService.generateReport();
    }
}

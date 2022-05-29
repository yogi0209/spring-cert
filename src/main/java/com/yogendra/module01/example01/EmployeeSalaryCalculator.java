package com.yogendra.module01.example01;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeSalaryCalculator {

    public void calculateSalary(List<Employee> employeeList) {
        System.out.println("Calculating employee salary !!");
    }

}

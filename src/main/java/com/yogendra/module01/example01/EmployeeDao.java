package com.yogendra.module01.example01;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class EmployeeDao {
    public List<Employee> getEmployeeList() {
        System.out.println("Getting employee list !!");
        return Arrays.asList(new Employee(1, "ABC"), new Employee(2, "XYZ"));
    }
}

package com.yogendra.module01.example01.manual_DI;

import com.yogendra.module01.example01.EmployeeDao;
import com.yogendra.module01.example01.EmployeeSalaryCalculator;
import com.yogendra.module01.example01.PdfReportGenerator;

public class Runner {
    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService(new EmployeeDao(), new EmployeeSalaryCalculator(), new PdfReportGenerator());

        employeeService.generateReport();

    }
}

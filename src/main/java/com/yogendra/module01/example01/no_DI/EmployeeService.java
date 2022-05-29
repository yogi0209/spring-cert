package com.yogendra.module01.example01.no_DI;

import com.yogendra.module01.example01.*;

import java.util.List;

public class EmployeeService {


    public void generateReport() {
        EmployeeDao employeeDao = new EmployeeDao();
        List<Employee> employeeList = employeeDao.getEmployeeList();

        EmployeeSalaryCalculator employeeSalaryCalculator = new EmployeeSalaryCalculator();
        employeeSalaryCalculator.calculateSalary(employeeList);

        PdfReportGenerator pdfReportGenerator = new PdfReportGenerator();

        pdfReportGenerator.generateReport();

    }

}

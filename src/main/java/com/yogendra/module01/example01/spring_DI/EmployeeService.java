package com.yogendra.module01.example01.spring_DI;

import com.yogendra.module01.example01.Employee;
import com.yogendra.module01.example01.EmployeeDao;
import com.yogendra.module01.example01.EmployeeSalaryCalculator;
import com.yogendra.module01.example01.ReportGenerator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeDao employeeDao;
    private final EmployeeSalaryCalculator employeeSalaryCalculator;
    private final ReportGenerator reportGenerator;

    EmployeeService(EmployeeDao employeeDao, EmployeeSalaryCalculator employeeSalaryCalculator, ReportGenerator reportGenerator) {
        this.employeeDao = employeeDao;
        this.employeeSalaryCalculator = employeeSalaryCalculator;
        this.reportGenerator = reportGenerator;
    }

    void generateReport() {
        List<Employee> employeeList = employeeDao.getEmployeeList();
        employeeSalaryCalculator.calculateSalary(employeeList);
        reportGenerator.generateReport();
    }

}

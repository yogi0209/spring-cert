package com.yogendra.module01.example01.spring_DI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = getContext("pdf-reports");

        context.refresh();

        EmployeeService employeeService = context.getBean(EmployeeService.class);

        employeeService.generateReport();

        context.close();
    }

    private static AnnotationConfigApplicationContext getContext(String profile) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles(profile);
        context.register(Configuration.class);
        return context;
    }
}

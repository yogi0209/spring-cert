package com.yogendra.module01.example10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        context.registerShutdownHook();

        PropertyService propertyService = context.getBean(PropertyService.class);
        propertyService.printPropertyValues();
    }
}

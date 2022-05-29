package com.yogendra.module01.example08.annotation;

import com.yogendra.module01.example08.annotation.bean.Bean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Runner.class);
        context.registerShutdownHook();

        context.getBean(Bean1.class);
    }
}

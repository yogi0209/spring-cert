package com.yogendra.module01.example03;

import com.yogendra.module01.example03.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        context.getBean(SpringBean1.class);
        context.close();
    }
}

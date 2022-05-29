package com.yogendra.module01.example09;

import com.yogendra.module01.example09.beans.Bean3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConf.class);
        context.registerShutdownHook();

        //context.getBean(Bean3.class);

    }
}

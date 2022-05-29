package com.yogendra.module01.example08.java;

import com.yogendra.module01.example08.java.beans.Bean1;
import com.yogendra.module01.example08.java.conf.AppConf;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConf.class);
        context.registerShutdownHook();

        context.getBean(Bean1.class);
    }
}

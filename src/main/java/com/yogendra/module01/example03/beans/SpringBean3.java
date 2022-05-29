package com.yogendra.module01.example03.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class SpringBean3 {

    SpringBean3() {
        System.out.println(getClass().getSimpleName() + "::constructor");
    }

    @PreDestroy
    public void destroy() {
        System.out.println(getClass().getSimpleName() + "::destroy");
    }

}

package com.yogendra.module01.example03.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class SpringBean2 {

    SpringBean2() {
        System.out.println(getClass().getSimpleName() + "::constructor");
    }

    @PreDestroy
    public void destroy() {
        System.out.println(getClass().getSimpleName() + "::destroy");
    }

}

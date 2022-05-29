package com.yogendra.module01.example08.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Bean1 {

    @Autowired
    private Bean2 bean2;

    @Autowired
    private Bean3 bean3;

    public Bean1() {
        System.out.println(getClass().getSimpleName() + " :: constructor");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println(String.format("%s post construct with %s %s",
                getClass().getSimpleName(),
                bean2.getClass().getSimpleName(),
                bean3.getClass().getSimpleName()));
        ;
    }

}

package com.yogendra.module01.example08.annotation.bean;

import org.springframework.stereotype.Component;

@Component
public class Bean2 {
    public Bean2() {
        System.out.println(getClass().getSimpleName() + " :: constructor");
    }
}

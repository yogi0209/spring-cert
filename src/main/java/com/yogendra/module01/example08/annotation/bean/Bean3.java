package com.yogendra.module01.example08.annotation.bean;

import org.springframework.stereotype.Component;

@Component
public class Bean3 {
    public Bean3() {
        System.out.println(getClass().getSimpleName() + " :: constructor");
    }
}

package com.yogendra.module01.example09.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(false)
public class Bean1 {
    public Bean1() {
        System.out.println("Creating :: " + getClass().getSimpleName());
    }
}

package com.yogendra.module01.example09.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(true)
public class Bean2 {
    public Bean2() {
        System.out.println("Creating :: " + getClass().getSimpleName());
    }
}

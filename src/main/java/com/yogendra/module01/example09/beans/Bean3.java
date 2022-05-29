package com.yogendra.module01.example09.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bean3 {
    public Bean3() {
        System.out.println("Creating :: " + getClass().getSimpleName());
    }
}

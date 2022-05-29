package com.yogendra.module01.example08.java.beans;

public class Bean1 {

    private Bean2 bean2;
    private Bean3 bean3;

    public Bean1(Bean2 bean2, Bean3 bean3) {
        System.out.println(getClass().getSimpleName() + " :: constructor");
        this.bean2 = bean2;
        this.bean3 = bean3;
    }
}

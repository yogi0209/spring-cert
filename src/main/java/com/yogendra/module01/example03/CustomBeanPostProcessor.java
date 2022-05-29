package com.yogendra.module01.example03;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println(
                String.format("%s:: postProcessBeforeInitialization %s %s",
                        getClass().getSimpleName(), bean.getClass().getSimpleName(), beanName)
        );
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println(
                String.format("%s:: postProcessAfterInitialization %s %s",
                        getClass().getSimpleName(), bean.getClass().getSimpleName(), beanName)
        );
        return bean;
    }

}

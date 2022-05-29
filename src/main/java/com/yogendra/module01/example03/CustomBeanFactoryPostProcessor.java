package com.yogendra.module01.example03;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.Arrays;

public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println(getClass().getSimpleName() + ":: postProcessBeanFactory starts listing beans");
        Arrays.stream(configurableListableBeanFactory.getBeanDefinitionNames()).forEach(item -> System.out.println(item));
        System.out.println(getClass().getSimpleName() + ":: postProcessBeanFactory ends listing beans\n");
    }
}

package com.yogendra.module01.example05.post.processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("postProcessBeanFactory :: listing beans START");
        Arrays.stream(configurableListableBeanFactory.getBeanDefinitionNames()).forEach(item -> System.out.println(item));
        System.out.println("postProcessBeanFactory :: listing beans END\n");
    }
}

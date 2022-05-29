package com.yogendra.module01.example08.java.conf;

import com.yogendra.module01.example08.java.beans.Bean1;
import com.yogendra.module01.example08.java.beans.Bean2;
import com.yogendra.module01.example08.java.beans.Bean3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConf {

    @Bean
    @Autowired
    public Bean1 bean1() {
        return new Bean1(bean2(), bean3());
    }

    @Bean
    public Bean2 bean2() {
        return new Bean2();
    }

    @Bean
    public Bean3 bean3() {
        return new Bean3();
    }

}

package com.yogendra.module01.example05;

import com.yogendra.module01.example05.beans.SpringBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
public class AppConfiguration {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public SpringBean1 springBean1() {
        return new SpringBean1();
    }

}

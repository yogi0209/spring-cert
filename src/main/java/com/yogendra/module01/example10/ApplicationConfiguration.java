package com.yogendra.module01.example10;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan
@PropertySource("classpath:/db.properties")
public class ApplicationConfiguration {
}

package com.yogendra.module01.example10;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyService {

    @Value("${DB}")
    private String db;

    @Value("${DB_NAME}")
    private String dbName;

    @Value("${JAVA_HOME}")
    private String javaHome;

    public void printPropertyValues() {
        System.out.println(
                "DB : " + db + "\n" +
                "DB Name : " + dbName + "\n" +
                "Java Home : " + javaHome + "\n"
        );
    }

}

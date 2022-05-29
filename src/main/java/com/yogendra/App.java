package com.yogendra;

import com.yogendra.module01.example01.no_DI.EmployeeService;
import com.yogendra.module01.example01.PdfReportGenerator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        BigDecimal bd = new BigDecimal("76545675232.232232");

        System.out.println(bd.setScale(2, BigDecimal.ROUND_UP).toEngineeringString());

    }
}

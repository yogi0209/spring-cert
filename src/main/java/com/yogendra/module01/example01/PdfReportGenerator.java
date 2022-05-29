package com.yogendra.module01.example01;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("pdf-reports")
public class PdfReportGenerator implements ReportGenerator {
    public void generateReport() {
        System.out.println("Generating PDF report !!");
    }
}

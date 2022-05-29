package com.yogendra.module01.example02;

import com.yogendra.module01.example02.dao.DatabaseFinancialDaoImpl;
import com.yogendra.module01.example02.service.FinancialReportService;
import com.yogendra.module01.example02.writer.FileStoreReportWriterImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Runner {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = getContext();

        FinancialReportService financialReportService = context.getBean(FinancialReportService.class);

        financialReportService.generateReport();

        context.close();

    }

    private static AnnotationConfigApplicationContext getContext() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Runner.class);
        return context;
    }


}

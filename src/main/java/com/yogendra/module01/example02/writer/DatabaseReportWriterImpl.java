package com.yogendra.module01.example02.writer;

import com.yogendra.module01.example02.ds.FinancialQuarterlySummary;
import com.yogendra.module01.example02.ds.FinancialYearlySummary;
import org.springframework.stereotype.Component;

@Component("database-writer")
public class DatabaseReportWriterImpl implements ReportWriter {
    @Override
    public void writeFinancialYearlySummary(FinancialYearlySummary financialYearlySummary) {
        System.out.println("Database => Writing yearly summary !!");
    }

    @Override
    public void writeFinancialQuarterlySummary(FinancialQuarterlySummary financialQuarterlySummary) {
        System.out.println("Database => Writing quarterly summary !!");
    }
}

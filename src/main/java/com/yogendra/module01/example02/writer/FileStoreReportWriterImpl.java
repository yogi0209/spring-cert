package com.yogendra.module01.example02.writer;

import com.yogendra.module01.example02.ds.FinancialQuarterlySummary;
import com.yogendra.module01.example02.ds.FinancialYearlySummary;
import org.springframework.stereotype.Component;

@Component("fileStore-writer")
public class FileStoreReportWriterImpl implements ReportWriter {
    @Override
    public void writeFinancialYearlySummary(FinancialYearlySummary financialYearlySummary) {
        System.out.println("FileStore => Writing yearly summary !!");
    }

    @Override
    public void writeFinancialQuarterlySummary(FinancialQuarterlySummary financialQuarterlySummary) {
        System.out.println("FileStore => Writing quarterly summary !!");
    }
}

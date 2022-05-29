package com.yogendra.module01.example02.service;

import com.yogendra.module01.example02.dao.FinancialDao;
import com.yogendra.module01.example02.ds.FinancialYearlySummary;
import com.yogendra.module01.example02.writer.ReportWriter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FinancialReportService {
    private final FinancialDao financialDao;
    private final ReportWriter reportWriter;

    public FinancialReportService(@Qualifier("fileStore-dao") FinancialDao financialDao, @Qualifier("fileStore-writer") ReportWriter reportWriter) {
        this.financialDao = financialDao;
        this.reportWriter = reportWriter;
    }

    public void generateReport() {
        FinancialYearlySummary financialYearlySummary = financialDao.getFinancialYearlySummary(2011);
        reportWriter.writeFinancialYearlySummary(financialYearlySummary);
    }

}

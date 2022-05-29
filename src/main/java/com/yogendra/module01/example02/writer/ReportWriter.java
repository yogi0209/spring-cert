package com.yogendra.module01.example02.writer;

import com.yogendra.module01.example02.ds.FinancialQuarterlySummary;
import com.yogendra.module01.example02.ds.FinancialYearlySummary;

public interface ReportWriter {
    void writeFinancialYearlySummary(FinancialYearlySummary financialYearlySummary);

    void writeFinancialQuarterlySummary(FinancialQuarterlySummary financialQuarterlySummary);
}

package com.yogendra.module01.example02.dao;

import com.yogendra.module01.example02.ds.FinancialQuarterlySummary;
import com.yogendra.module01.example02.ds.FinancialYearlySummary;

public interface FinancialDao {
    FinancialYearlySummary getFinancialYearlySummary(int year);

    FinancialQuarterlySummary getFinancialQuarterlySummary(int year, int quarter);
}

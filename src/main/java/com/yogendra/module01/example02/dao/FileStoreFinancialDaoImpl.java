package com.yogendra.module01.example02.dao;

import com.yogendra.module01.example02.ds.FinancialQuarterlySummary;
import com.yogendra.module01.example02.ds.FinancialYearlySummary;
import org.springframework.stereotype.Component;

@Component("fileStore-dao")
public class FileStoreFinancialDaoImpl implements FinancialDao {
    @Override
    public FinancialYearlySummary getFinancialYearlySummary(int year) {
        System.out.println("FileStore => Fetching summary for year " + year);
        return new FinancialYearlySummary();
    }

    @Override
    public FinancialQuarterlySummary getFinancialQuarterlySummary(int year, int quarter) {
        System.out.println("FileStore => Fetching summary for year/quarter " + year + "/" + quarter);
        return new FinancialQuarterlySummary();
    }
}

package com.qa.test;

import java.util.ArrayList;

import com.qa.app.QueryApplication;
import com.qa.core.QueryMap;
import com.qa.core.StockName;

public class MainTest {

	public static void main(String[] args) {
		
		try {
		// Generate Query Map which will have hit count of particular stock
		QueryMap qm = new QueryMap();
		
		qm.add(StockName.AMAZON, System.currentTimeMillis());
		Thread.sleep(10L);
		qm.add(StockName.AMAZON, System.currentTimeMillis());
		qm.add(StockName.TATA, System.currentTimeMillis());
		qm.add(StockName.AMAZON, System.currentTimeMillis());
		qm.add(StockName.TATA, System.currentTimeMillis());
		qm.add(StockName.TESLA, System.currentTimeMillis());
		qm.add(StockName.AMAZON, System.currentTimeMillis());
		qm.add(StockName.TESLA, System.currentTimeMillis());
		
		QueryApplication sh = new QueryApplication(qm);
		System.out.println("No. of Amazon stocks hit in last 10 MS : "+ sh.getCount(StockName.AMAZON, System.currentTimeMillis()-10));
		
		
		ArrayList<String> stocks = sh.getTopKStocks(System.currentTimeMillis()-10, 2);
		System.out.println("Top 2 stocks queried in last 10 MS : ");
		for(String s : stocks) {
			System.out.print(s + " ");
		}
		System.out.println();	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

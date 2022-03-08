package com.qa.test;

import com.qa.compute.StockHit;
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
		
		StockHit sh = new StockHit(qm);
		System.out.println(sh.getCount(StockName.AMAZON, System.currentTimeMillis()-10));
		
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

package com.qa.test;

import com.qa.compute.StockHit;
import com.qa.core.QueryMap;
import com.qa.core.StockName;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueryMap qm = new QueryMap();
		
		qm.add(StockName.AMAZON, System.currentTimeMillis());
		qm.add(StockName.AMAZON, System.currentTimeMillis());
		qm.add(StockName.TATA, System.currentTimeMillis());
		qm.add(StockName.AMAZON, System.currentTimeMillis());
		qm.add(StockName.TATA, System.currentTimeMillis());
		qm.add(StockName.TESLA, System.currentTimeMillis());
		
		StockHit sh = new StockHit();
		System.out.println(sh.getCount(qm,StockName.TATA, System.currentTimeMillis()-10));
		
		
	}

}

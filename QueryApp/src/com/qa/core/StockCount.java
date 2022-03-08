package com.qa.core;

public class StockCount implements Comparable<StockCount>{
	int count;
	StockName sn;
	
	public StockCount(StockName sn, int count) {
		this.sn = sn;
		this.count=count;
	}
	
	
	
	public int getCount() {
		return this.count;
	}
	
	public StockName getName() {
		return this.sn;
	}

	@Override
	public int compareTo(StockCount o) {
		return o.count - this.count;
	}
}

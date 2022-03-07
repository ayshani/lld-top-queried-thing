package com.qa.core;

public class CountList {
	int count;
	long ts;
	
	public CountList(long tss) {
		ts = tss;
		count=1;
	}
	
	public void increaseCount() {
		this.count++;
	}
	
	public long getTimeStamp() {
		return this.ts;
	}
	
	public int getCount() {
		return this.count;
	}
}

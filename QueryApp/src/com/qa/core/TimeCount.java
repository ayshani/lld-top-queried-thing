package com.qa.core;

public class TimeCount {
	int count;
	long ts;
	
	public TimeCount(long tss) {
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

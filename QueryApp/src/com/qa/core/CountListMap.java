package com.qa.core;

import java.util.HashMap;

public class CountListMap {
	private HashMap<Long,Integer> countListMap;
	
	public CountListMap() {
		countListMap = new HashMap<Long,Integer>();
	}
	
	public HashMap<Long,Integer> getCountListMap(){
		return this.countListMap;
	}
	
	public boolean isPresent(long times) {
		if(countListMap.containsKey(times))
			return true;
		return false;
	}
	
	public void addInList(long times) {
		countListMap.put(times, countListMap.getOrDefault(times, 0)+1);
	}
	
	public int getCount(long times) {
		if(isPresent(times))
			return countListMap.get(times);
		return 0;
	}
}

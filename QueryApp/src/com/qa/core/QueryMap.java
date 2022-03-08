package com.qa.core;

import java.util.HashMap;

public class QueryMap {

	private HashMap<StockName, CountListMap> qm;
	
	public QueryMap(){
		qm = new HashMap<StockName, CountListMap>();
	}
	
	public CountListMap getListOf(StockName name){
		if(qm.containsKey(name)) {
			return qm.get(name);
		}
		return null;
	}
	
	public void add(StockName name, long times) {
		CountListMap qmList = getListOf(name);
		if(null == qmList) {
			CountListMap qmlist = new CountListMap();
			qmlist.addInList(times);
			qm.put(name, qmlist);
		} else {
			qmList.addInList(times);
			qm.put(name, qmList);
		}
	}
	
	public HashMap<StockName, CountListMap> getQueryMap() {
		return this.qm;
	}
}

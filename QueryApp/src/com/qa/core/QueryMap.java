package com.qa.core;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class QueryMap {

	HashMap<StockName, HashSet<CountList>> qm;
	
	public QueryMap(){
		qm = new HashMap<StockName, HashSet<CountList>>();
	}
	
	public HashSet<CountList> getListOf(StockName name){
		if(qm.containsKey(name)) {
			return qm.get(name);
		}
		return null;
	}
	
	public void add(StockName name, long times) {
		HashSet<CountList> qmList = getListOf(name);
		if(null == qmList) {
			HashSet<CountList> qmlist = new HashSet<>();
			qmlist.add(new CountList(times));
			qm.put(name, qmlist);
		} else {
			Iterator<CountList> it = qmList.iterator();
			boolean flag = false;
			while (it.hasNext()) {
				CountList cl = it.next();
				if(cl.getTimeStamp() == times) {
					cl.increaseCount();
					flag = true;
					break;
				}
	        }
			if(!flag) {
				qmList.add(new CountList(times));
			}
		}
	}
	
	
}

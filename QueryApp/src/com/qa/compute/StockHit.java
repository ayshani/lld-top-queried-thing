package com.qa.compute;

import java.util.HashSet;
import java.util.Iterator;

import com.qa.core.CountList;
import com.qa.core.QueryMap;
import com.qa.core.StockName;

public class StockHit {

	public int getCount(QueryMap qm, StockName name,long times) {
		int count =0;
		HashSet<CountList> qmList = qm.getListOf(name);
		if(null == qmList) {
			return count;
		} else {
			Iterator<CountList> it = qmList.iterator();
			while (it.hasNext()) {
				CountList cl = it.next();
				if(cl.getTimeStamp() >= times) {
					count+=cl.getCount();
				}
	        }
		}
		return count;
	}
}

package com.qa.compute;

import java.util.Map.Entry;

import com.qa.core.CountListMap;
import com.qa.core.QueryMap;
import com.qa.core.StockName;

public class StockHit {
	QueryMap qm;
	
	public StockHit(QueryMap qm) {
		this.qm = qm;
	}

	public int getCount(StockName name,long times) {
		int count =0;
		CountListMap qmList = qm.getListOf(name);
		if(null == qmList) {
			return count;
		} else {
			for(Entry<Long, Integer> mp : qmList.getCountListMap().entrySet()) {
				if(mp.getKey()>= times) {
					count+=mp.getValue();
				}
			}
		}
		return count;
	}
	
	public void stockFlush() {
		
	}
}

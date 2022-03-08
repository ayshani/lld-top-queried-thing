package com.qa.app;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Map.Entry;

import com.qa.core.CountListMap;
import com.qa.core.QueryMap;
import com.qa.core.StockCount;
import com.qa.core.StockName;

public class QueryApplication {

private QueryMap qm;
	
	public QueryApplication(QueryMap qm) {
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
	
	public ArrayList<String> getTopKStocks(long times, int k){
		ArrayList<String> result = new ArrayList<>();
		PriorityQueue<StockCount> hm = new PriorityQueue<>();
		for(StockName e : StockName.values()) {
			hm.add(new StockCount(e, getCount(e, times)));
		}
		while(k>0) {
			result.add(hm.poll().getName().toString());
			k--;
		}
		return result;
	}
}

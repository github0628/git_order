package com.cattlog.module.sel;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		System.out.println("start with map");
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "张三");
		map.put(2, "张三");
		map.put(3, "张三");
		System.out.println(map.size());
		for (Map.Entry entry : map.entrySet()) {
			             
			             System.out.println("key= " + entry.getKey() + " and value= "
			                     + entry.getValue());
			         }
	}

}

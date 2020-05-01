/**
 * 
 */
package com.zx.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class LinkedHashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap特征：1、无序     2、如果key重复了，会将后添加的数据覆盖之前添加的数据    3、允许key为 null
		HashMap hashMap = new HashMap();
		hashMap.put(null, "jack");
		System.out.println("集合的长度："+hashMap.size());
		
		//LinkedHashMap的特征：1、有序  2、如果key重复了，会将后添加的数据覆盖之前添加的数据 
		Map map = new LinkedHashMap();
		
		map.put(null, 10);
		map.put("0001", "jack");
		map.put("0002", "rose");
       
		map.forEach(new BiConsumer() {

			@Override
			public void accept(Object key, Object value) {
				// TODO Auto-generated method stub
				System.out.println("key:"+key+"   value:"+value);
			}
		});
		
		//利用lambda表达式进行简化
		map.forEach((Object key,Object value)->System.out.println("key:"+key+"   value:"+value));
	}

}

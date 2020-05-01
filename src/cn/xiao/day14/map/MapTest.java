/**
 * 
 */
package com.zx.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import com.zx.set.People;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashMap集合：1、无序     2、key是不能重复的   （所有的map集合  key都不能重复，是否重复判断规则和 Set集合是一样的）
		
		HashMap map = new HashMap();
		
		//通过put方法往map集合中添加数据
		map.put("0001", "软件部");
		map.put("0002", "测试部");
		map.put("0003", "行政部");
		
		
		//调用size方法获取集合的长度
		System.out.println("集合的长度:"+map.size());
		
		//当key重复的时候，会将key相同已添加成功的数据进行替换
		map.put("0003", "销售部");
		System.out.println("集合的长度:"+map.size());
		
		//删除指定的键值对关系，集合的长度会减一
		map.remove("0001");
		
		//获取map集合中所有的value
		Collection values = map.values();
		
		for(Object val : values) {
			System.out.println("val:"+val);
		}
		
		
		//获取map集合中所有的key
		Set keys = map.keySet();
		for(Object key : keys) {
			System.out.println("key:"+key+"   val:"+map.get(key));
		}
		
		
		People p1 = new People("rose",20);
		
		
		map.put(p1, p1);
		
		
		People p2 = new People("rose",20);
		
		//判断key是否存在
		System.out.println("指定的key是否存在:"+map.containsKey(p2));
		
		
		//判断value是否存在
		System.out.println("指定的value是否存在:"+map.containsValue(p2));
		
		//清空集合总所有的元素
		map.clear();
		System.out.println("集合的长度:"+map.isEmpty()+"  size:"+map.size());
	}

}

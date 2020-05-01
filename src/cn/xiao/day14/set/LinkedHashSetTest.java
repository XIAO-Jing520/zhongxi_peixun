/**
 * 
 */
package com.zx.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.Consumer;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class LinkedHashSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// LinkedHashSet集合特点：1、 有序    2、不允许元素重复
		HashSet set = new LinkedHashSet();
		
		String name1 = new String("jack");
		String name2 = new String("jack");
	
		set.add(name1);
		set.add(name2);
		set.add(20);
		set.add('男');
		
		System.out.println("集合的长度:"+set.size());//3
		
		People p1 = new People("rose",20);
		People p2 = new People("rose",20);
		set.add(p1);
		set.add(p2);
		
		
		System.out.println("集合的长度:"+set.size());//
		
		//遍历set集合   1、forEach方式遍历set集合
		for(Object obj : set) {
			System.out.println("set集合中元素:"+obj);
		}
		
		
	
	
	}

}

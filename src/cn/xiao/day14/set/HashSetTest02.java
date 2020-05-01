/**
 * 
 */
package com.zx.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class HashSetTest02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Set集合是怎么判断元素是否重复的
		 *   集合第一步一定先拿对象的hashcode地址看和其他对象的hashCode地址是否一样。
                                      如果一样,再判断两个对象equals是否相等如果相等才认为重复,重复就会去掉，只保留最先的一个。
                                      如果拿对象的hashcode已经不同，集合就认为两个对象没有重复，同时集合也觉得没有必要再判断equals
		 * */
		HashSet set = new HashSet();
		
		String name1 = new String("jack");
		String name2 = new String("jack");
	
		
		
		System.out.println("集合的长度:"+set.size());//3
		
		People p1 = new People("rose",20);
		People p2 = new People("rose",20);
		People p3 = new People("rose",20);
		
		set.add(p1);
		set.add(p2);
		
		set.add(p3);
		
		
		set.add(name1);
		set.add(name2);
		set.add(20);
		set.add('男');
		
		System.out.println("集合的长度:"+set.size());//5
	
	}

}

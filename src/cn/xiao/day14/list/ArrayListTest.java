/**
 * 
 */
package com.zx.list;

import java.util.*;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 创建 List集合的实例    ArrayList集合底层基于数组（数组是有序的）
		 * ArrayList特征:1、有序   2、允许元素重复 
		 * 
		 * */
		ArrayList  list = new ArrayList();
		
		//往集合中添加元素
		list.add("jack");
		list.add(3);
		//list.add("jack");
		//list.add(1, '男');
		
		ArrayList list02 = new ArrayList();
		list02.add("tom");
		list02.add("rose");
		
		//将集合list02中每一个元素添加至集合list中
		list.addAll(list02);
		
		//根据下标获取集合中的元素   第一个元素的下标为 0 同时要防止发生下标越界 IndexOutOfBoundsException
		Object li = list.get(1);
		System.out.println("li:"+li);
		//通过size方法获取集合的长度
		System.out.println("集合的长度:"+list.size());
		
		
		//清空集合中所有元素
		//list.clear();
				
		//调用isEmpty方法判断集合是否为空   true表为 空，为空意味着  size() == 0,并不是对象 == null
		System.out.println("集合是否为空："+list.isEmpty());
		
		//删除指定的元素：如果存在重复的只会删除第一个出现的元素
		//list.remove("jack");
		
		//根据下标删除
		//list.remove(2);
		
		//进行更新操作
		list.set(0, "kebi");
		
		System.out.println("----------------");
		for(int i=0;i<list.size();i++) {
			System.out.println("集合中的元素:"+list.get(i));
		}
		System.out.println("----------------");
		System.out.println("集合的长度:"+list.size());

	}

}

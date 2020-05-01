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
public class HashSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HashSet集合特点：1、 无序    2、不允许元素重复
		HashSet set = new HashSet();
		
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
			//System.out.println("set集合中元素:"+obj);
		}
		
		
	
		//遍历set集合   2、通过调用forEach方法进行遍历
		Cu cu = new Cu();
		set.forEach(cu);
		
		set.forEach(new Consumer() {

			@Override
			public void accept(Object obj) {
				// TODO Auto-generated method stub
				System.out.println("obj:"+obj);
			}
		});
		
		
		set.forEach(obj -> System.out.println("obj:"+obj) );

		System.out.println("---------------");
		/*
		 * 遍历set集合  3、首先调用  iterator方法获取Iterator对象，所的数据都会被封装至Iterator对象中 
		 *          然后调用Iterator对象的相关API 进行数据的操作
		 *                
		 * */
		Iterator its = set.iterator();
		
		
		//调用hasNext  方法用于判断是否存在     hasNext:判断是否存在元素    
		while(its.hasNext()) {
			
            //next方法获取数据并让光标下移
			Object obj = its.next();
			System.out.println("obj:"+obj);
		}
		
		
	
	}

}

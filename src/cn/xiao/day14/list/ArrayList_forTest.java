/**
 * 
 */
package com.zx.list;

import java.util.*;
import java.util.function.Consumer;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class ArrayList_forTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     
		ArrayList  list = new ArrayList();
		
		//往集合中添加元素
		list.add("jack");
		list.add(3);
		list.add("jack");
		list.add(1, '男');
		
		
		
		
		
		//list集合循环
		
		//1、使用for循环	
		for(int i=0;i<list.size();i++) {
			System.out.println("集合中的元素:"+list.get(i));
		}
		System.out.println("--------------------");
		
		//2、使用forEach循环	
		for(Object obj : list) {
			System.out.println("集合中的元素:"+obj);
		}
		
		System.out.println("--------------------");
		
		//3、使用while循环
		int index = 0;
		
		while(index < list.size()) {
			System.out.println("集合中的元素:"+list.get(index++));
		}
		
		System.out.println("--------------------");
		
		//4、用lambda表达式进行相关操作
		list.forEach(new  Consumer() {

			@Override
			public void accept(Object item) {
				// TODO Auto-generated method stub
				System.out.println("集合中的元素:"+item);
			}
			
		});
		
		System.out.println("--------------------");
		list.forEach(item->{System.out.println("集合中的元素:"+item);});
	
	}

}

/**
 * 
 */
package com.zx.linkedList;

import java.util.ArrayDeque;
import java.util.LinkedList;

/**
 * @author 罗春龙 QQ：584614151 V 1.0
 */
public class ArrayDequeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ArrayDeque<String> list = new ArrayDeque<String>();
		list.add("jack");
		list.add("rose");
		list.add("tom");

	

		// 用LinkedList模拟队列结构 队列结构的特点：先进先出
		ArrayDeque<String> queue = new ArrayDeque<String>();
		queue.offer("jack");
		queue.offer("rose");
		queue.offer("tom");

	
		
		
		// 取出元素，不会删除集合中的元素
		String name = queue.peek();
		System.out.println(name + "===集合的长度：" + queue.size());
	

		 //取出元素，删除集合中的元素
		//String name2 = queue.poll();
		//System.out.println(name2 + "===集合的长度：" + queue.size());
		
	

		// 用arrayDeque栈结构 栈结构就像压子弹 ，先进后出
		ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
		arrayDeque.push("jack");
		arrayDeque.push("rose");
		arrayDeque.push("tom");
		
		
		
		String name3 = arrayDeque.pop();
		System.out.println(name3 + "===集合的长度：" + queue.size());
		
		String name4 = arrayDeque.pop();
		System.out.println(name4 + "===集合的长度：" + queue.size());

	}

}

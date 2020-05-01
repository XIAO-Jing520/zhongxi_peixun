/**
 * 
 */
package com.zx.linkedList;

import java.util.LinkedList;

/**
 * @author 罗春龙 QQ：584614151 V 1.0
 */
public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("jack");
		list.add("rose");
		list.add("tom");

		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			//System.out.println(name);
		}

		// 用LinkedList模拟队列结构 队列结构的特点：先进先出
		LinkedList<String> queue = new LinkedList<String>();
		queue.offer("jack");
		queue.offer("rose");
		queue.offer("tom");

	
		
		
		// 取出元素，不会删除集合中的元素
		//String name = queue.peek();
		//System.out.println(name + "===集合的长度：" + queue.size());
	

		 //取出元素，删除集合中的元素
		//String name2 = queue.poll();
		//System.out.println(name2 + "===集合的长度：" + queue.size());
		
	

		// 用LinkedList栈结构 栈结构就像压子弹 ，先进后出
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.push("jack");
		linkedList.push("rose");
		linkedList.push("tom");
		
		
		
		String name3 = linkedList.pop();
		System.out.println(name3 + "===集合的长度：" + queue.size());
		
		String name4 = linkedList.pop();
		System.out.println(name4 + "===集合的长度：" + queue.size());

	}

}

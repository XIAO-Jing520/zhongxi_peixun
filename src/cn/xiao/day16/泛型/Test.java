/**
 * 
 */
package com.zx.泛型;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class Test {


	public static void main(String[] args) {
		
		try {
			List<String>  names = new ArrayList<String>();
			names.add("jack");
			//names.add(10);
			
			//获取集合的class类型
			Class clazz = names.getClass();
			//获取add方法
			Method method = clazz.getMethod("add", Object.class);
			
			method.invoke(names, 10);
			System.out.println("集合的长度:"+names.size());
			
		
		   for(Object obj : names) {
			   System.out.println(obj);
		   }
		   
		   /*整数  10  被成功的加入至集合中，该现象被称之为  泛型的  ‘檫除机制’，也就是指泛型只是在程序的编译阶段会对数据进行检测,程序运行的时候，泛型
		   会被檫除掉 */
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}
	
}

/**
 * 
 */
package com.zx;

import java.io.PrintStream;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 字符窜拼接
 */
public class StringTest02 {
	
	
	public static void main(String[] args) {
		
		
		String name = "select * from tb_user ";
		
		name = name + " where name = 'jack'";
		
		/*
		 * 如上程序执行会创建两个对象，不仅耗内存也耗时间    性能不好
		 * 可以通过StringBuffer 或者  StringBuilder来解决
		 * 
		 * StringBuffer 是线程安全的       相对而言会比StringBuilder性能差一点
		 * StringBuilder 是线程不安全     性能好
		 * 
		 * */
		
		StringBuffer sb = new StringBuffer();
		//sb.append("select * from tb_user");
		//sb.append(" where name = 'jack'");
		sb.append("select * from tb_user").append(" where name = 'jack'");
		
	 
		//获取当前时间的毫秒数表现形式
		long startTime = System.currentTimeMillis();
		StringBuilder str = new StringBuilder();

        str.append("jack");
		for(int i=0;i<100000;i++) {

			str.append(i);
		}

		long endTime = System.currentTimeMillis();
		
		System.out.println("共耗时:"+(endTime - startTime));
	
       
		
		String uName = new String("jack");
		
		String uName2 = new String("jack");
		
		//true
		System.out.println(uName.equals(uName2));
		
		
		StringBuffer sdName = new  StringBuffer();
		sdName.append("jack");
		
		StringBuffer sdName2 = new  StringBuffer();
		sdName2.append("jack");
		
		//false  因为StringBuffer 并没有重写 Object的equals方法，就是使用   Object的equals方法进行比较 ：就是比较内存地址  和 == 效果一样
		System.out.println(sdName.equals(sdName2));
		
		
		//false 因为  uName 和  sdName的数据类型不匹配
		System.out.println(uName.equals(sdName));
		
		//true  因为StringBuffer重写了 toString方法，调用toString之后会返回它的字符窜信息   类型都是  字符窜   内容都是  jack因此结果为 true
		System.out.println(uName.equals(sdName.toString()));
		
		

		
		
	}

}

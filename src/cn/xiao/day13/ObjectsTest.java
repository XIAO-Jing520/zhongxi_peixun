/**
 * 
 */
package com.zx;

import java.io.PrintStream;
import java.util.Objects;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class ObjectsTest {
	
	
	public static void main(String[] args) {
		
	     String name1 = new String("jack");
	     
	     String name2 = new String("jack");
	     
	
	     //比较两个对象是否相等
	     boolean flag = Objects.equals(name1, name2);
	     
	     System.out.println("flag:"+flag);
	     
	     
	     People p1 = new People();
	     p1.setName("jack");
	     
	     People p2 = new People();
	     p2.setName("jack");
	     
	     
	     System.out.println(Objects.equals(p1, p2));
	     
	     //生成哈希码值
	     System.out.println(Objects.hash("jack",20));
	     
	     //判断对象是否为空
	     System.out.println(Objects.isNull(p1));
	     
	     System.out.println(Objects.toString(p1));
	}

}

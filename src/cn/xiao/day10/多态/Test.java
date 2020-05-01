/**
 * 
 */
package com.zx.多态;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		People ps = new Student();
		//执行sing方法的时候，执行的是子类重写过后的sing方法
		ps.sing();
			
		
		People pt = new Teacher();
		//执行sing方法的时候，执行的是子类重写过后的sing方法
		pt.sing();
		
		
		Student stu = (Student)ps;
		stu.sing();
		
		//如下代码执行会出现异常    java.lang.ClassCastException：类型转换异常
		Student st = (Student)pt;
		
		
	}

}

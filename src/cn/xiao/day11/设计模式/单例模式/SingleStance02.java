/**
 * 
 */
package com.zx.设计模式.单例模式;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 饿汉方式实现 设计模式中的单例模式
 */
public class SingleStance02 {
	
	
	public static SingleStance02 singleStance = new SingleStance02();
	
	//将构造器私有
	private SingleStance02() {
		
	}
	
	//提供方法供外界调用  获取当前类的实例    
	public  static SingleStance02 getSingleStance() {
		
		
		 
		 return singleStance;
	}

}

/**
 * 
 */
package com.zx.设计模式.单例模式;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 懒汉方式实现 设计模式中的单例模式
 */
public class SingleStance {
	
	
	public static SingleStance singleStance;
	
	//将构造器私有
	private SingleStance() {
		
	}
	
	//提供方法供外界调用  获取当前类的实例     synchronized:同步锁     可以保证在同一时刻  只有一个线程进入该方法
	public synchronized static SingleStance getSingleStance() {
		
		 if(singleStance == null) {
			 singleStance = new SingleStance();
		 }
		 
		 return singleStance;
	}

}

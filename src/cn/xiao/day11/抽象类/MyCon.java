/**
 * 
 */
package com.zx.抽象类;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 如果一个类继承了抽象父类，那么必须重写抽象父类中的抽象方法，除非当前类也是抽象类
 */
public  class MyCon extends Connection {
	
	
	public MyCon() {
		super();
	}

	/* 
	 * 
	 */
	@Override
	public void getConnnection() {
		
		System.out.println("调用MyCon中的getConnnection方法");
		
	}

	


}

/**
 * 
 */
package com.zx.设计模式.工厂模式;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public  class Test{

	
	 public static void main(String[] args) {
		 
		 Fruit apple = Framer.getFruitObj();
		 String info = apple.createFruit(); 
		 System.out.println(info);
		 
		 
		 
		 Fruit apple02 = Framer.getFruitObj();
		 String info02 = apple02.createFruit();
		 
		 System.out.println(info02);
		 
		 
		
	}
	

}

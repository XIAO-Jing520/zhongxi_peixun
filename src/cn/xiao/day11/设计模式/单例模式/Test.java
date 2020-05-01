/**
 * 
 */
package com.zx.设计模式.单例模式;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0

 */
public class Test {
	
	
	 public static void main(String[] args) {
		 /***********************测试懒汉方案******************************/
		 SingleStance singleStance = SingleStance.getSingleStance();
		 
		 SingleStance singleStance02 = SingleStance.getSingleStance();
		 System.out.println("singleStance:"+singleStance);
		 
		 System.out.println("singleStance02:"+singleStance02);
		 
		 
		 /*************************测试饿汉方案****************************/
		 
        SingleStance02 singleStance03 = SingleStance02.getSingleStance();
		 
		 SingleStance02 singleStance04 = SingleStance02.getSingleStance();
		 System.out.println("singleStance03:"+singleStance03);
		 
		 System.out.println("singleStance04:"+singleStance04);

	}
}

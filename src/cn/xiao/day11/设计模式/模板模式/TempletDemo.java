/**
 * 
 */
package com.zx.设计模式.模板模式;



/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class TempletDemo {


		public static void main(String[] args) 
		{
			Account account = new AccountA();
			//设定本金  10000
			account.setFund(10000);
			account.calcInterest();
			System.out.println("------------------------");
			
			
			Account accountB = new AccountB();
			//设定本金  10000
			accountB.setFund(10000);
			accountB.calcInterest();
		}
	}


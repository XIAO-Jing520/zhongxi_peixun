/**
 * 
 */
package com.zx.设计模式.模板模式;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public	abstract class Account
	{	
		//本金
		private double fund;
		
		//程序主体(骨架)已经完成
		public void calcInterest(){

			double i =  this.fund * this.getInterest();

			System.out.println("您的本金是:"+this.fund+"-利率是:"+
				this.getInterest()+"--本次获得的利息收益是:"+i);
		}

		public void setFund(double fund){
			this.fund = fund;
		}
		//具体的实现需要在子类中根据情况实现
		public abstract double getInterest();

	}

	//1年期
	class AccountA extends Account{

		public double getInterest(){
			return 0.035;
		}
	}

	//3年期
	class AccountB extends Account{

		public double getInterest(){
			return 0.055;
		}
	}

	


/**
 * 
 */
package com.zx;

import java.io.PrintStream;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class StringTest {
	
	
	public static void main(String[] args) {
		
	      //String代表字符序列不可变的字符串，如果你要改其中包含的字符序列，只能生成新的String对象
		  String name = "15622266642";
	      //获取字符窜的长度
		  int len = name.length();
		  
		  //进行字符窜截取     截取的时候要防止  字符串下标越界异常
		 String str = name.substring(3, 6);
		 System.out.println("str:"+str);
		 
		 //进行数据替换
		 name = name.replace(str, "***");
		 
		 System.out.println(name);
		 
		 
		 String names = "jack,rose";
		 
		 String[] userNames = names.split(",");
		 for(String uName : userNames) {
			 System.out.println("uName:"+uName);
		 }
		 
		 
		 String account = "Admin";
		 
		 //将字符窜转成大写
		 //String accountMa = account.toUpperCase();
		 
		 //System.out.println("accountMa:"+accountMa);
		 
		 //将字符窜转成小
		 String accountMi = account.toLowerCase();
		 
		 System.out.println("accountMi:"+accountMi);
		 
		 
		 double age = 20.5;
		 
		 //将基本类型类型数据转换成对应的字符窜表现形式
		 String uAge = String.valueOf(age);
		 
		 //System.out.println(uAge.length());
		 
		 //String uAge = age + "";
		 //System.out.println(uAge.length());
		 
         System.out.println(uAge+"----"+(uAge instanceof String));
         
         
         String userAccount = " admin ";
         
         //去掉字符窜前后空格
         userAccount = userAccount.trim();
         System.out.println("去掉空格后的效果:"+userAccount+":");
	}

}

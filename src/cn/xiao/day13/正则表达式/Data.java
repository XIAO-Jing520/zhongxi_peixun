/**
 * 
 */
package com.zx.正则表达式;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 罗春龙 QQ：584614151 V 1.0
 * 正则表达式有两大作用： 1、数据校验   2、数据的抓取
 * 
 * 通过正则表达式实现数据抓取
 * 
 */
public class Data {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = "我有一台旧手机出售，价格很便宜，赶紧联系我，13844433322"
				+ "我是一个未婚女青年，想找男朋友，要求最低175，联系我：13566662322"
				+ "我想养条狗，请赠送，联系我：15677729932"
				+ "一起学Java，互相交流，联系我：13477737655";
		
		
		//定义手机号码的正则表达式
		String phoneRegex = "(1[34579])([0-9]{9})";
		
		//调用Pattern静态方法compile获取Pattern实例，需要传入正则表达式
		Pattern pattern = Pattern.compile(phoneRegex);
		
		//调用pattern的matcher方法,底层会将满足条件的数据  都封装   Matcher对象中
		Matcher matcher = pattern.matcher(st);
		
		
		//调用find方法可以用于判断是否存在满足条件的下一个 ‘手机号码’，如果存在则返回true 并让指针下移
		while(matcher.find()) {
			
			//通过调用  group 方法 获取满足条件的数据
			String phoneNum = matcher.group(2);
			System.out.println("phoneNum:"+phoneNum);
		};
		
		
	}

}

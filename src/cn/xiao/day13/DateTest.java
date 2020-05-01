/**
 * 
 */
package com.zx;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class DateTest {
	
	
	public static void main(String[] args) {
		   
		  //获取当前时间
	      Date date = new Date();
	      
	      int year =  date.getYear();
	      System.out.println("年份:"+(year+1900));
	      int month = date.getMonth();
	      System.out.println("月份:"+(month + 1));
	      //获取星期
	      int day = date.getDay();
	      System.out.println(day);
	      
	      
	      /**
	       * 创建日期格式化工具类    y:year    M:month   d:day   h:hour   m:minute s:second
	       * 注意：大写的 M代表月   小写的m代表分     HH:24小时制    hh：12小时制
	       * 
	       * */
	      SimpleDateFormat  sdf = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
	      //将获取Date对象的字符窜表现形式
	      String nDate = sdf.format(date);
	      System.out.println(nDate);
	      
	      try {
	    	  //将满足日期格式的字符窜解析成 Date对象
		      Date ndate = sdf.parse(nDate);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	      
	      
	      
	}

}

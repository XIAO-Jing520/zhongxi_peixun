/**
 * 
 */
package com.zx;

import java.util.Calendar;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class CalendarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		 //获取日历类的实例
		 Calendar calendar = Calendar.getInstance();
		 
	        //calendar.setTime(new Date());
	        System.out.println("年:" + calendar.get(Calendar.YEAR));
	        System.out.println("月(0~11): " + (calendar.get(Calendar.MONTH)+1));
	        System.out.println("当前 年 中的第几个星期: "+calendar.get(Calendar.WEEK_OF_YEAR));
	        System.out.println("当前 月 中的第几个星期: "+ calendar.get(Calendar.WEEK_OF_MONTH));
	        System.out.println("一个 月 中的某天: "+calendar.get(Calendar.DATE));
	        System.out.println("一个 月 中的某天: "+calendar.get(Calendar.DAY_OF_MONTH));
	        System.out.println("当前 年 中的天数: "+calendar.get(Calendar.DAY_OF_YEAR));
	        System.out.println("一个星期中的某天: "+calendar.get(Calendar.DAY_OF_WEEK));
	        System.out.println("当前月中的第几个星期: "+ calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	        System.out.println("是在中午之前还是在中午之后(0表示上午/1表示下午): " + calendar.get(Calendar.AM_PM));
	        System.out.println("小时: " + calendar.get(Calendar.HOUR));
	        System.out.println("一天中的小时: " + calendar.get(Calendar.HOUR_OF_DAY));
	        System.out.println("一小时中的分钟: " + calendar.get(Calendar.MINUTE));
	        System.out.println("一分钟中的秒: " + calendar.get(Calendar.SECOND));
	        System.out.println("一秒中的毫秒: " + calendar.get(Calendar.MILLISECOND));

	}

}

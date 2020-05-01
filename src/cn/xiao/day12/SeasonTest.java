/**
 * 
 */
package com.zx;

/**
 * @author 罗春龙 QQ：584614151 V 1.0 定义枚举类 1. 枚举的构造器：必须被彻底隐藏。
 *         不管你写还是不写，枚举的构造器总是用private修饰。 2. 定义枚举时，不能显式继承父类。枚举默认继承Enum类
 */
public class SeasonTest {

	public static void main(String[] args) {

		// 获取枚举 Season 的所有实例
		Season[] seasons = Season.values();
		System.out.println("实例的个数:" + seasons.length);

		for (Season season : seasons) {
			// 获取枚举的名字
			String name = season.name();
			System.out.println("name:" + name);
			System.out.println(season.getName());

		}

		// 获取枚举实例
		Season season = Season.valueOf("SPRING");

		// 获取枚举实例
		Season season02 = Season.SPRING;
		
		
		calx(Season.SPRING);

	}

	public static void calx(Season season) {

		switch (season) {

		case SPRING:
               System.out.println("春天百花开放");
			break;

		case SUMMER:
			System.out.println("夏天烈日炎炎");
			break;
		case AUT:
			System.out.println("秋天适合谈恋爱");
			break;
		case WINTER:
			System.out.println("冬天适合跑路");
			break;
		default:

			break;

		}
	}

}

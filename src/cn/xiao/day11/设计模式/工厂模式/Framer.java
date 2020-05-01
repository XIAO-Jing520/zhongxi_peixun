/**
 * 
 */
package com.zx.设计模式.工厂模式;

/**
 * @author 罗春龙 QQ：584614151 V 1.0
 * 
 *         定义工厂类
 * 
 */
public class Framer {

	// 定义工厂方法
	public static Fruit getFruitObj() {

		Fruit fruit = new Orange();
		return fruit;
	}

}

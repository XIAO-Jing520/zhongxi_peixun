/**
 * 
 */
package com.zx;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 定义枚举类
 *   1. 枚举的构造器：必须被彻底隐藏。 不管你写还是不写，枚举的构造器总是用private修饰。
     2. 定义枚举时，不能显式继承父类。枚举默认继承Enum类
 */
public enum Season{
	
	//列出所有的枚举实例
	SPRING,SUMMER,AUT,WINTER;
	
	private String name;
	
	{
		
	}
	
	static{
		
	}
	
	
	private Season(){
		System.out.println("------经过枚举构造器------");
		this.name = "jack";
	}
	
	public void play() {}
	
	public static void work() {}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}

/**
 * 
 */
package com.zx.包装类;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class Test {
	
	
	public static void main(String[] args) {
		
		//定义基本类型变量
		int a = 10;
		
		//定义引用类型变量   因为Integer是包装类（引用类型）   
		//自动装箱： Java会自动把基本类型的值包装成对应包装类的实例
		Integer b = 10;
		//自动装箱
		Integer c = a;
		
		
		//自动拆箱： Java会自动把包装类的实例拆装成对应基本类型的值
		int d = b;
		
		
		//如上代码告诉大家  包装类   和  基本类型之间转换是非常简单灵活的   因为java会自动帮我们完成  装箱  以及  拆箱的动作
		
		//比较两个整数的大小
		int max = Integer.max(20, 30);
		//System.out.println(max);
		
		//将字符窜转换成对应整数
		int age = Integer.parseInt("20");
		System.out.println(age);
		
		
		
		//定义包装类实例
		Integer it = 20;

		//进行拆箱操作
        int it2 = it;

		// 自动装箱
		Double de = 3.4;

		// 自动拆箱
		double result = it * de;//先转换为int   double再做乘法
		System.out.println(result);

		// 被自动装箱成Integer对象，接下来向上转型
		Object obj = 2;

		// 下面代码是错误的，编译器认为obj是Object类型，
		// 必须强转为Integer之后编译器才会进行自动拆箱
	   	//double ret = de * obj;
		double ret = de * (Integer)obj;
		
	}

}

/**
 * 
 */
package com.zx.am;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 定义成员变量
 */
public class Teacher {
	
	/*
	 * 定义成员变量的语法格式：
	 * [修饰符] <类型> 变量名[ = 初始值];
	 * 修饰符： public|protected|private、static、final、transient（序列化）
	 * 
	 * 成员变量 分成  实例成员变量（没有用static修饰）  以及  静态成员变量（用static修饰）
	 * 
	 * 实例成员变量必须通过 当前类的实例|对象来调用
	 * 静态成员变量必须通过  当前类来调用
	 * 
	 * 
	 * 成员变量 如果不指定初始值 ，那么会有默认值
	 * 
	 * 
	 * */ 
	//定义实例成员变量       实例成员变量由对象来进行调用,每个对象都会有一份实例成员变量
	private String name = "jack";
	private int age;
	private char sex;
	//定义静态成员变量     静态成员变量由 类 进行调用，只有一份
	public static int num;
	
	private static byte[] array = new byte[1024 * 1024 * 500];
	
	 
	
	
	public static void main(String[] args) {
		
		//通过  new  Teacher()可以用于创建对象
		 Teacher tea = new Teacher();
		 
		 //给对象的name属性赋值
		 tea.name = "jack";
		 //给对象的age属性赋值
		 tea.age = 20;
		 //给对象的sex
		 //给对象的sex属性赋值
		 tea.sex = '男';
		 
		 //获取对象中的属性值
		 String uName = tea.name;
		 System.out.println("uName:"+uName);
		 
		 
		
		 Teacher tea02 = new Teacher();
		 tea02.name = "rose";
		 tea02.age = 21;
		 tea02.sex = '女';
		 
		 String uName02 = tea02.name;
		 System.out.println("uName02:"+uName02);
		 
		 
		 //操作静态成员变量
		 
		 //赋值
		 //Teacher.num = 10;
		 //在当前类中使用静态成员变量可以省略类名
		 num = 10;
		 
		 //取值
		 System.out.println("Teacher.num:"+Teacher.num);
		 
		 Teacher.num = 20;
		 
		//取值
		 System.out.println("Teacher.num:"+Teacher.num);
		 
		 //通过对象也可以访问静态成员变量，但是不推荐，应该使用类来调用
		//int n = tea.num;
		
		 //不能通过类操作实例成员变量
		 //Teacher.name = "tom";
		
		 
		 //Teacher[] teas = new Teacher[] {tea,tea02};
		 
		
		 //定义局部变量  ,局部变量必须有初始值之后才可以使用
		 int a;
		 
		 a = 10;
		 
		 a++;
		
	}
	
	

	

}

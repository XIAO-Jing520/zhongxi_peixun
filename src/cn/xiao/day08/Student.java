/**
 * 
 */
package com.zx;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 
   构造器  
   - 1)、创建对象   
   - 2)、可以给对象实例化一些初始值。
      
         格式：[修饰符]  类名称(形参列表){
                 // 执行代码

       
             }

        

	     修饰符： public|protected|不写|private   

	     类名称：必须是当前类的名称一字不差：大小写完全一致。

	     形参列表： (类型 变量 ,类型 变量 , .....)

	     注意点： 1.构造器的名称必须与类的名称一字不差：大小写完全一致
	                   2.构造器也必须放到类下面,不能定义在其他成分中。 
		                3.构造器与方法极为相似但是构造器没有返回值申明。


 */
public class Student {
	
	   //定义实例成员变量
	   private String name;
	   private int age;
	   private char sex;
	   
	   
	   //当创建对象的时候必定会经过构造器，具体经过哪一个构造器，有参数来决定
	   
	   /*定义无参构造器      如果不声明构造器，那么默认会有一个无参构造器,
	        但是开发者定义了有参构造器之后，无参构造器会被覆盖，如果还需要使用无参构造器就必须将无参构造器定义出来
	   */
	   public Student() {
		 
		   this("jack",20,'男');
		   
		   System.out.println("-----执行无参构造器-----");
		   
	   }
	   
	   
	   //定义有参构造器
	   public Student(String name,int age,char sex) {
	
		   System.out.println("-----执行有参构造器-----");
		   
		   //this代表当前正在创建的对象
		   this.name = name;
		   this.age = age;
		   this.sex = sex;
		   System.out.println("this:"+this);
	   }
	
	
	    public static void main(String[] args) {
	    	
	    	
	    	//1、通过无参构造器创建对象创建对象   类   变量名  = new   构造器;
	    	Student  s = new Student();
	    	s.name = "jack";
	    	s.age = 20;
	    	s.sex = '男';
	    
	    	
	    	System.out.println("s.name:"+s.name+" s.age:"+s.age);
	    
	    	//通过有参构造器创建对象
	    	Student s2 = new Student("rose",21,'女');
	    	System.out.println("s2.name:"+s2.name+" s2.age:"+s2.age);
	    	
	    	System.out.println("s2:"+s2);
	    	
	    	//通过有参构造器创建对象
	    	Student s3 = new Student("tom",21,'女');
	    	System.out.println("s3.name:"+s3.name+" s3.age:"+s3.age);
	    	
	    	System.out.println("s3:"+s3);
	    	
	    	System.out.println("s3.name--1--:"+s3.name);
	    	
	    	s3.setName("杨过");
	    	
	    	System.out.println("s3.name---2--:"+s3.name);
	    	
	    	
	    	
	    }
	    
	    
	    public  void setName(String name) {
	    	//this代表对象，哪一个对象调用该方法，那么this就代表哪一个对象
	    	this.name = name;
	    }

}

/**
 * 
 */
package com.zx.泛型;

import java.util.*;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 泛型语法入门
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List  list = new ArrayList();
		
		//list.add("jack");
		///list.add(10);
		
		Student s1 = new Student("kebi",30);
		Student s2 = new Student("maidi",30);
		list.add(s1);
		list.add(s2);
		
		//需求：将学生的名字都取出来
		for(Object s : list) {
			if(s instanceof Student) {
				String name = ((Student)s).getName();
                System.out.println("name:"+name);
			}
		}
		
		
		/*
		 * 因为集合是可以添加任意类型数据的，但是实际开发中我们一般都是往集合中存放相同类型的数据即可，
		 * 如果往集合中添加的数据太杂乱，那么在取数据的时候特别麻烦，因此在jdk1.5的时候退出了  泛型语法
		 * 
		 * 总结：泛型可以用于限定集合对象操作的数据类型信息
		 * */
		//List<类型> 变量 = new ArrayList<类型>();
		List<Student>  stus = new ArrayList<Student>();
		
		//添加数据   因为泛型中约定了只能操作 Student类型的数据，因此add方法只能添加 Student类型数据
		stus.add(s1);
		
		//取数据
		Student s = stus.get(0);
        System.out.println(s.getName());
        
        
	}

}


class Student{
	
	private String name;
	private int age;
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
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
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

/**
 * 
 */
package com.zx.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.zx.set.People;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class MapTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 在什么场景下会使用到map集合？
		 * 1、比如 公司中有 行政部 |10人员工   销售部|10ge 员工   开发部|20个员工，当我指定 部门的时候，立马能够获取到对应的部门中的人员信息的时候
		 * 2、比如做一个权限管理系统  每个用户可能拥有不能的操作权限，我们将员工的id作为  key 员工的权限作为  value
		 *   可以非常方便的根据key获取指定的value信息
		 * 
		 * */
		
		HashMap map = new HashMap();
		
		List list1 = new ArrayList();
		Student s1 = new Student("jack",20);
		Student s2 = new Student("麦迪",20);
		list1.add(s1);
		list1.add(s2);
		
		map.put("开发部", list1);
		
		List list2 = new ArrayList();
		Student s3 = new Student("乔丹",20);
		Student s4 = new Student("詹姆斯",20);
		Student s5 = new Student("科比",20);
		list2.add(s3);
		list2.add(s4);
		list2.add(s5);
		map.put("销售部", list2);

		
		//获取销售部中所有的员工信息
		ArrayList objs = (ArrayList)map.get("销售部");
		for(Object obj : objs) {
			System.out.println("obj:"+obj);
		}
		
	}

}

class  Student{
	private String name;
	private int age;
	
	
	public Student() {
		super();
		
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


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	
}

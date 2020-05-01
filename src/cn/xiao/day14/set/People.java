/**
 * 
 */
package com.zx.set;

import java.util.Objects;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class People {
	
	private String name;
	private int age;
	
	
	public People() {
		super();
		
	}
	
	
	/**
	 * @param name
	 * @param age
	 */
	public People(String name, int age) {
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
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
	    System.out.println("-------hashCode-----");
		return Objects.hash(this.name,this.age);
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		System.out.println("-----equals---");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		if(!(obj instanceof People)) {
			return false;
		}else {
			People p = (People)obj;
			if(p.name.equals(this.name) && p.age == this.age) {
				return true;
			}else {
				return false;
			}
		}
		
	}
	
	
	
	//重写equals方法
	

}

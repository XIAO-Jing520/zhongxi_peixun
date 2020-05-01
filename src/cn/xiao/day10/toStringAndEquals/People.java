/**
 * 
 */
package com.zx.toStringAndEquals;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class People {
	
	
	private String name;
	private int age;
	private char sex;
	
	
	public People() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param age
	 * @param sex
	 */
	public People(String name, int age, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
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
	/**
	 * @return the sex
	 */
	public char getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(char sex) {
		this.sex = sex;
	}


	
	//重写 Object对象中的toString方法
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}

	
	//重写Object对象中的equals方法
	@Override
	 public boolean equals(Object obj) {
          
		    if(obj == null) {
		    	//如果obj没有指向任何对象则直接返回false
		    	return false;
		    }else if(!(obj instanceof People)) {
		    	//instanceof  判断 obj所指向的对象是否是People的实例，如果是才进行比较
		    	return false;
		    }else{
		    	People p = (People)obj;
		    	if(p.name.equals(this.name) && p.age == this.age && p.sex == this.sex) {
		    		return true;
		    	}else{
		    		return false;
		    	}
		    }

	 }
	
	
	
	
}

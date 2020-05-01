/**
 * 
 */
package com.zx;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class People {
	
	private String name;
	
	

	/**
	 * 
	 */
	public People() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public People(String name) {
		super();
		this.name = name;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "People [name=" + name + "]";
	}

	
	
	

}

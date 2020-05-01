/**
 * 
 */
package com.zx.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class LinkedHashSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//LinkedHashSet特点：有序      不允许重复
		HashSet  hashSet = new LinkedHashSet();

		hashSet.add('男');

		hashSet.add("jack");
		hashSet.add(20);
	
		hashSet.forEach(val -> System.out.println("val:"+val));
	}

}

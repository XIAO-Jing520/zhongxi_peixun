/**
 * 
 */
package com.zx.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class TreeSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		TreeSet<String>   treeSet = new TreeSet<>();

		treeSet.add("jack");
		treeSet.add("kebi");
		treeSet.add("admin");
		treeSet.add("rose");
		treeSet.add("tom");
		
		
		//treeSet.forEach(val -> System.out.println(val));
		
		
		TreeSet<Integer>   ages = new TreeSet<>();
		ages.add(20);
		ages.add(19);
		ages.add(21);
		
		ages.add(18);
		ages.add(30);
		
		ages.forEach(age -> System.out.println(age));
		
		
	/*	TreeSet<Integer>   uages = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				System.out.println("o1:"+o1+"   o2:"+o2);
				return 1;
			}
			
		});*/
		
		TreeSet<Integer>   uages = new TreeSet<>((Integer o1,Integer o2) -> {return 1;});
		
		uages.add(20);
		uages.add(21);
		uages.add(19);
		uages.add(18);
		uages.add(17);
		uages.add(13);
		uages.add(30);
		
		uages.forEach(age -> System.out.println(age));
		
	}

}

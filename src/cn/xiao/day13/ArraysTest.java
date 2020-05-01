/**
 * 
 */
package com.zx;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Objects;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class ArraysTest {
	
	
	public static void main(String[] args) {
		
	     String[] name1 = new String[] {"jack","rose"};
	     
	     String[] name2 = new String[] {"jack","rose"};

	     
	     People[] ps = new People[] {new People("jack"),new People("jack")};
	     
	     People[] ps02 = new People[] {new People("jack"),new People("jack")};
	     
	     
	    System.out.println(Arrays.equals(name1, name2));
	    
	    System.out.println(Arrays.equals(ps, ps02));
	    
	    
	    //System.out.println("name1:"+Arrays.toString(name1));
	    
	    System.out.println("name1:"+Arrays.toString(ps));
	    
	    
	    int[] nums = new int[]{10,20,5,30};
	    Arrays.sort(nums);
	    System.out.println(Arrays.toString(nums));
	    
	    
	    int[] ages = new int[5];
	    
	    int age = 100;
	    
	    Arrays.fill(ages, age);
	    
	    System.out.println(Arrays.toString(ages));
	}

}

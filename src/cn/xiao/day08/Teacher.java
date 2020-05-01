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
 * 方法的重载 
      口诀： 两同一不同。
      在同一个类中,方法名称相同,形参列表不同就是方法的重载。

      注意事项：
            1.形参列表相同,形参变量名称不同不算重载
	        2.形参列表相同,返回值不同不算重载
	        3.在同一类中，方法名相同,调用方法只能识别一个方法就算重载。


 */
public class Teacher {
	
	
	
	    public static void main(String[] args) {
	    	Teacher  t = new Teacher();
	    	
	    	t.login("admin", 4937);
   
		}
	     
	     
	    public void login(String name,String pass) {
	    	
	    }
	   
	    
      
	    
	    
        public boolean login(String phoneNum,int yzm) {
	    	
        	return true;
	    }

}

/**
 * 
 */
package com.zx.泛型;

import java.util.*;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 泛型语法规则以及注意事项
 */
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/* Set<类型> 变量 = new HashSet<类型>();
	     Set<类型> 变量 = new HashSet<>();
	     
	     ------------------------------------------
	     List<类型> 变量 = new ArrayList<>();

	     Map<key的类型,value的类型> 变量 = new HashMap<>();*/
		
		Set<String> names = new HashSet<String>();
		names.add("jack");
		
		//=右边的 <>中可以省略数据类型
		Set<Integer> ages = new HashSet<>();
        ages.add(10);
        
        Map<String,Integer> map = new HashMap<>();
        map.put("0001", 100);
        
        
        //注意：泛型必须申明引用类型！！！不能使用基本数据类型
        //Map<String,int> map = new HashMap<>(); 错误的定义方式
         Map<String,Integer> mapInfo = new HashMap<>();// 正确的定义方式
         
         
        
	}

}


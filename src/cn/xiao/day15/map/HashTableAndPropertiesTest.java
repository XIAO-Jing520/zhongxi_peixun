/**
 * 
 */
package com.zx.map;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.function.BiConsumer;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class HashTableAndPropertiesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashTable是线程安全的  key 以及  value不允许为 null   其他和 HashMap的API类似
		Hashtable  table = new Hashtable();
		//key 以及  value不允许为 null  如果为空 那么程序执行的时候会出现空指针
		//table.put(null, null);
		
		
		
		//Properties在项目开发的时候经常用用于加载配置文件  ，会自动将配置文件中的信息存放在  Properties底层 便于数据的处理
		Properties   prop = new Properties();
		prop.put("userName", "admin");
		prop.put("password","123456");
		
		String name = (String)prop.get("userName");
		//System.out.println("name:"+name);
		
		try {
			//创建Properties对象   Properties是  HashTable的子类
			Properties   loadProp = new Properties();
			
			//创建字节输入流  用于加载 文件  信息    属于  IO流中知识
			InputStream input = new  FileInputStream("src/abc.txt");
			
			loadProp.load(input);
			
			String uName = (String)loadProp.get("userName");
			String pass = (String)loadProp.get("password");
			System.out.println("uName:"+uName+" pass:"+pass);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}

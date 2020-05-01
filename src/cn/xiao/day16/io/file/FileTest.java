/**
 * 
 */
package com.zx.io.file;

import java.io.File;
import java.util.UUID;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class FileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         File file = new File("E:/A_zxjy/233班/day16/bj.txt");
         
         System.out.println("文件是否可读:"+file.canRead());
         System.out.println("文件是否可写:"+file.canWrite());
         
         System.out.println("文件大小："+file.length());
         
         System.out.println("文件名:"+file.getName());
         
         //对文件进行重命名     bj.txt
         String  name = file.getName();
         
         
         
         String newName = UUID.randomUUID().toString() + name.substring(name.lastIndexOf("."), name.length());
         System.out.println("重命名之后的文件名:"+newName);
         
         //判断文件是否存在
         if(file.exists()) {
        	 //删除文件
        	// file.delete();
         }
         
        // System.out.println("文件绝对路径:"+file.getAbsolutePath());
         
         System.out.println("是否是文件:"+file.isFile());
         System.out.println("是否是目录:"+file.isDirectory());
         
         try {
        	 //创建文件
             File f1 = new File("E:/A_zxjy/233班/day16/笔记.xmind");
             
             //创建一个空文件    不能用于创建目录
             f1.createNewFile();
             
             
             //创建目录
             File f2 = new File("E:/A_zxjy/233班/day16/代码/a/b");
             //mkdir只能创建一级目录，存在多级需要创建则会失效    mkdirs可以同时创建多级
             f2.mkdirs();
             
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
         
        System.out.println("---------------------");
         File f3 = new File("E:/A_zxjy/233班/day16");
         
         File[] files = f3.listFiles();
         for(File f : files) {
        	 System.out.println(f.getName());
         }
         
         
         //指定一个目录，将该目录下所有的子文件以及子目录的名字打印出来，如果子目录下还存在子目录继续获取子文件以及子目录的信息
	}

}

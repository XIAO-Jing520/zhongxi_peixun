/**
 * 
 */
package com.zx.io.file;

import java.io.File;

/**
 * @author 罗春龙 QQ：584614151 V 1.0
 */
public class FileListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 指定一个目录，将该目录下所有的子文件以及子目录的名字打印出来，如果子目录下还存在子目录继续获取子文件以及子目录的信息
		File file = new File("E:\\A_zxjy\\233班\\day16"); 
		
		//调用方法  listFile  
		listFile(file);

	}

	// 根据目录查找子文件以及子目录信息
	public static void listFile(File file) {
		File[] files = file.listFiles();

		for (File f : files) {
			if (f.isFile()) {
				// 表示文件
				System.out.println("文件名:" + f.getName()+"  上级目录:"+file.getName());
			} else {
				// 表示目录
				System.out.println("目录名:" + f.getName()+"  上级目录:"+file.getName());
                //调用方法  listFile 进行递归操作
				listFile(f);
			}
		}
	}

}

/**
 * 
 */
package com.zx.正则表达式;

/**
 * @author 罗春龙 QQ：584614151 V 1.0
 * 正则表达式有两大作用： 1、数据校验   2、数据的抓取
 * 
 * 正则表达式就是一个字符窜模板
 * 
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 定义一个正则表达式
		String regex = "[abc中]";
		String regex1 = "[^abc中]";
		String regex2 = "[a-z]";
		String regex3 = "[A-Za-z3-9]";
		String regex4 = "[9[0-7]]";
		String regex5 = "ab";
		String regex6 = "."; // 任何字符
		// matches(String regex)
		// 告知此字符串是否匹配给定的正则表达式。
/*		System.out.println("国".matches(regex));//false
		System.out.println("中".matches(regex1));//false
		System.out.println("ab".matches(regex2));
		System.out.println("a".matches(regex2));
		System.out.println("3".matches(regex3));
		System.out.println("8".matches(regex4));
		System.out.println("ab".matches(regex5)); // true 一定要一样类似于equals判断
		System.out.println("在".matches(regex6));
		System.out.println("9".matches("\\d"));

		System.out.println("到".matches("\\D"));
		System.out.println(" ".matches("\\s")); // 空格字符 true
		System.out.println(" ".matches("\\S")); // 非空格字符 false
		System.out.println("$".matches("\\w")); // [a-zA-Z_0-9]
		System.out.println("在".matches("\\W"));*/

		System.out.println("aabcbcbcad".matches("[abc]*"));
		System.out.println("042424".matches("[0-9]+"));
		System.out.println("af43".matches("\\w{4}"));
		System.out.println("admin".matches("\\w{6,10}"));
	}

}

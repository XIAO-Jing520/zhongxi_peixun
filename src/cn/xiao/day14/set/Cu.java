/**
 * 
 */
package com.zx.set;

import java.util.function.Consumer;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class Cu implements Consumer {

	/* (non-Javadoc)
	 * @see java.util.function.Consumer#accept(java.lang.Object)
	 */
	@Override
	public void accept(Object t) {
		// TODO Auto-generated method stub
		System.out.println("t:"+t);
		
	}

}

/**
 * 
 */
package com.zx.exception.自定义异常类;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class AccountAndPasswordNotFound extends Exception {

	/**
	 * 
	 */
	public AccountAndPasswordNotFound() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public AccountAndPasswordNotFound(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public AccountAndPasswordNotFound(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public AccountAndPasswordNotFound(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public AccountAndPasswordNotFound(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
	    
}

package com.samples.helloworld;

public class HelloWorld implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int helloworld_id;
	
	private String helloworld_message;
	
	public int getHelloworld_id() {
		return helloworld_id;
	}
	
	public void setHelloworld_id(int helloworld_id) {
		this.helloworld_id = helloworld_id;
	}
	
	public String getHelloworld_message() {
		return helloworld_message;
	}
	
	public void setHelloworld_message(String helloworld_message) {
		this.helloworld_message = helloworld_message;
	}
	
	
}

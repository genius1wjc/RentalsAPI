package com.wjc.model;

public class Request {

	public int id;
	public String time;
	public boolean fromIos = true;
	
	public Request() {
	}
	
	public Request(int id, String time) {
		this.id = id;
		this.time = time;
	}
}

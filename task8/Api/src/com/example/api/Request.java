package com.example.api;

import java.io.Serializable;
import java.util.List;

public class Request implements Serializable {
	private String header;
	private Object object;
	public Request(List<Object> e){
		setHeader((String) e.get(0));
		e.remove(0);
		setObject(e);
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
}

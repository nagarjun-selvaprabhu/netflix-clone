package io.nagarjun.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.nagarjun.controller.UserController;

public class cookie {
	
	 private static final Logger logger = LoggerFactory.getLogger(cookie.class);
	
	private String name;
	private String url;
	
	public cookie() {
		
	}
	
	public cookie(String name, String url) {
		this.name = name;
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "cookie [name=" + name + ", url=" + url + "]";
	}
	
}

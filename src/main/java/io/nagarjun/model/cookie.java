package io.nagarjun.model;



public class cookie {
	
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

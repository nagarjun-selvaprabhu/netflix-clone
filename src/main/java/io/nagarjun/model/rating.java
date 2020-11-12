package io.nagarjun.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class rating {
	 private static final Logger logger = LoggerFactory.getLogger(rating.class);
	
	private int number;

	public rating() {

	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}

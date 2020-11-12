package io.nagarjun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchCriteria {
	private static final Logger logger = LoggerFactory.getLogger(SearchCriteria.class);
	
	@Override
	public String toString() {
		return "SearchCriteria [key=" + key + ", value=" + value + ", operation=" + operation + "]";
	}

	private String key;
	private Object value;
	private SearchOperation operation;

	public SearchCriteria() {
	}

	public SearchCriteria(String key, Object value, SearchOperation operation) {
		this.key = key;
		this.value = value;
		this.operation = operation;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public SearchOperation getOperation() {
		return operation;
	}

	public void setOperation(SearchOperation operation) {
		this.operation = operation;
	}

	// getters and setters, toString(), ... (omitted for brevity)
}
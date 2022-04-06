package com.klc213.ats.common;

import java.math.BigDecimal;

public class AccountValue {
	private String key;
	private String value;
	private String currency;
	
	public AccountValue() { }
	
	public AccountValue(String key, String value, String currency) {
		this.key = key;
		this.value = value;
		this.currency = currency;
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
}

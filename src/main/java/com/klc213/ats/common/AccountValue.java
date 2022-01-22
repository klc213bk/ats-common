package com.klc213.ats.common;

import java.math.BigDecimal;

public class AccountValue {
	private String key;
	private BigDecimal value;
	private CurrencyEnum currency;
	
	public AccountValue() { }
	
	public AccountValue(String key, BigDecimal value, CurrencyEnum currency) {
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
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	public CurrencyEnum getCurrency() {
		return currency;
	}
	public void setCurrency(CurrencyEnum currency) {
		this.currency = currency;
	}
	
}

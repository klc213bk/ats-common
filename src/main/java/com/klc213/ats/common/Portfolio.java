package com.klc213.ats.common;

import java.math.BigDecimal;

public class Portfolio {
	private String accountCode;
	private Contract contract;
	private Long position;
	private BigDecimal mktPrice;
	private BigDecimal mktValue;
	private BigDecimal avgCost;
	
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public Contract getContract() {
		return contract;
	}
	public void setContract(Contract contract) {
		this.contract = contract;
	}
	public Long getPosition() {
		return position;
	}
	public void setPosition(Long position) {
		this.position = position;
	}
	public BigDecimal getMktPrice() {
		return mktPrice;
	}
	public void setMktPrice(BigDecimal mktPrice) {
		this.mktPrice = mktPrice;
	}
	public BigDecimal getMktValue() {
		return mktValue;
	}
	public void setMktValue(BigDecimal mktValue) {
		this.mktValue = mktValue;
	}
	public BigDecimal getAvgCost() {
		return avgCost;
	}
	public void setAvgCost(BigDecimal avgCost) {
		this.avgCost = avgCost;
	}
	
	
}

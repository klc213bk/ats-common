package com.klc213.ats.common;

import java.util.Map;
import java.util.Set;

public class AccountInfo {
	private String accountNo;
	private Map<String, AccountValue> accountValueMap;
	private Map<Contract, Portfolio> portfolioMap;
	private String accountTime;
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getAccountTime() {
		return accountTime;
	}
	public void setAccountTime(String accountTime) {
		this.accountTime = accountTime;
	}
	public Map<String, AccountValue> getAccountValueMap() {
		return accountValueMap;
	}
	public void setAccountValueMap(Map<String, AccountValue> accountValueMap) {
		this.accountValueMap = accountValueMap;
	}
	public Map<Contract, Portfolio> getPortfolioMap() {
		return portfolioMap;
	}
	public void setPortfolioMap(Map<Contract, Portfolio> portfolioMap) {
		this.portfolioMap = portfolioMap;
	}
	
}

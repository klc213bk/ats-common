package com.klc213.ats.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AccountInfo {
	private String accountNo;
	private Map<String, Map<String, String>>  accountValueMap;
	private Map<Contract, Portfolio> portfolioMap;
	private String accountTime;
	
	public AccountInfo(String accountNo) {
		this.accountNo = accountNo;
		accountValueMap = new HashMap<>();
		portfolioMap = new HashMap<>();
	}
	public String getAccountNo() {
		return accountNo;
	}
	
	public String getAccountTime() {
		return accountTime;
	}
	public void setAccountTime(String accountTime) {
		this.accountTime = accountTime;
	}
	public Map<String, Map<String, String>> getAccountValueMap() {
		return accountValueMap;
	}
	public void addAccountValueMap(String currency, String key, String value) {
		if (accountValueMap.containsKey(currency)) {
			Map<String, String> accValueMap = accountValueMap.get(currency);
			accValueMap.put(key, value);
			
		} else {
			Map<String, String> accValueMap = new HashMap<>();
			accValueMap.put(key, value);
			accountValueMap.put(currency, accValueMap);
		}
	}
	public Map<Contract, Portfolio> getPortfolioMap() {
		return portfolioMap;
	}
	public void addPortfolio(Portfolio portfolio) {
		portfolioMap.put(portfolio.getContract(), portfolio);
	}
	
}

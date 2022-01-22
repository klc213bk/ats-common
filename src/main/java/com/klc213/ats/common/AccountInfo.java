package com.klc213.ats.common;

import java.time.LocalDateTime;
import java.util.Set;

public class AccountInfo {
	private String accountCode;
	private Set<AccountValue> accountValueSet;
	private Set<Portfolio> portfolioSet;
	private Long accountTime;
	
	public String getAccountCode() {
		return accountCode;
	}
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	public Set<AccountValue> getAccountValueSet() {
		return accountValueSet;
	}
	public void setAccountValueSet(Set<AccountValue> accountValueSet) {
		this.accountValueSet = accountValueSet;
	}
	public Long getAccountTime() {
		return accountTime;
	}
	public void setAccountTime(Long accountTime) {
		this.accountTime = accountTime;
	}
	public Set<Portfolio> getPortfolioSet() {
		return portfolioSet;
	}
	public void setPortfolioSet(Set<Portfolio> portfolioSet) {
		this.portfolioSet = portfolioSet;
	}
	
	
}

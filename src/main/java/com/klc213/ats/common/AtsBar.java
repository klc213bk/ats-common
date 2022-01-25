package com.klc213.ats.common;

import java.math.BigDecimal;

public class AtsBar {
	private String symbol;
	private BarSizeEnum barSize;
	private BigDecimal open;
	private BigDecimal high;
	private BigDecimal low;
	private BigDecimal close;
	private Long volume;
	private Integer count;
	
	public AtsBar() { }
	
	public AtsBar(String symbol, BarSizeEnum barSize, BigDecimal open,
			BigDecimal high, BigDecimal low, BigDecimal close,
			Long volume, Integer count) { 
		this.symbol = symbol;
		this.barSize = barSize;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.volume = volume;
		this.count = count;
	}
	
	public String getSymbol() {
		return symbol;
	}
	public BarSizeEnum getBarSize() {
		return barSize;
	}
	public BigDecimal getOpen() {
		return open;
	}
	public BigDecimal getHigh() {
		return high;
	}
	public BigDecimal getLow() {
		return low;
	}
	public BigDecimal getClose() {
		return close;
	}
	public Long getVolume() {
		return volume;
	}
	public Integer getCount() {
		return count;
	}
	
	
}

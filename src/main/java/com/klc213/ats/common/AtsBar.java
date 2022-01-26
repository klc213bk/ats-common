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
	private Long time;
	
	public AtsBar() { }
	
	public AtsBar(String symbol, BarSizeEnum barSize, BigDecimal open,
			BigDecimal high, BigDecimal low, BigDecimal close,
			Long volume, Integer count, Long time) { 
		this.symbol = symbol;
		this.barSize = barSize;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.volume = volume;
		this.count = count;
		this.time = time;
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

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public void setBarSize(BarSizeEnum barSize) {
		this.barSize = barSize;
	}

	public void setOpen(BigDecimal open) {
		this.open = open;
	}

	public void setHigh(BigDecimal high) {
		this.high = high;
	}

	public void setLow(BigDecimal low) {
		this.low = low;
	}

	public void setClose(BigDecimal close) {
		this.close = close;
	}

	public void setVolume(Long volume) {
		this.volume = volume;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
	
}

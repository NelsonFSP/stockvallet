package com.nelson.workshopmongo.domain;

import java.io.Serializable;

public class Stocks implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String symbol;
	private String name;
	private String region;
	private String markOpen;
	private String markClose;
	private String timeZone;
	private String currency;
	private String matchScore;
	
	public Stocks() {
	}

	public Stocks(String symbol, String name, String region, String markOpen, String markClose, String timeZone,
			String currency, String matchScore) {
		this.symbol = symbol;
		this.name = name;
		this.region = region;
		this.markOpen = markOpen;
		this.markClose = markClose;
		this.timeZone = timeZone;
		this.currency = currency;
		this.matchScore = matchScore;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getMarkOpen() {
		return markOpen;
	}

	public void setMarkOpen(String markOpen) {
		this.markOpen = markOpen;
	}

	public String getMarkClose() {
		return markClose;
	}

	public void setMarkClose(String markClose) {
		this.markClose = markClose;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getMatchScore() {
		return matchScore;
	}

	public void setMatchScore(String matchScore) {
		this.matchScore = matchScore;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stocks other = (Stocks) obj;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		return true;
	}
}

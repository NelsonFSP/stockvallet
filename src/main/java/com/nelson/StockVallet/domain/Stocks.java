package com.nelson.StockVallet.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"01. symbol",
"02. open",
"03. high",
"04. low",
"05. price",
"06. volume",
"07. latest trading day",
"08. previous close",
"09. change",
"10. change percent"
})

@JsonIgnoreProperties(ignoreUnknown = false)
public class Stocks {	//private static final long serialVersionUID = 1L;
	
	@JsonProperty(value = "01. symbol")
	private String symbol;
	@JsonProperty(value = "02. open")
	private String open;
	@JsonProperty(value = "03. high")
	private String high;
	@JsonProperty(value = "04. low")
	private String low;
	@JsonProperty(value = "05. price")
	private String price;
	@JsonProperty(value = "06. volume")
	private String volume;
	@JsonProperty(value = "07. latest trading day")
	private String latestTradingDay;
	@JsonProperty(value = "08. previous close")
	private String previousClose;
	@JsonProperty(value = "09. change")
	private String change;
	@JsonProperty(value = "10. change percent")
	private String changePercent;
	
	public Stocks() {
	}

	public Stocks(String symbol, String open, String high, String low, String price, String volume,
			String latestTradingDay, String previousClose, String change, String changePercent) {
		this.symbol = symbol;
		this.open = open;
		this.high = high;
		this.low = low;
		this.price = price;
		this.volume = volume;
		this.latestTradingDay = latestTradingDay;
		this.previousClose = previousClose;
		this.change = change;
		this.changePercent = changePercent;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public String getLow() {
		return low;
	}

	public void setLow(String low) {
		this.low = low;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getLatestTradingDay() {
		return latestTradingDay;
	}

	public void setLatestTradingDay(String latestTradingDay) {
		this.latestTradingDay = latestTradingDay;
	}

	public String getPreviousClose() {
		return previousClose;
	}

	public void setPreviousClose(String previousClose) {
		this.previousClose = previousClose;
	}

	public String getChange() {
		return change;
	}

	public void setChange(String change) {
		this.change = change;
	}

	public String getChangePErcent() {
		return changePercent;
	}

	public void setChangePErcent(String changePercent) {
		this.changePercent = changePercent;
	}

	/*
	 * public static long getSerialversionuid() { return serialVersionUID; }
	 */

	@Override
	public String toString() {
		return "Stocks [symbol=" + symbol + ", open=" + open + ", high=" + high + ", low=" + low + ", price=" + price
				+ ", volume=" + volume + ", latestTradingDay=" + latestTradingDay + ", previousClose=" + previousClose
				+ ", change=" + change + ", changePercent=" + changePercent + "]";
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
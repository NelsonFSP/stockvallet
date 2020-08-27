package com.nelson.StockVallet.requisicoes;

import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.nelson.StockVallet.domain.Stocks;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Global Quote"
})
public class ApiRequisitionsImpl implements ApiRequisitions{
	
	
	RestTemplate restTemplate = new RestTemplate();
	@JsonProperty("Global Quote")
	public Stocks stocks ;
	
	@Override
	public void getStock(String stock, String key) {
	
		
			
		
		try {
			String url = "https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol=" + stock + "&apikey="+ key;
			//Stocks stocks = new Stocks();
			
			//Object obj = restTemplate.getForObject(url, Object.class);
			//System.out.println(obj.toString()); 
			
			 stocks = restTemplate.getForObject(url,Stocks.class);
			//stocks = (Stocks)obj;
			//System.out.println(stocks.toString());
			//Stocks stocks = (Stocks)restTemplate.getForObject(url, Object.class);
			//ResponseEntity<Stocks> call = restTemplate.getForEntity(url, Stocks.class);
			//System.out.println(call.getBody());
			//System.out.println(globalQuote.toString());
			System.out.println(stocks.toString());
			//System.out.println("Direto " + restTemplate.getForObject(url, String.class) );
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	
	
	
	

}

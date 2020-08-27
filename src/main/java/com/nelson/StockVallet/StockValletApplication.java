package com.nelson.StockVallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nelson.StockVallet.requisicoes.ApiRequisitionsImpl;

@SpringBootApplication
public class StockValletApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockValletApplication.class, args);
		
		ApiRequisitionsImpl apiRequest = new ApiRequisitionsImpl();
		
		String stock = "IBM";
		String key = "E984R8WCHCOGR43E";
		
		apiRequest.getStock(stock, key);
		
	}

}

package com.microservice.CurrencyConversionService;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	  @Autowired
	  private CurrencyExchangeServiceProxy proxy;
	  
	  @GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")  
	public CurrencyConversionBean convertCurrencyFeign(@PathVariable(name="from") String from, @PathVariable(name="to") String to,
		      @PathVariable(name="quantity") BigDecimal quantity){
		CurrencyConversionBean response = proxy.retrieveExchangeValue(from, to);
		logger.info("convert");
		return new CurrencyConversionBean(response.getId(), from, to, response.getConversionMultiple(), quantity,
		        quantity.multiply(response.getConversionMultiple()), response.getPort());
		
		
	}
}

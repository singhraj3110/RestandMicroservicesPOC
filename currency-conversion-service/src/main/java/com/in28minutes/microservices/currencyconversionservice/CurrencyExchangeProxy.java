package com.in28minutes.microservices.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//import com.in28minutes.microservices.currencyexchangeservice.ExchangeValue;

//@FeignClient(name="currency-exchange-service") // to call another minsroservices using less code -- commented so that ir doesn't connect it directly
@FeignClient(name="netflix-zuul-api-gateway-server") // commented upper line to use gateway to call exchangeservice through zull gateway but in this 
                                                     // we have to give the name of the service before the url check the second getmapping

@RibbonClient(name="currency-exchange-service") // for load balancing and also exchange instances are not hardcoded using these
public interface CurrencyExchangeProxy {
	
	/*
	 * @GetMapping("/currency-exchange/from/{from}/to/{to}") public
	 * CurrencyConversionBean retriveExchangeValue(@PathVariable("from") String
	 * from,@PathVariable("to") String to);
	 */
	@GetMapping("currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retriveExchangeValue(@PathVariable("from") String from,@PathVariable("to") String  to);

}

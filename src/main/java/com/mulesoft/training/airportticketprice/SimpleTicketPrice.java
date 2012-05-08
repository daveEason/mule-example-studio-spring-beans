package com.mulesoft.training.airportticketprice;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface SimpleTicketPrice {

	public String priceRequest(@WebParam(name= "airportCode") String airportCode) throws Exception;
	
}

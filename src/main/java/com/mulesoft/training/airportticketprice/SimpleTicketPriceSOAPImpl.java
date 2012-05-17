package com.mulesoft.training.airportticketprice;

import java.util.Map;
import javax.jws.WebService;

@WebService(endpointInterface = "com.mulesoft.training.airportticketprice.SimpleTicketPrice", serviceName = "SimpleTicketPrice")
public class SimpleTicketPriceSOAPImpl implements SimpleTicketPrice {

	private String responseString = "";
	private Map<String,String> priceMap;
	
	public String priceRequest(String airportCode) throws Exception
	{
		
		if(priceMap.containsKey(airportCode)){
			responseString = priceMap.get(airportCode);
		}
		else
		{
			responseString = "Unknown airport code: " + airportCode;
		}
		
		return responseString;
	}

	public Map<String,String> getPriceMap(){
		return priceMap;
	}
	
	public void setPriceMap(Map<String,String> priceMap){
		this.priceMap = priceMap;
	}

}

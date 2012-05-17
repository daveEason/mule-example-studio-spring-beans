package com.mulesoft.training.airportticketprice;

import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")
public class SimpleTicketPriceRESTImpl implements SimpleTicketPrice {

	private String responseString = "";
	private Map<String,String> priceMap;
	
	@GET
	@Produces("text/plain")
	@Path("/price/{airportCode}")
	public String priceRequest(@PathParam("airportCode") String airportCode) throws Exception
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

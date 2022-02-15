package com.HandBags.Proxy;

public class HandBags implements HBInterface{

	@Override
	public String getType(String Desc) {
		
		switch (Desc) {
		case "Quality":
			return "Long Lasting";
		case "Price":
			return "Price Factor";
		case "Brand":
			return "Most granular hierarchy";
		default:
			return "Not Details as expected";
		}
	}
	

}

package com.HandBags.Proxy;

public class HandBags implements HBInterface{

	@Override
	public String ExecuteFilter(String Desc) throws Exception {
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
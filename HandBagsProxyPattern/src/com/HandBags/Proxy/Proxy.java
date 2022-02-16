package com.HandBags.Proxy;

public class Proxy implements HBInterface{
	HandBags HB;
	@Override
	public String ExecuteFilter(String Desc) throws Exception {
		if(Desc == "Brand") {
			HB =  new HandBags();
		}
		return Desc;
	}

}

package com.HandBags.Proxy;

public class Settings {
	public HBInterface getPermission() {
		return new ProxyPermission();
	}
	
	public HBInterface getType() {
		return new HandBangs();
	}
}

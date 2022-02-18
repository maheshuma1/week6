package com.proxy;

import org.junit.Test;

public class UnitTest
{
	@Test
	public void aAllowedTest() {
		HBInterface allow = new HandBagsProxy();
        try
        {
            allow.permission("2-Sided");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
	}
	
	@Test
	public void bAllowedTest() {
		HBInterface allow = new HandBagsProxy();
        try
        {
        	allow.permission("Leather");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
	}
	
	
	@Test
	public void cBlockedTest() {
		HBInterface allow = new HandBagsProxy();
        try
        {
        	allow.permission("Trending");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
	}
	
	@Test
	public void dBlockedTest() {
		HBInterface allow = new HandBagsProxy();
        try
        {
        	allow.permission("OneSided");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
	}
}
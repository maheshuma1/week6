package com.proxy;

import java.util.ArrayList;
import java.util.List;
  
  
public class HandBagsProxy implements HBInterface
{
    private HBInterface allow = new RealInternet();
    private static List<String> banned;
      
    static
    {
    	banned = new ArrayList<String>();
    	banned.add("Trending");
    	banned.add("Rubber");
    	banned.add("OneSided");
    }
      
    @Override
    public void permission(String type) throws Exception
    {
        if(banned.contains(type))
        {
            throw new Exception(type+" - Access to this is Denied");
        }
          
        allow.permission(type);
    }
  
}


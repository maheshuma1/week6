package com.proxy;

import java.util.ArrayList;
import java.util.List;
  
  
public class HandBagsProxy implements HBInterface
{
    private HBInterface allow = new HandBagsReal();
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
            throw new Exception(type+" - Permission is not there for this type");
        }
          
        allow.permission(type);
    }
  
}


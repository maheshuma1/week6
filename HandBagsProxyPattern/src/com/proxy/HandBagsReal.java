package com.proxy;

public class HandBagsReal implements HBInterface
{
    @Override
    public void permission(String type)
    {
        System.out.println("Connecting to "+ type);
    }
}
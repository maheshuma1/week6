package com.proxy;

public class RealInternet implements HBInterface
{
    @Override
    public void permission(String type)
    {
        System.out.println("Connecting to "+ type);
    }
}
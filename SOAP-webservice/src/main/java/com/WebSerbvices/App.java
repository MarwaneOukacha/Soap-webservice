package com.WebSerbvices;

import jakarta.xml.ws.Endpoint;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        String url="http://localhost:9090/";
        Endpoint.publish(url,new BanqueWS());
        System.out.println(url);
    }
}

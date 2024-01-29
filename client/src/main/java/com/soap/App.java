package com.soap;
import proxyY.BanqueWS;
import proxyY.BanqueWSService;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        BanqueWS b=new BanqueWSService().getBanqueWSPort();
        System.out.println( "resultat depuis le service web: "+b.conversion(345) );

    }
}

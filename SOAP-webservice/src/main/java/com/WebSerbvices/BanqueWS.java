package com.WebSerbvices;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
@WebService(name = "BanqueWS")
public class BanqueWS {
    @WebMethod
    public double conversion(@WebParam(name = "montant") double mt){
        return mt*11.3;
    }
    @WebMethod
    public compte getCompte(@WebParam Long code){
        return new compte(code,Math.random()*8000,new Date());
    }
}

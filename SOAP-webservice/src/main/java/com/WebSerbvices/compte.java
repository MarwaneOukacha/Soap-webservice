package com.WebSerbvices;

import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.Date;
@XmlRootElement
public class compte implements Serializable {
    public compte(Long code, double solde, Date date) {
        this.code = code;
        this.solde = solde;
        this.date = date;
    }

    private Long code;
    private double solde;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public compte() {
        // Constructeur sans argument par défaut
    }
    private Date date;
}

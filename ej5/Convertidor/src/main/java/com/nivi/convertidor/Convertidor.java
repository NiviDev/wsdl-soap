/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.convertidor;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author nicov
 */
@WebService
public class Convertidor {
    @WebMethod
    public double celsAFahr(double cels) {
        double fahr = (cels * 1.8) + 32;
        return fahr;
    }
    @WebMethod
    public double fahrACels(double fahr) {
        double cels = (fahr - 32) / 1.8;
        return cels;
    }
    @WebMethod
    public double metrosAPies(double metros) {
        return metros * 3.281;
    }
    @WebMethod
    public double piesAMetros(double pies) {
        return pies / 3.281;
    }
    @WebMethod
    public double kgALb(double kg) {
        return kg * 2.205;
    }
    @WebMethod
    public double lbAKg(double lb) {
        return lb / 2.205;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.codigopostal;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author nicov
 */
@WebService
public class CodigoPostalWS {
    @WebMethod
    public String getCity(int codigo){
        CodigoPostalDAO cpDAO = new CodigoPostalDAO();
        return cpDAO.getCity(codigo);
    }
}

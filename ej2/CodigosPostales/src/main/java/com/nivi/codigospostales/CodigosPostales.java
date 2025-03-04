/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nivi.codigospostales;

import com.nivi.codigopostal.CodigoPostalWS;
import javax.xml.ws.Endpoint;

/**
 *
 * @author nicov
 */
public class CodigosPostales {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/codigosPostales", new CodigoPostalWS());
    }
}

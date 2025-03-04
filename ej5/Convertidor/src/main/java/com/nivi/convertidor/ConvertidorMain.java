/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.nivi.convertidor;

import javax.xml.ws.Endpoint;

/**
 *
 * @author nicov
 */
public class ConvertidorMain {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/convertidor", new Convertidor());
    }
}

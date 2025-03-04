/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.codigopostal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicov
 */
public class CodigoPostalDAO {

    private static List<CodigoPostal> codigos;

    private static void init() {
        codigos = new ArrayList();
        CodigoPostal c1 = new CodigoPostal(5700, "San Luis Ciudad");
        CodigoPostal c2 = new CodigoPostal(5400, "San Juan Ciudad");
        CodigoPostal c3 = new CodigoPostal(5500, "Mendoza Ciudad");
        CodigoPostal c4 = new CodigoPostal(5019, "Cordoba Ciudad");
        CodigoPostal c5 = new CodigoPostal(5001, "Juana Koslay");
        CodigoPostal c6 = new CodigoPostal(5613, "Malargüe");
        CodigoPostal c7 = new CodigoPostal(5730, "Villa Mercedes");
        codigos.add(c1);
        codigos.add(c2);
        codigos.add(c3);
        codigos.add(c4);
        codigos.add(c5);
        codigos.add(c6);
        codigos.add(c7);

    }

    public CodigoPostalDAO() {
        init();
    }

    public String getCity(int queryCodigo) {
        for(CodigoPostal codigoPostal : codigos){
            if (codigoPostal.getCodigo() == queryCodigo)
                return codigoPostal.getNombre();
        }
        return "Not Found";
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nivi.codigopostal;

import lombok.Data;

/**
 *
 * @author nicov
 */
@Data
public class CodigoPostal {

    private int codigo;
    private String nombre;

    public CodigoPostal(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
}

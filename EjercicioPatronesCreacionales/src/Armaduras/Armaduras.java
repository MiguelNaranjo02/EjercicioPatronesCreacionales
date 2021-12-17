/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armaduras;

import java.awt.Component;

/**
 * Clase Armaduras
 * 
 * 
 * 
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 * @version 1.0 15/12/2021
 */
public abstract class Armaduras {

    String nombreArmadura;
    String descripcionArmadura;
    String srcArmadura;

    public String getNombreArmadura() {
        return nombreArmadura;
    }

    public String getDescripcionArmadura() {
        return descripcionArmadura;
    }

    public String getSrcArmadura() {
        return srcArmadura;
    }
    

    public abstract void obtenerInfo();

}

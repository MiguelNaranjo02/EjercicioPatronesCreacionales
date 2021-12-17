/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armas;

/**
 * Clase Armas
 * 
 * 
 * 
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 * @version 1.0 15/12/2021
 */
public abstract class Armas {

    String nombreArmas;
    String descripcionArmas;
    String srcArmas;

    public String getNombreArmas() {
        return nombreArmas;
    }

    public String getDescripcionArmas() {
        return descripcionArmas;
    }

    public String getSrcArmas() {
        return srcArmas;
    }
    

    public abstract void obtenerInfo();
}

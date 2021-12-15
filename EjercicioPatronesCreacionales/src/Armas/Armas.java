/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armas;

/**
 *
 * @author Miguel
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

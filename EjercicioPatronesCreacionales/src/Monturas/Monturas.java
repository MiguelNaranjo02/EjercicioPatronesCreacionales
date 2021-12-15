/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monturas;

/**
 *
 * @author Miguel
 */
public abstract class Monturas {

    String nombreMontura;
    String descripcionMontura;
    String srcMontura;

    public String getNombreMontura() {
        return nombreMontura;
    }

    public String getDescripcionMontura() {
        return descripcionMontura;
    }

    public String getSrcMontura() {
        return srcMontura;
    }

    public abstract void obtenerInfo();
}

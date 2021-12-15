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
public class ArmasElfos extends Armas {

    public ArmasElfos() {
        nombreArmas = "";
        descripcionArmas = "";
        srcArmas = "";
    }

    @Override
    public void obtenerInfo() {
        System.out.println("Arma de elfo envainada");
        return;
    }
}

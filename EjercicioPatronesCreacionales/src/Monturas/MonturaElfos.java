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
public class MonturaElfos extends Monturas {

    public MonturaElfos() {

        nombreMontura = "";
        descripcionMontura = "";
        srcMontura = "";
    }

    @Override
    public void obtenerInfo() {
        System.out.println("Montura de elfo montada ");
        return;
    }

}

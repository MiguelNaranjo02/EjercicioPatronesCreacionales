/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Descripciones;

/**
 *
 * @author Miguel
 */
public class DescripcionEnanos extends Descripcion {

    public DescripcionEnanos() {
        descripcion = "";
    }

    @Override
    public void obtenerInfo() {
        System.out.println("Descripcion de enano dicha");
        return;
    }
}

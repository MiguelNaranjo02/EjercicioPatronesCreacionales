/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armaduras;

/**
 *
 * @author Miguel
 */
public class ArmadurasEnanos extends Armaduras {

    public ArmadurasEnanos() {
        nombreArmadura = "";
        descripcionArmadura = "";
        srcArmadura = "";
    }

    @Override
    public void obtenerInfo() {
        System.out.println("Armadura de enano puesta");
        return;
    }
}
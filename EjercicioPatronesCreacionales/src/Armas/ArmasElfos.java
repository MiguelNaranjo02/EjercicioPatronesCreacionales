/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armas;

/**
 * Clase ArmasElfos
 * 
 * 
 * 
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 * @version 1.0 15/12/2021
 */
public class ArmasElfos extends Armas {

    public ArmasElfos() {
        nombreArmas = "Arco y Flechas";
        descripcionArmas = "Es un arma certera \n"
        		+ "y liviana, hecha \n"
        		+ "especialmente para los elfos. \n"
        		+ "estos lo utilizan \n"
        		+ "con gran maestría \n"
        		+ "y causa muchas \n"
        		+ "bajas entre los \n"
        		+ "siervos enemigos \n";
        srcArmas = "Imagenes\\Arco.jpg";
    }

    @Override
    public void obtenerInfo() {
        System.out.println("Arma de elfo envainada");
        return;
    }
}

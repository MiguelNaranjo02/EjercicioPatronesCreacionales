/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armas;

/**
 * Clase ArmasHumanos
 * 
 * 
 * 
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 * @version 1.0 15/12/2021
 */
public class ArmasHumanos extends Armas {

    public ArmasHumanos() {
        nombreArmas = "Espada";
        descripcionArmas = "Las armas de los \n"
        		+ "humanos no son las mas \n"
        		+ "elaboradas de todas las \n"
        		+ "razas, consisten en un \n"
        		+ "un arma blanca de dos \n"
        		+ "filos, básicamente una \n"
        		+ "hoja recta cortante y \n"
        		+ "punzante, sus hojas de \n"
        		+ "acero templado no son \n"
        		+ "envidiables por las \n"
        		+ "demas razas \n";
        srcArmas = "Imagenes\\Espada.jpg";
    }

    @Override
    public void obtenerInfo() {
        System.out.println("Arma de humano envainada");
        return;
    }

}

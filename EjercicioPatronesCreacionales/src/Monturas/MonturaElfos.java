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

        nombreMontura = "Asfaloth";
        descripcionMontura = "Conocido como \n"
        		+ "�El m�s veloz de los caballos \n"
        		+ "de la Tierra Media� \n"
        		+ "es un corcel de altos Elfos, \n"
        		+ "pues solo ellos acostumbran \n"
        		+ "tener monturas. Se trata de \n"
        		+ "un caballo blanco, de \n"
        		+ "constituci�n ligera y veloz. \n"
        		+ "En las distancias cortas ning�n \n"
        		+ "caballo pod�a rivalizar con �l \n";
        srcMontura = "Imagenes\\MonturaElfos.jpg";
    }

    @Override
    public void obtenerInfo() {
        System.out.println("Montura de elfo montada ");
        return;
    }

}

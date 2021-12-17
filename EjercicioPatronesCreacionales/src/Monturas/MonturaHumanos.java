/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monturas;

/**
 * Clase MonturaEnanos
 * 
 * 
 * 
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 * @version 1.0 15/12/2021
 */
public class MonturaHumanos extends Monturas {

    public MonturaHumanos() {

        nombreMontura = "Caballo";
        descripcionMontura = "Los caballos son animales \n"
        		+ "que físicamente poseen un gran \n"
        		+ "porte. son utilizados para la lucha, \n"
        		+ "ya sea como caballería en un \n"
        		+ "enfrentamiento o en un combate \n"
        		+ "individual, ademas son adiestrados \n"
        		+ "para seguir siempre las ordenes \n"
        		+ "de el jinete, algo fundamental en \n"
        		+ "el campo de batalla.";
        srcMontura = "Imagenes\\MonturaHumanos.jpg";
    }

    @Override
    public void obtenerInfo() {
        System.out.println("Montura de humano montada ");
        return;
    }

}

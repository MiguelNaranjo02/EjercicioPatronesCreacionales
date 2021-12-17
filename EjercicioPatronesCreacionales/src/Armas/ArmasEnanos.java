/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armas;

/**
 * Clase ArmasEnanos
 * 
 * 
 * 
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 * @version 1.0 15/12/2021
 */
public class ArmasEnanos extends Armas {

    public ArmasEnanos() {
        nombreArmas = "Maza";
        descripcionArmas = "Atraviesan armaduras ligeras \n"
        		+ "con increíble efectividad, sobre \n"
        		+ "todo debido a lo afilado \n"
        		+ "del metal enano templado y, en \n"
        		+ "menor medida, a su \n"
        		+ "sencillo diseño de \n"
        		+ "doble filo. Las mazas \n"
        		+ "enanas son una prueba de la \n"
        		+ "maestria herrera de la raza. \n";
        srcArmas = "Imagenes\\Maza.jpg";
    }

    @Override
    public void obtenerInfo() {
        System.out.println("Arma de enano envainada");
        return;
    }

}

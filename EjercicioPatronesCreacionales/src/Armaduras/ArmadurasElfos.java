/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armaduras;

/**
 * Clase ArmadurasElfos
 * 
 * 
 * 
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 * @version 1.0 15/12/2021
 */
public class ArmadurasElfos extends Armaduras {
	
	/*
	 * Variables de la clase con sus respectivos valores de acuerdo a la instancia del personaje
	 * */
    public ArmadurasElfos() {
        nombreArmadura = "Armadura Elfica";
        descripcionArmadura = "Esta armadura esta hecha \n"
        		+ "de un metal plateado \n"
        		+ "precioso, muy ligero \n"
        		+ "pero capaz de proporcionar \n"
        		+ "la fuerza extrema en \n"
        		+ "las aleaciones, que se extraia por \n"
        		+ "los Enanos en las profundas \n"
        		+ "minas de Khazad-d?m. \n";
        srcArmadura = "Imagenes\\ArmaduraElfos.jpg";
    }

   

    @Override
    public void obtenerInfo() {
        System.out.println("Armadura de elfo puesta");
        return;
    }

}

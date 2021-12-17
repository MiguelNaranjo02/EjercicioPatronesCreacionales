/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armaduras;

/**
 * Clase ArmadurasEnanos
 * 
 * 
 * 
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 * @version 1.0 15/12/2021
 */
public class ArmadurasEnanos extends Armaduras {

    public ArmadurasEnanos() {
    	
    	/*
    	 * Variables de la clase con sus respectivos valores de acuerdo a la instancia del personaje
    	 * */
        nombreArmadura = "Armadura \n"
        		+ "Centurion";
        descripcionArmadura = "Cualquiera que haya \n"
        		+ "tenido en las manos un yelmo \n"
        		+ "de los enanos puede dar fe \n"
        		+ "de la calidad imperecedera de \n"
        		+ "los objetos fabricados por \n"
        		+ "ellos. los armeros enanos \n"
        		+ "confiaban casi exclusivamente \n"
        		+ "en crear primero materiales \n"
        		+ "de calidad, dejando asi que \n"
        		+ "las armaduras enanas estén \n"
        		+ "fabricadas para resistir \n"
        		+ "golpes increíblemente fuertes \n";
        srcArmadura = "Imagenes\\ArmaduraEnanos.jpg";
    }

    @Override
    public void obtenerInfo() {
        System.out.println("Armadura de enano puesta");
        return;
    }
}

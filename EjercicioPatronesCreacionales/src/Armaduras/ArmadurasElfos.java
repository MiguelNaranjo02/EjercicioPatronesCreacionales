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
public class ArmadurasElfos extends Armaduras {

    public ArmadurasElfos() {
        nombreArmadura = "Armadura Elfica";
        descripcionArmadura = "Esta armadura esta hecha \n"
        		+ "de un metal plateado \n"
        		+ "precioso, muy ligero \n"
        		+ "pero capaz de proporcionar \n"
        		+ "la fuerza extrema en \n"
        		+ "las aleaciones, que se extraia por \n"
        		+ "los Enanos en las profundas \n"
        		+ "minas de Khazad-dûm. \n";
        srcArmadura = "Imagenes\\ArmaduraElfos.jpg";
    }

   

    @Override
    public void obtenerInfo() {
        System.out.println("Armadura de elfo puesta");
        return;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Armaduras;

/**
 * Clase ArmadurasHumanos
 * 
 * 
 * 
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 * @version 1.0 15/12/2021
 */
public class ArmadurasHumanos extends Armaduras {

    public ArmadurasHumanos() {
        nombreArmadura = "Cota de Malla";
        descripcionArmadura = "La cota de malla es uno \n"
        		+ "de los tipos de protecci�n \n"
        		+ "met�lica de mayor tradici�n \n"
        		+ "en los hombres,  La cota de \n"
        		+ "malla es especialmente \n"
        		+ "eficaz contra golpes tajantes, \n"
        		+ "La cota de mallas tiene la \n"
        		+ "ventaja de su flexibilidad, \n"
        		+ "pero es mucho m�s pesada de lo \n"
        		+ "que en principio puede parecer, \n"
        		+ "en torno a 10-15 kg, a menudo"
        		+ "estas se usan con su complemento, \n"
        		+ "corazas de placa met�lica, \n"
        		+ "no m�s pesadas.";
        srcArmadura = "Imagenes\\ArmaduraHumanos.jpg";
    }

    @Override
    public void obtenerInfo() {
        System.out.println("Armadura de humano puesta");
        return;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Descripciones;

/**
 *
 * @author Miguel
 */
public class DescripcionElfos extends Descripcion {

    public DescripcionElfos() {
        descripcion = "Los Elfos fueron la m�s antigua y \n"
        		+ "noble de las razas hablantes de \n"
        		+ "la Tierra Media. Tambi�n \n"
        		+ "llamados la Gente hermosa, \n"
        		+ "Pueblo del Bosque. Son la \n"
        		+ "raza m�s antigua del \n"
        		+ "mundo y son los primeros \n"
        		+ "hijos de Eru Iluvatar en \n"
        		+ "venir al mundo y m�s tarde \n"
        		+ "encontrados por los Valar. Los \n"
        		+ "Elfos son seres inmortales que \n"
        		+ "no envejecen como los mortales. \n"
        		+ "A los 50 a�os de edad, los elfos \n"
        		+ "alcanzan el aspecto \n"
        		+ "final que tendr�n \n"
        		+ "el resto de su existencia y su \n"
        		+ "crecimiento o desarrollo f�sico \n"
        		+ "se detiene al alcanzar los 100.\n"
        		+ "Son m�s presistentes en mente \n"
        		+ "y espiritu que los hombres \n"
        		+ "y los enanos y son tambien \n"
        		+ "m�s h�biles que estos.\n";
        srcPersonaje = "Imagenes\\Elfo.jpg";
    }
    
    @Override
    public void obtenerInfo() {
        System.out.println("Descripcion de elfo dicha");
        return;
    }

}

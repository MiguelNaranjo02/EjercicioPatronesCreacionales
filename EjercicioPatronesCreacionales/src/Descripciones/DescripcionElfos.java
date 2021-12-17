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
        descripcion = "Los Elfos fueron la más antigua y \n"
        		+ "noble de las razas hablantes de \n"
        		+ "la Tierra Media. También \n"
        		+ "llamados la Gente hermosa, \n"
        		+ "Pueblo del Bosque. Son la \n"
        		+ "raza más antigua del \n"
        		+ "mundo y son los primeros \n"
        		+ "hijos de Eru Iluvatar en \n"
        		+ "venir al mundo y más tarde \n"
        		+ "encontrados por los Valar. Los \n"
        		+ "Elfos son seres inmortales que \n"
        		+ "no envejecen como los mortales. \n"
        		+ "A los 50 años de edad, los elfos \n"
        		+ "alcanzan el aspecto \n"
        		+ "final que tendrán \n"
        		+ "el resto de su existencia y su \n"
        		+ "crecimiento o desarrollo físico \n"
        		+ "se detiene al alcanzar los 100.\n"
        		+ "Son más presistentes en mente \n"
        		+ "y espiritu que los hombres \n"
        		+ "y los enanos y son tambien \n"
        		+ "más hábiles que estos.\n";
        srcPersonaje = "Imagenes\\Elfo.jpg";
    }
    
    @Override
    public void obtenerInfo() {
        System.out.println("Descripcion de elfo dicha");
        return;
    }

}

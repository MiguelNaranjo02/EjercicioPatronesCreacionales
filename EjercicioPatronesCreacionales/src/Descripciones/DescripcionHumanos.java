package Descripciones;

/**
 * Clase DescripcionHumanos
 * 
 * 
 * 
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 * @version 1.0 15/12/2021
 */
public class DescripcionHumanos extends Descripcion {

    public DescripcionHumanos() {
        descripcion = "Los hombres son los Hijos \n"
        		+ "Menores de Ilúvatar y fueron \n"
        		+ "conocidos por muchos \n"
        		+ "nombres entre los Eldar \n"
        		+ "o elfos, Poco se dice de \n"
        		+ "los hombres en los relatos \n"
        		+ "de los Días Antiguos, se \n"
        		+ "sabe que despertaron en \n"
        		+ "Hildórien, en las regiones \n"
        		+ " mas orientales de la Tierra \n"
        		+ "Media durante la Primera \n"
        		+ "Edad del Sol. eran \n"
        		+ "eminentemente rurales. A medida \n"
        		+ "que llegaban se establecieron \n"
        		+ "en Estolad, en el este, pero \n"
        		+ "luego migraron a sus destinos \n"
        		+ "definitivos, sin embargo siempre \n"
        		+ "hubo hombres en esta region, \n"
        		+ "sobretodo en la zona oriental, \n"
        		+ "no de una casa definida, \n"
        		+ "eran una mezcolanza de las tres.\n";
        srcPersonaje = "Imagenes\\Humano.jpeg";
    }
    

    @Override
    public void obtenerInfo() {
        System.out.println("Descripcion de humano dicha");
        return;
    }

}

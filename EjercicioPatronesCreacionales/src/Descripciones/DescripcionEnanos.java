package Descripciones;

/**
 * Clase DescripcionEnanos
 * 
 * 
 * 
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 * @version 1.0 15/12/2021
 */
public class DescripcionEnanos extends Descripcion {

    public DescripcionEnanos() {
        descripcion = "los enanos no fueron creados \n"
        		+ "directamente por Il?vatar, sino \n"
        		+ "por el vala Aul? tomando alg?n \n"
        		+ " mineral de las profundidades \n"
        		+ "de la tierra, se sospecha que \n"
        		+ "debi? haber sido uno muy duro \n"
        		+ "debido a la alta resistencia \n"
        		+ "de estos seres, son m?s bajos \n"
        		+ "que los hombres con una altura \n"
        		+ "de entre 120 y 150 cent?metros, \n"
        		+ "pese a ello son robustos, \n" 
        		+ "corpulentosy m?s fuertes \n"
        		+ "y recios que el \n"
        		+ "resto de las razas. Todos tienen \n"
        		+ "barba, tanto hombres como \n"
        		+ "mujeres, Son grandes \n"
        		+ "conocedores de la miner?a \n"
        		+ " y orfebrer?a agobiados por la \n"
        		+ "larga labor de la busqueda y \n"
        		+ "extracci?n de los minerales \n"
        		+ "subterraneos";
        srcPersonaje = "Imagenes\\Enano.jpeg";
    }

    @Override
    public void obtenerInfo() {
        System.out.println("Descripcion de enano dicha");
        return;
    }
}

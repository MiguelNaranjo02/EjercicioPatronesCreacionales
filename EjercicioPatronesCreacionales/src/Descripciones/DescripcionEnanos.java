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
public class DescripcionEnanos extends Descripcion {

    public DescripcionEnanos() {
        descripcion = "los enanos no fueron creados \n"
        		+ "directamente por Ilúvatar, sino \n"
        		+ "por el vala Aulë tomando algún \n"
        		+ " mineral de las profundidades \n"
        		+ "de la tierra, se sospecha que \n"
        		+ "debió haber sido uno muy duro \n"
        		+ "debido a la alta resistencia \n"
        		+ "de estos seres, son más bajos \n"
        		+ "que los hombres con una altura \n"
        		+ "de entre 120 y 150 centímetros, \n"
        		+ "pese a ello son robustos, \n" 
        		+ "corpulentosy más fuertes \n"
        		+ "y recios que el \n"
        		+ "resto de las razas. Todos tienen \n"
        		+ "barba, tanto hombres como \n"
        		+ "mujeres, Son grandes \n"
        		+ "conocedores de la minería \n"
        		+ " y orfebrería agobiados por la \n"
        		+ "larga labor de la busqueda y \n"
        		+ "extracción de los minerales \n"
        		+ "subterraneos";
    }

    @Override
    public void obtenerInfo() {
        System.out.println("Descripcion de enano dicha");
        return;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monturas;

/**
 *
 * @author Miguel
 */
public class MonturaEnanos extends Monturas {

    public MonturaEnanos() {

        nombreMontura = "Centurion";
        descripcionMontura = "Inspirados en su \n"
        		+ "iconica armadura, el justamente \n"
        		+ "temido \"centuri�n\", cuya \n"
        		+ "altura puede doblar o \n"
        		+ "centuplicar la estatura \n"
        		+ "humana seg�n los testimonios \n"
        		+ "a los que se otorgue \n"
        		+ "verosimilitud. son m�quinas \n"
        		+ "militares enanas blindadas \n"
        		+ "y fuertemente armados \n";
        srcMontura = "Imagenes\\Centurion.jpg";
    }

    @Override
    public void obtenerInfo() {
        System.out.println("Montura de enano montada ");
        return;
    }
}

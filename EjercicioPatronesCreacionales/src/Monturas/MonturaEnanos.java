/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monturas;

/**
 * Clase MonturaEnanos
 * 
 * 
 * 
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 * @version 1.0 15/12/2021
 */
public class MonturaEnanos extends Monturas {

    public MonturaEnanos() {

        nombreMontura = "Centurion";
        descripcionMontura = "Inspirados en su \n"
        		+ "iconica armadura, el justamente \n"
        		+ "temido \"centurión\", cuya \n"
        		+ "altura puede doblar o \n"
        		+ "centuplicar la estatura \n"
        		+ "humana según los testimonios \n"
        		+ "a los que se otorgue \n"
        		+ "verosimilitud. son máquinas \n"
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

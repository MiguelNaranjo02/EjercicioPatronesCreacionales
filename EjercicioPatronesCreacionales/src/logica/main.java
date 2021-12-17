/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import InterfazGrafica.Menu;
import java.awt.EventQueue;

/**
 * Clase Principal
 * 
 * Clase tipo main, instancia las interfaces.
 * 
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 * @version 1.0 15/12/2021
 */
public class main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			/*
			 * Se instancia el frame menu para inicar la interfaz del programa.
			 * */
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Descripciones;

/**
 * Clase Descripcion
 * 
 * 
 * 
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 * @version 1.0 15/12/2021
 */
public abstract class Descripcion {
	String descripcion;
	String srcPersonaje;

	public String getDescripcion() {
		return descripcion;
	}

	public String getSrcPersonaje() {
		return srcPersonaje;
	}

	public abstract void obtenerInfo();
}

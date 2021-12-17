/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Armaduras.Armaduras;
import Armaduras.ArmadurasEnanos;
import Armas.Armas;
import Armas.ArmasEnanos;
import Descripciones.Descripcion;
import Descripciones.DescripcionEnanos;
import Monturas.MonturaEnanos;
import Monturas.Monturas;

/**
 * Clase FabricaEnanos
 * 
 * 
 * 
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 * @version 1.0 15/12/2021
 */
public class FabricaEnanos implements FabricaRazas {

    public Armaduras CrearArmaduras() {
        return new ArmadurasEnanos();
    }

    public Monturas CrearMontura() {
        
        return new MonturaEnanos();
    }

    public Armas CrearArmas() {
      
        return new ArmasEnanos();
    }

    public Descripcion CrearDescripcion() {
        
        return new DescripcionEnanos();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Armaduras.Armaduras;
import Armaduras.ArmadurasElfos;
import Armas.Armas;
import Armas.ArmasElfos;
import Descripciones.Descripcion;
import Descripciones.DescripcionElfos;
import Monturas.MonturaElfos;
import Monturas.Monturas;

/**
 * Clase FabricaElfos
 * 
 * 
 * 
 * @author Miguel A. Naranjo, Cristian C. Tuso.
 * @version 1.0 15/12/2021
 */
public class FabricaElfos implements FabricaRazas {

    public Armaduras CrearArmaduras() {
        return new ArmadurasElfos();
    }

    public Monturas CrearMontura() {
        return new MonturaElfos();
    }

    public Armas CrearArmas() {

        return new ArmasElfos();
    }

    public Descripcion CrearDescripcion() {

        return new DescripcionElfos();
    }

}

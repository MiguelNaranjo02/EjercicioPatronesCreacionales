/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Armaduras.Armaduras;
import Armaduras.ArmadurasHumanos;

import Armas.Armas;
import Armas.ArmasHumanos;

import Descripciones.Descripcion;
import Descripciones.DescripcionHumanos;
import Monturas.MonturaHumanos;

import Monturas.Monturas;

/**
 *
 * @author Miguel
 */
public class FabricaHumanos implements FabricaRazas {

    public Armaduras CrearArmaduras() {

        return new ArmadurasHumanos();
    }

    public Monturas CrearMontura() {

        return new MonturaHumanos();
    }

    public Armas CrearArmas() {

        return new ArmasHumanos();
    }

    public Descripcion CrearDescripcion() {

        return new DescripcionHumanos();
    }

}

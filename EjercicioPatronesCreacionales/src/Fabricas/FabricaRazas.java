package Fabricas;

import Armaduras.Armaduras;
import Armas.Armas;
import Descripciones.Descripcion;
import Monturas.Monturas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Miguel
 */
public interface FabricaRazas {

    public Monturas CrearMontura();

    public Armas CrearArmas();

    public Armaduras CrearArmaduras();

    public Descripcion CrearDescripcion();

}

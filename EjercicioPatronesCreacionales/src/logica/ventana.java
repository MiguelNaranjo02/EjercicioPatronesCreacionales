/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Armaduras.Armaduras;
import Armas.Armas;
import Descripciones.Descripcion;
import Fabricas.FabricaElfos;
import Fabricas.FabricaEnanos;
import Fabricas.FabricaHumanos;
import Fabricas.FabricaRazas;
import Monturas.Monturas;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class ventana {

    public void operacion() {
        FabricaRazas fabrica = null;
        Armaduras armadu;
        Armas arma;
        Monturas montu;
        Descripcion descrip;
        Scanner escaner;
        int opcion = 0;
        String SrcPersonaje;
        escaner = new Scanner(System.in);

        do {
            System.out.println("Ingrese 1 para Elfos o 2 para Enanos o 3 para Humanos");
            opcion = escaner.nextInt();
        } while (opcion != 1 && opcion != 2 && opcion != 3);

        switch (opcion) {
            case 1:
                fabrica = new FabricaElfos();
                SrcPersonaje = "";
                break;
            case 2:
                fabrica = new FabricaEnanos();
                SrcPersonaje = "";
                break;
            case 3:
                fabrica = new FabricaHumanos();
                SrcPersonaje = "";
                break;
        }
        opcion = 0;
        do {
            System.out.println("Ingrese el numero de personajes que va a pedir");
            opcion = escaner.nextInt();
        } while (opcion == 0 || opcion > 7);

        armadu = fabrica.CrearArmaduras();
        arma = fabrica.CrearArmas();
        montu = fabrica.CrearMontura();
        descrip = fabrica.CrearDescripcion();

        armadu.obtenerInfo();
        arma.obtenerInfo();
        montu.obtenerInfo();
        descrip.obtenerInfo();

        System.out.println(armadu.getNombreArmadura());
        System.out.println(armadu.getDescripcionArmadura());
        System.out.println(armadu.getSrcArmadura());

        System.out.println(arma.getNombreArmas());
        System.out.println(arma.getDescripcionArmas());
        System.out.println(arma.getSrcArmas());

        System.out.println(descrip.getDescripcion());

        System.out.println(montu.getNombreMontura());
        System.out.println(montu.getDescripcionMontura());
        System.out.println(montu.getSrcMontura());

    }
}

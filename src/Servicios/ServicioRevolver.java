/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Revolver;

/**
 *
 * @author Mariana
 */
public class ServicioRevolver {

    
    public Revolver llenarrevolver() {
        Revolver r1 = new Revolver();
        r1.setPosicionActual((int) (Math.random() * 6 + 1));
        r1.setPosicionAgua((int) (Math.random() * 6 + 1));
        return r1;
    }

    public boolean mojar(Revolver r1) {
       // boolean mojado;
//        if (r1.getPosicionActual() == r1.getPosicionAgua()) {
//            mojado = true;
//        } else {
//            mojado = false;
//        }
        return r1.getPosicionActual() == r1.getPosicionAgua();
    }
    
    public void siguienteChorro(Revolver r1) {
        if (r1.getPosicionActual()== 6) {
            r1.setPosicionActual(1);
        } else {
            r1.setPosicionActual(r1.getPosicionActual()+1);
        }
    }
    
    public void imprimirPosiciones(Revolver r1) {
        System.out.println("La posición actual es: "+r1.getPosicionActual());
        System.out.println("La posición de agua es: "+r1.getPosicionAgua());
    }

}

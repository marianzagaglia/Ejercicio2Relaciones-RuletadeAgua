/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciorelaciones2;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import Servicios.ServicioJuego;
import Servicios.ServicioJugador;
import Servicios.ServicioRevolver;

/**
 *
 * @author Mariana
 */
public class EjercicioRelaciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioJugador sjo = new ServicioJugador();
        ServicioRevolver sro = new ServicioRevolver();
        ServicioJuego sjo2 = new ServicioJuego();
        
        Jugador j1 = new Jugador();
        
        Revolver r1 = sro.llenarrevolver();
        
        Juego j2 = sjo2.llenarJuego(sjo.crearJugadores(), r1);
        
        sjo2.ronda(j2);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;

/**
 *
 * @author Mariana
 */
public class ServicioJuego {
    
    ServicioJugador sj = new ServicioJugador();
    public Juego llenarJuego (ArrayList<Jugador> jugadores, Revolver r1){
        Juego jn = new Juego();
        jn.setJugadores(jugadores);
        jn.setRevolver(r1);
        //jn.getJugadores().toString();
        //Revolver.toString();
        return jn;
    }
    
    public void ronda(Juego jn) {
        boolean mojado=false;
         do {
             for (Jugador aux : jn.getJugadores()) {
                 System.out.println(jn.getRevolver());
                 sj.disparo(jn.getRevolver(), aux);
                 
                 if (aux.isMojado()==true) {
                     System.out.println("El jugador "+aux.getNombre()+" se mojó");
                     System.out.println("FIN DEL JUEGO");
                     mojado=true;
                     break;
                 } else {
                     System.out.println("El jugador "+aux.getNombre()+" no se mojó");
                 }
             }
        } while (mojado==false);
           
           
            
        }
  
    }


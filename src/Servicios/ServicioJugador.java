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
import java.util.Scanner;

/**
 *
 * @author Mariana
 */
public class ServicioJugador {

    ServicioRevolver sr = new ServicioRevolver();
    //Juego juego = new Juego();
    

    public void disparo(Revolver r1, Jugador j1) {
        if (sr.mojar(r1)) {
            j1.setMojado(true);
        } else {
             sr.siguienteChorro(r1);
        }
    }

    public ArrayList<Jugador> crearJugadores() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
        System.out.println("Ingrese la cantidad de jugadores");
        int cantjug = leer.nextInt();
        if (cantjug < 1 || cantjug > 6) {
            cantjug = 6;
        } else {
            cantjug = cantjug;
        }
        ArrayList<Jugador> jugadores = new ArrayList();
        for (int i = 0; i < cantjug; i++) {
            Jugador j1 = new Jugador();
            System.out.println("Ingrese el nombre del jugador n° " + (i + 1));
            j1.setNombre(leer.next());
            System.out.println("Ingrese el ID del jugador n° " + (i + 1));
            j1.setId(leer.nextInt());
            jugadores.add(j1);
        }
        //juego.setJugadores(jugadores);
        //System.out.println(juego.toString());
        return jugadores;
    }

}

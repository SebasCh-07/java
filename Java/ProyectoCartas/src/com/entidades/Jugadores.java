package com.entidades;

import java.util.ArrayList;

import com.servicios.Juego;

public class Jugadores {
	private ArrayList<String> jugadores;

	public Jugadores() {
		jugadores = new ArrayList<>();
	}

	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}

	
	public void jugar() {
		Juego juego = new Juego(jugadores);
		juego.entregarCartas(5);
		
		ArrayList<ArrayList<Carta>> cartasDeJugadores = juego.getCartasJugador();
        int totalMayor = 0;
        String ganador = "";
		
		for(int i = 0; i<jugadores.size();i++) {
			 ArrayList<Carta> cartasJugador = cartasDeJugadores.get(i);
			 int totalJugador = 0;
			 
			 for(int o = 0; o<cartasJugador.size(); o++ ) {
				 Carta carta = cartasJugador.get(o);
				 totalJugador += carta.getNumero().getValor();
			 }
			 
			 System.out.println("Jugador " + (i + 1) + " - " + jugadores.get(i) + ": Total = " + totalJugador);
			 
			 if (totalJugador > totalMayor) {
	                totalMayor = totalJugador;
	                ganador = jugadores.get(i);
	            }
		}
	}
	
}

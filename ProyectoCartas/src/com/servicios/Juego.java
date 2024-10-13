package com.servicios;

import java.util.ArrayList;
import com.entidades.Carta;
import com.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugadores;
	private ArrayList<Carta> naipeBarajado;
	private ArrayList<String> jugadores;

	public Juego(ArrayList<String> idJugador) {
		cartasJugadores = new ArrayList<ArrayList<Carta>>();
		jugadores = idJugador;
		cartasJugadores.add(new ArrayList<>());

		for (int i = 0; i < idJugador.size(); i++) {
			cartasJugadores.add(new ArrayList<Carta>());

			naipe = new Naipe();
			naipeBarajado = naipe.barajar();
		}
	}

	public ArrayList<ArrayList<Carta>> getCartasJugador() {
		return cartasJugadores;
	}

	public void entregarCartas(int cartasPorJugador) {
		int numJugadores = jugadores.size();
		int indice = 0;

		for (int i = 0; i < cartasPorJugador; i++) {
			for (int o = 0; o < numJugadores; o++) {
				cartasJugadores.get(o).add(naipeBarajado.get(indice));
				indice++;

			}
		}
	}

	public int devolverTotal(int idJugador) {
		int sumaValores = 0;
		for (int i = 0; i < cartasJugadores.get(idJugador).size(); i++) {
			ArrayList<Carta> cartas = cartasJugadores.get(idJugador);
			sumaValores +=cartas.get(i).getNumero().getValor();
		}

		return sumaValores;
	}
	
	public String determinarGanador() {
		String idGanador = jugadores.get(0);
		int sumaGanador = devolverTotal(0);
		for (int i=0; i<jugadores.size();i++) {
			int total = devolverTotal(i);
			if(total>=sumaGanador) {
				idGanador = jugadores.get(i);
				sumaGanador = total;
			}
		}
		return idGanador;		
		
		
		
		
	}

}

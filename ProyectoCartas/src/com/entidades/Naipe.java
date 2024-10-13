package com.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;

	public Naipe() {
		cartas = new ArrayList<Carta>();
		numerosPosibles = new ArrayList<Numero>();
		numerosPosibles.add(new Numero("A", 11));
		numerosPosibles.add(new Numero("2", 2));
		numerosPosibles.add(new Numero("3", 3));
		numerosPosibles.add(new Numero("4", 4));
		numerosPosibles.add(new Numero("5", 5));
		numerosPosibles.add(new Numero("7", 7));
		numerosPosibles.add(new Numero("6", 6));
		numerosPosibles.add(new Numero("8", 8));
		numerosPosibles.add(new Numero("9", 9));
		numerosPosibles.add(new Numero("10", 10));
		numerosPosibles.add(new Numero("J", 10));
		numerosPosibles.add(new Numero("Q", 10));
		numerosPosibles.add(new Numero("K", 10));

		ArrayList<String> palos = new ArrayList<String>();
		Palos palo1 = new Palos();
		palos.add(palo1.getCorazonNegro());
		palos.add(palo1.getCorazonRojo());
		palos.add(palo1.getDiamante());
		palos.add(palo1.getTrebol());

		for (int i = 0; i < numerosPosibles.size(); i++) {
			Numero num = numerosPosibles.get(i);
			for (int o = 0; o < palos.size(); o++) {
				String palo = palos.get(o);
				cartas.add(new Carta(num, palo));
			}
		}
		
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public ArrayList<Carta> barajar() {
		ArrayList<Carta> auxiliar = new ArrayList<Carta>();
		for (int i = 0; i<52 ; i++)  {
			int numRandom = Random.obtenerPosicion();
			Carta c1 = cartas.get(numRandom);
			if(c1.getEstado().equals("N")) {
				auxiliar.add(c1);
				c1.setEstado("C");
			}
		}
		for(int i = 0; i<cartas.size();i++) {
			Carta c2 = cartas.get(i);
			if(c2.getEstado().equals("N")) {
				auxiliar.add(c2);
				c2.setEstado("C");
			}
		}
		return auxiliar;
	}

}

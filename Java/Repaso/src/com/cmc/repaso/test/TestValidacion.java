package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validacion validar = new Validacion();
		validar.validarMonto(-2);
		validar.validarMonto(20);
		validar.validarMonto(5);
		
	}

}

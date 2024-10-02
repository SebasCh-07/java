package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta1 = new Cuenta("03476");

		cuenta1.setSaldo(675);

		// ---------------------------------------
		Cuenta cuenta2 = new Cuenta("03476", "C", 98.00);

		// ---------------------------------------
		Cuenta cuenta3 = new Cuenta("03476");
		cuenta3.setTipo("C");

		// ----------------------------------------
		System.out.println("-------Valores Iniciales--------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
	}

}

package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private double saldo;
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {
		this.celda1 = new Celda(codigo1);
		this.celda2 = new Celda(codigo2);
		this.celda3 = new Celda(codigo3);
		this.celda4 = new Celda(codigo4);
	}

	public void mostrarConfiguracion() {
		System.out.println("Celda 1: " + celda1.getCodigo());
		System.out.println("Celda 2: " + celda2.getCodigo());
		System.out.println("Celda 3: " + celda3.getCodigo());
		System.out.println("Celda 4: " + celda4.getCodigo());
	}

	public Celda buscarCelda(String codigo) {
		if (celda1.getCodigo() == codigo) {
			return celda1;
		} else if (celda2.getCodigo() == codigo) {
			return celda2;
		} else if (celda3.getCodigo() == codigo) {
			return celda3;
		} else if (celda4.getCodigo() == codigo) {
			return celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto producto, String codigo, int productosColocar) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, productosColocar);
	}

	public void mostrarProductos() {
		if (celda1.getProducto() != null) {
			System.out.println("**********CELDA " + celda1.getCodigo());
			System.out.println("Stock: " + celda1.getStock());
			System.out.println("Nombre Producto: " + celda1.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda1.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + celda1.getProducto().getCodigo());
		} else {
			System.out.println("**********CELDA " + celda1.getCodigo());
			System.out.println("Stock: " + celda1.getStock());
			System.out.println("La celda no tiene Producto!!!");
		}

		if (celda2.getProducto() != null) {
			System.out.println("**********CELDA " + celda2.getCodigo());
			System.out.println("Stock: " + celda2.getStock());
			System.out.println("Nombre Producto: " + celda2.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda2.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + celda2.getProducto().getCodigo());
		} else {
			System.out.println("**********CELDA " + celda2.getCodigo());
			System.out.println("Stock: " + celda2.getStock());
			System.out.println("La celda no tiene Producto!!!");
		}

		if (celda3.getProducto() != null) {
			System.out.println("**********CELDA " + celda3.getCodigo());
			System.out.println("Stock: " + celda3.getStock());
			System.out.println("Nombre Producto: " + celda3.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda3.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + celda3.getProducto().getCodigo());
		} else {
			System.out.println("**********CELDA " + celda3.getCodigo());
			System.out.println("Stock: " + celda3.getStock());
			System.out.println("La celda no tiene Producto!!!");
		}

		if (celda4.getProducto() != null) {
			System.out.println("**********CELDA " + celda4.getCodigo());
			System.out.println("Stock: " + celda4.getStock());
			System.out.println("Nombre Producto: " + celda4.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda4.getProducto().getPrecio());
			System.out.println("Codigo Producto: " + celda4.getProducto().getCodigo());
			System.out.println("Saldo: " + saldo);
		} else {
			System.out.println("**********CELDA " + celda4.getCodigo());
			System.out.println("Stock: " + celda4.getStock());
			System.out.println("La celda no tiene Producto!!!");
			System.out.println("Saldo: " + saldo);
		}
	}

	public Producto buscarProductoEnCelda(String codigo) {
		if (celda1.getCodigo() == codigo) {
			return celda1.getProducto();
		} else if (celda2.getCodigo() == codigo) {
			return celda2.getProducto();
		} else if (celda3.getCodigo() == codigo) {
			return celda3.getProducto();
		} else if (celda4.getCodigo() == codigo) {
			return celda4.getProducto();
		} else {
			return null;
		}
	}

	public double consultarPrecio(String codigo) {
		if (celda1.getCodigo() == codigo) {
			Producto p1 = new Producto("", "", 0);
			p1 = celda1.getProducto();
			return p1.getPrecio();
		} else if (celda2.getCodigo() == codigo) {
			Producto p2 = new Producto("", "", 0);
			p2 = celda2.getProducto();
			return p2.getPrecio();
		} else if (celda3.getCodigo() == codigo) {
			Producto p3 = new Producto("", "", 0);
			p3 = celda3.getProducto();
			return p3.getPrecio();
		} else if (celda4.getCodigo() == codigo) {
			Producto p4 = new Producto("", "", 0);
			p4 = celda4.getProducto();
			return p4.getPrecio();
		} else {
			return 0.0;
		}
	}

	public Celda buscarCeldaProducto(String codigoProducto) {

		if (celda1.getProducto() != null) {
			if (celda1.getProducto().getCodigo() == codigoProducto) {
				return celda1;
			}
		}
		if (celda2.getProducto() != null) {
			if (celda2.getProducto().getCodigo() == codigoProducto) {
				return celda2;
			}
		}
		if (celda3.getProducto() != null) {
			if (celda3.getProducto().getCodigo() == codigoProducto) {
				return celda3;
			}
		}
		if (celda4.getProducto() != null) {
			if (celda4.getProducto().getCodigo() == codigoProducto) {
				return celda4;
			}
		}
		return null;
	}

	public void incrementarProductos(String codigoProducto, int cantidadIntems) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		celdaEncontrada.setStock(celdaEncontrada.getStock() + cantidadIntems);
	}

	public void vender(String codigoCelda) {
		if (celda1.getCodigo() == codigoCelda) {
			celda1.setStock(celda1.getStock() - 1);
			saldo = saldo + celda1.getProducto().getPrecio();

		} else if (celda2.getCodigo() == codigoCelda) {
			celda2.setStock(celda2.getStock() - 1);
			saldo = saldo + celda2.getProducto().getPrecio();

		} else if (celda3.getCodigo() == codigoCelda) {
			celda3.setStock(celda3.getStock() - 1);
			saldo = saldo + celda3.getProducto().getPrecio();

		} else if (celda4.getCodigo() == codigoCelda) {
			celda4.setStock(celda4.getStock() - 1);
			saldo = saldo + celda4.getProducto().getPrecio();
		}
	}

	public double venderConCambio(String codigoCelda, double valorIngresado) {
		if (celda1.getCodigo() == codigoCelda) {
			Producto p1 = new Producto("", "", 0);
			p1 = celda1.getProducto();
			celda1.setStock(celda1.getStock() - 1);
			double vuelto = valorIngresado - p1.getPrecio();
			saldo = (saldo + valorIngresado) - vuelto;
			return vuelto;

		} else if (celda2.getCodigo() == codigoCelda) {
			Producto p2 = new Producto("", "", 0);
			p2 = celda2.getProducto();
			celda2.setStock(celda2.getStock() - 1);
			double vuelto = valorIngresado - p2.getPrecio();
			saldo = (saldo + valorIngresado) - vuelto;
			return vuelto;

		} else if (celda3.getCodigo() == codigoCelda) {
			Producto p3 = new Producto("", "", 0);
			p3 = celda3.getProducto();
			celda3.setStock(celda3.getStock() - 1);
			double vuelto = valorIngresado - p3.getPrecio();
			saldo = (saldo + valorIngresado) - vuelto;
			return vuelto;

		} else if (celda4.getCodigo() == codigoCelda) {
			Producto p4 = new Producto("", "", 0);
			p4 = celda4.getProducto();
			celda4.setStock(celda4.getStock() - 1);
			double vuelto = valorIngresado - p4.getPrecio();
			saldo = (saldo + valorIngresado) - vuelto;
			return vuelto;

		} else {
			return 0;
		}
	}

}

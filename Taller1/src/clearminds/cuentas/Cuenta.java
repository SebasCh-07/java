package clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo;
	private double saldo;

	public String getId() {
		return id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cuenta(String id) {
		this.tipo = "A";
		this.id = id;
	}

	public Cuenta(String id, String tipo, Double saldo) {
		this.tipo = tipo;
		this.id = id;
		this.saldo = saldo;
	}
	// -------------------------------------------------------

	public void imprimir() {
		System.out.println("*******************************");
		System.out.println("  CUENTA");
		System.out.println("*******************************");
		System.out.println("Número de Cuenta: " + id);
		System.out.println("Tipo: " + tipo);
		System.out.println("Saldo: USD " + saldo);
		System.out.println("*******************************");
	}

	public void imprimirConMiEstilo() {
		System.out.println("──────────────────────────────────");
		System.out.println("------> CUENTA");
		System.out.println(" ");
		System.out.println("-N° de Cuenta: " + id);
		System.out.println("-Tipo: " + tipo);
		System.out.println("-Saldo: $" + saldo);
		System.out.println("__________________________________");
	}

}

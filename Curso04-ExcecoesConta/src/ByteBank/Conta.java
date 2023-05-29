package ByteBank;

public abstract class Conta {

	// Atributos
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	private static int numeroDeContas;

	// Métodos
	public Conta(int agencia, int numero) {
		Conta.numeroDeContas++;

		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;
	}

	public abstract void deposita(double valor);

	public void saca(double valor) {
		
		if (this.saldo < valor) {
			
			// problema
			throw new SaldoInsuficienteExcepyion("Saldo: " + this.saldo + ", Valor que deseja sacar: "+ valor);
			
		} else {
			this.saldo -= valor;
		}
		
		
	}

	public void transfere(double valor, Conta destino) {
		
		this.saca(valor);
		destino.deposita(valor);

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getNumeroDeContas() {
		return numeroDeContas;
	}

}

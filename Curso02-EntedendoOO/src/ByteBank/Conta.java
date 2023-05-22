package ByteBank;

public class Conta {

	/*
	 * Por padrão o java traz os valores dos atributos iguais a 0 em numerico em
	 * bool fica false etc...
	 * 
	 */

	// Atributos
	private double saldo; // private significa que esse atributo só pode ser alterado atraves de métodos com isso surge getters e setters
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int numeroContas = 0; // static representa uma variável que pertence a classe!
	
	// Construtor
	
	public Conta(int agencia, int numero) {
		
		this.agencia = agencia;
		this.numero = numero;
		
		Conta.numeroContas++;
		
	}

	// Metodos
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean transfere(double valor, Conta destino) {
		if (saca(valor) == true) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
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

	public int getNumero() {
		return numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getNumeroContas() {
		return numeroContas;
	}

}

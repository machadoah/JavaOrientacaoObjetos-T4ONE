package ByteBankHerdadoContas.TiposContas;

import ByteBankHerdadoContas.Cliente;

public class Conta {
	
	// Atributos
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	private static int numeroDeContas;
	
	//Métodos
	public Conta(int agencia, int numero) {
		Conta.numeroDeContas++;
		
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;
	}
	
//	public Conta() {
//		
//	}
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere (double valor, Conta destino) {
		if(this.saca(valor) == true) {
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

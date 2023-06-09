package ByteBank.TiposContas;

import ByteBank.*;

public class ContaCorrente extends Conta {
	
	
	
	private double taxaSaque = 0.20;

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero); // Esta chamando o contrutor especifico!
	}
	
	public double getTaxaSaque() {
		return taxaSaque;
	}
	
	@Override // Estou reescrevendo um método da classe 'super' Conta
	public boolean saca(double valor) {
		double valorSacar = valor + getTaxaSaque();
		return super.saca(valorSacar); // Estou reaproveitando o código da classe Conta
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

}

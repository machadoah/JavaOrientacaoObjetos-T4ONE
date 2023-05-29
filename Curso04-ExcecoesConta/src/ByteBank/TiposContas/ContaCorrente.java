package ByteBank.TiposContas;

import ByteBank.*;

public class ContaCorrente extends Conta implements Tributavel{
	
	
	
	private double taxaSaque = 0.20;

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero); // Esta chamando o contrutor especifico!
	}
	
	public double getTaxaSaque() {
		return taxaSaque;
	}
	
	@Override // Estou reescrevendo um método da classe 'super' Conta
	public void saca(double valor) {
		double valorSacar = valor + getTaxaSaque();
		super.saca(valorSacar); // Estou reaproveitando o código da classe Conta
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
	// Tributavel
	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

}

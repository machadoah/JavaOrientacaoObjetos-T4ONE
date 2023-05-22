package ByteBankHerdado;

import ByteBankHerdado.RecursosHumanos.Funcionario;

public class ControleBonificacaoUpdate {
	
private double soma;

	public void registra(Funcionario f) {
		double bonificacao = f.getBonificacao();
		this.soma = this.soma + bonificacao;
	}
	
	// A bonificação chamada é a mais especifica!!!

	public double getSoma() {
		return soma;
	}

}

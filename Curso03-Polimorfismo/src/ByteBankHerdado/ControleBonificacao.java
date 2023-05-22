package ByteBankHerdado;

import ByteBankHerdado.RecursosHumanos.EditorVideo;
import ByteBankHerdado.RecursosHumanos.Funcionario;
import ByteBankHerdado.RecursosHumanos.Gerente;

public class ControleBonificacao {

	private double soma;
	
	// VEMOS AQUI QUE 3 MÉTODOS FAZER A MESMA COISA!!!

	public void registra(Gerente g) {
		double bonificacao = g.getBonificacao();
		this.soma = this.soma + bonificacao;
	}

	public void registra(Funcionario f) {
		double bonificacao = f.getBonificacao();
		this.soma = this.soma + bonificacao;
	}

	public void registra(EditorVideo ed) {
		double bonificacao = ed.getBonificacao();
		this.soma = this.soma + bonificacao;
	}

	public double getSoma() {
		return soma;
	}

}

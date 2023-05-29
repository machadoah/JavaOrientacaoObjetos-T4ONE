package RecursosHumanos.Funcionarios;

import RecursosHumanos.Funcionarios.Abstratos.Autenticavel;
import RecursosHumanos.Funcionarios.Abstratos.Funcionario;
import RecursosHumanos.Sistema.AutenticacaoUtil;

public class Gerente extends Funcionario implements Autenticavel {
	private AutenticacaoUtil util;

	public double getBonificacao() {
		return super.getSalario();
	}

	public Gerente() {
		this.util = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
		
	}

	public int getSenha() {
		return util.getSenha();
	}

}

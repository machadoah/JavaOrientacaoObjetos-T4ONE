package RecursosHumanos.Funcionarios;

import RecursosHumanos.Funcionarios.Abstratos.Autenticavel;
import RecursosHumanos.Funcionarios.Abstratos.Funcionario;

public class Gerente extends Funcionario implements Autenticavel{ 
	private int senha;

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public double getBonificacao() {
		return super.getSalario();
	}
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}

}

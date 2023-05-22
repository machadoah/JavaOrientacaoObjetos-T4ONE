package ByteBank.Classes;

public class Gerente extends Funcionario { // Gerente herda atributos e métodos do Funcionario

	private int senha;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
		// salario esta definido na super classe e não em 'this' classe!
		// fazendo uso do método na classe 'Funcionario' com 'super'
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}

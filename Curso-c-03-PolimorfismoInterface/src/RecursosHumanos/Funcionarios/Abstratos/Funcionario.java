package RecursosHumanos.Funcionarios.Abstratos;

public abstract class Funcionario { // ABSTRACT não é possivel instanciar objetos

	private String nome;
	private String cpf;
	private double salario;
	// protected é publico para os membros filhos

//	public double getBonificacao() {
//		return this.salario * 0.05;
//	}

	public abstract double getBonificacao();
	// método abstrato, obriga as classes herdeiras a ter um!

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}

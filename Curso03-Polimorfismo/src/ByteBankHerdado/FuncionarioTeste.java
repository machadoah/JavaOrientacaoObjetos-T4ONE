package ByteBankHerdado;

import ByteBankHerdado.RecursosHumanos.Funcionario;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario antonio = new Funcionario();
		
		antonio.setCpf("123.456.789-00");
		antonio.setNome("Antonio Henrique Machado");
		antonio.setSalario(78800.69);
		
		System.out.println(antonio.getNome());
		

		

	}

}

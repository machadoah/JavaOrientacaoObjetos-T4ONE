package ByteBankHerdado.Testes;

import ByteBankHerdado.RecursosHumanos.Funcionario;
import ByteBankHerdado.RecursosHumanos.Gerente;

public class ReferenciasTeste {

	public static void main(String[] args) {

		Funcionario g1 = new Gerente(); // Gerente g1 se torna Funcionario g1

		// Dentro dos funcionarios estou criando um Gerente!
		
		// Referencia g1 = new Tipo(); 
		
		// O polimorfismo é essa flexibilidade de refencia para atingir o mesmo objeto
		 
		g1.setNome("Genivaldo");
		String nome = g1.getNome();
		
		g1.setSalario(5000.0);

		System.out.println("O gerente se chama " + nome);

	}

}

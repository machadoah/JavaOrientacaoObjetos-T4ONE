package RecursosHumanos.Testes;

import RecursosHumanos.Funcionarios.*;

public class InterfaceTeste {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setSalario(3141516);
		
		boolean autenticou = gerente.autentica(gerente.getSenha());
		
		System.out.println(autenticou);
		
		

	}

}

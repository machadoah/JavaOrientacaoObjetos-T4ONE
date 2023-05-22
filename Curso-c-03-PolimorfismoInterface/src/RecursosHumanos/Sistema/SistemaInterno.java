package RecursosHumanos.Sistema;

import RecursosHumanos.Funcionarios.Abstratos.*;

public class SistemaInterno {
	
	private int senha = 3141516;

	public void autentica(Autenticavel a) {

		boolean autenticou = a.autentica(this.senha);
		
		if (autenticou == true) {
			System.out.println("Pode entrar no sistema");
		} else {
			System.out.println("Nao pode entrar no sistema");
		}
	}

}

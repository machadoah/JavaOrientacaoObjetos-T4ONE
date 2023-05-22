package RecursosHumanos.Testes;

import RecursosHumanos.Cliente;
import RecursosHumanos.Funcionarios.*;
import RecursosHumanos.Sistema.*;

public class SistemaInternoTeste {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setSenha(3141516);
		
		Cliente c = new Cliente();
		c.setSenha(123456);
		
		Administrador adm = new Administrador();
		adm.setSenha(132978);
		
		SistemaInterno si = new SistemaInterno();
		
		si.autentica(gerente);
		si.autentica(c);
		si.autentica(adm);
		
		

	}

}

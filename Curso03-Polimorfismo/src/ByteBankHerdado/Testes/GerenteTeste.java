package ByteBankHerdado.Testes;

import ByteBankHerdado.RecursosHumanos.Gerente;

public class GerenteTeste {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setSenha(27052004);
		
		g1.setCpf("123.123.123-00");
		g1.setNome("Marco Polo");
		g1.setSalario(5000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		System.out.println(g1.autentica(27052004));
		
		System.out.println(g1.getBonificacao());
		
		
		
		
	}

}

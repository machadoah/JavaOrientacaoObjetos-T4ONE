package Parte03_Condicionais;

public class Class02_Boolean {
	
	public static void main(String[] args) {
		
		// condicional OU -> ||
		// condicional  E -> &&
 		
		int idade = 18;
		int numeroDeAcompanhantes = 4;
		
		boolean acompanhado = (numeroDeAcompanhantes >= 2);

		if (idade >= 18 || acompanhado) {
			// System.out.println("Voce tem mais de 18 anos ou tem menos e esta acompanhado!!");
			System.out.println("Seja bem vindo!");

		} else {
			// System.out.println("Voce tem menos de 18 anos e nem esta acompanhado!");
			System.out.println("Infelizmente nao pode entrar!");
		}
		
	}

}

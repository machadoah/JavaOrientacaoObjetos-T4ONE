package Parte03_Condicionais;

public class Class01_If {

	public static void main(String[] args) {

		int idade = 17;
		int numeroDeAcompanhantes = 0;

		if (idade >= 18) {
			System.out.println("Voce tem mais de 18 anos!");
			System.out.println("Seja bem vindo!");

		} else if(numeroDeAcompanhantes >= 2){
			
			System.out.println("Voce nao tem 18 anos, mas esta acomnhando");
			System.out.println("Bem vindo!");
		
		} else {
			System.out.println("Voce tem menos de 18 anos e nem esta acompanhado!");
			System.out.println("Infelizmente nao pode entrar!");
		}

	}

}

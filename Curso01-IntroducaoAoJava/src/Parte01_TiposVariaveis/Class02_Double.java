package Parte01_TiposVariaveis;

public class Class02_Double {
	
	public static void main(String[] args) {
		
		// double -> numeros reais (suportam casas decimais)
		
		double salario;
		salario = 1250.70;
		
		System.out.println("Seu salario atual vale " + salario);
		
		// casting
		
		double divisao = 5 / 2; // 2.0 -> por 5 e 2 estarem representados sem casa decimais o valor é truncado
		System.out.println(divisao);
		
		double outraDivisao = 5.0 / 2.0; // 2.5
		System.out.println(outraDivisao);
		
	}

}

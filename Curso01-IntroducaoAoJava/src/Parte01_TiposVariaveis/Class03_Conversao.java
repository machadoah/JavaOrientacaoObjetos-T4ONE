package Parte01_TiposVariaveis;

public class Class03_Conversao {
	
	public static void main(String[] args) {
		
		double salario = 5000.40;
		
		int valorMeuSalario = (int) salario; // um double não cabe em um inteiro, com isso é usado o casting (int)
		
		System.out.println("Seu salario de " + salario + " com casting em int fica " + valorMeuSalario); 
		
		// a casa decimal é truncada
		
	}

}

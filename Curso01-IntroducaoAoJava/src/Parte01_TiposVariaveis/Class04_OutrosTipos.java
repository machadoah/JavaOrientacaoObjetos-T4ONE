package Parte01_TiposVariaveis;

public class Class04_OutrosTipos {
	
	public static void main(String[] args) {
		
		// INTEIROS
		
		byte numeroMuitoPequenininho = 127;
		
		short numeroPequeno = 1234; 
		
		long numeroGrandao = 324335344355L; // é usado o 'L' no final para indicar que é long
		
		System.out.println(numeroGrandao + numeroMuitoPequenininho + numeroPequeno);
		
		// FLUTUANTES
		
		double valorA = 0.1;
		double valorB = 0.2;
		double somaAB = valorA + valorB;
		
		System.out.println(valorA + " + " + valorB + " = " + somaAB);
		
		float pontoFlutuante = 3249834.734F; // é usado o 'F' no final para indicar que é float
		
		System.out.println("Numero PF igual a " + pontoFlutuante);
		
	}

}

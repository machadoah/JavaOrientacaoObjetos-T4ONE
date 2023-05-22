package Parte04_Repeticoes;

public class Class02_Somatoria {
	
	public static void main(String[] args) {
		
		// definindo 'i' e 'k'
		int inicio = 0;
		int fim = 100;
		
		int contador = inicio;
		int total = 0;
		
		while (contador <= fim) {
			
			total += contador;
			
			contador++;
			
		}
		
		System.out.println("A somatoria de " + inicio + " ate " + fim + " totaliza " + total);
		
	}

}

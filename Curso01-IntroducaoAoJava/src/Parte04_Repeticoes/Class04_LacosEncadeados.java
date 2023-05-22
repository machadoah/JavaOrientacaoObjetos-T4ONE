package Parte04_Repeticoes;

public class Class04_LacosEncadeados {
	
	public static void main(String[] args) {
		
		for(int i = 0; i <= 10; i++) {
			
			System.out.println("\nTabuada do " + i + ":");
			
			for(int j = 0; j <= 10; j++) {
				
				System.out.println(i + " x " + j + " = " + i*j);
				
			}
		}
		
	}

}

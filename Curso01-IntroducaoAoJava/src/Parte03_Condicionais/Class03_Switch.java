package Parte03_Condicionais;

public class Class03_Switch {

	public static void main(String[] args) {

		int numeroTitulos = 2;

		switch (numeroTitulos) {

			case 1:
				System.out.println("Campeao!");
				break;
				
			case 2:
				System.out.println("Bicampeao!");
				break;
			
			case 3:
				System.out.println("Tricampeao!");
				break;
			
			default:
				System.out.println("Voce tem mais de 3 titulos!");

		}

	}

}

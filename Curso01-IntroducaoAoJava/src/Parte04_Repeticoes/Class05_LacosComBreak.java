package Parte04_Repeticoes;

public class Class05_LacosComBreak {

	public static void main(String[] args) {

		for (int linha = 0; linha < 10; linha++) {

			for (int coluna = 0; coluna < 10; coluna++) {

				if (coluna > linha) {

					// System.out.print("*"); // sem 'ln'
					break;
				}

				System.out.print("*");

			}

			System.out.println();
		}

	}

}

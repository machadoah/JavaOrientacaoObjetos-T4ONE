package CheckedAndUnchecked;

public class FluxoComError {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Inicio do metodo2");
		/*
		 * ArithmeticException ex = new ArithmeticException("DEU MERDA!");
		 * 
		 * throw ex;
		 * Jogando excecão (BOMBA!💣)!
		 */

		throw new ArithmeticException("DEU MERDA!");

		// System.out.println("Fim do metodo2");
	}

}

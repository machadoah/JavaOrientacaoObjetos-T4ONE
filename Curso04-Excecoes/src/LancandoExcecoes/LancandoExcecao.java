package LancandoExcecoes;

public class LancandoExcecao {

	public static void main(String[] args) {

		System.out.println("Inicio do main");
		try {
			metodo1();
		} catch (RuntimeException re) {
			System.out.println("Exception " + re.getMessage());
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Inicio do metodo2");
		metodo2(); // pilha infinita -> StackOverflowError 😉
		System.out.println("Fim do metodo2");
	}
}

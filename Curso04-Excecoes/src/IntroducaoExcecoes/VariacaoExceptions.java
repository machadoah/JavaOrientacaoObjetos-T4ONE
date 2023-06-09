package IntroducaoExcecoes;

public class VariacaoExceptions {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException ae) {
			String msg = ae.getMessage();
			System.out.println("Exception" + msg);
			//ae.printStackTrace();
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
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = i / 0;
			Conta c = null;
			c.deposita();
		}
		System.out.println("Fim do metodo2");
	}

}

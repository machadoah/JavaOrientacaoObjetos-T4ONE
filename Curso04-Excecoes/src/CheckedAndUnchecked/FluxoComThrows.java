package CheckedAndUnchecked;

public class FluxoComThrows {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
		metodo1();
		} catch(Exception e) {
			System.out.println("Exception " + e.getMessage());
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() throws JavinhaException {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws JavinhaException { // Checked -> herda diretamente do 'Exception'
		System.out.println("Inicio do metodo2");
		throw new JavinhaException("/deu errado!");
	}

}

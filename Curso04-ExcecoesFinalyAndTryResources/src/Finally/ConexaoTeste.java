package Finally;

public class ConexaoTeste {

	public static void main(String[] args) {

		Conexao conection = null;

		try {
			conection = new Conexao();
			conection.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Erro na conexao");
		} finally { // sempre é executado, com ou sem exception!
			conection.fecha();
		}
		
		// também é possivel existir um 'try' sem 'catch' com 'finally'!!!

	}

}

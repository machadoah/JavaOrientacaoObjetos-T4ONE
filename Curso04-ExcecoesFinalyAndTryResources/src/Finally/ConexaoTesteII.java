package Finally;

public class ConexaoTesteII {

	public static void main(String[] args) {

		try (Conexao conection = new Conexao()) {

			conection.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("Erro na conexao");
		}

	}

}

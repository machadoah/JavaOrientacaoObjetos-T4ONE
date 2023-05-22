package ByteBank;

public class ContaTeste {

	public static void main(String[] args) {
		
		// Primeira Conta
		Conta c = new Conta(4565654,001);
		
		c.deposita(200); // Saldo da conta 'c' é de 200.00
		System.out.println("primeira conta tem saldo de " + c.getSaldo());
	
		
		// Segunda Conta
		Conta b = new Conta(46564556,001);
		
		b.deposita(50); 
		System.out.println("segunda conta tem saldo de " + b.getSaldo());
		
		
		// Testando métodos
		
		c.transfere(190, b); // tirando 50 da 'c' para enviar para a 'b'
		
		System.out.println("primeira conta tem saldo de " + c.getSaldo());
		System.out.println("segunda conta tem saldo de " + b.getSaldo());
		
		// Criando cliente
		
		Cliente antonio = new Cliente();
		
		antonio.setCpf("878.546.348-74");
		antonio.setNome("Antonio Henrique Machado");
		antonio.setProfissao("Desenvolvedor");
		
		// Atribuindo cliente a conta
		
		c.setTitular(antonio);
		
		// imprimindo numero de contas
		
		System.out.println("O bytebank possui " + Conta.getNumeroContas() + " contas criadas!");

	}

}

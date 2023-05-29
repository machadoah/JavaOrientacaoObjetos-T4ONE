package ByteBank.Testes;

import ByteBank.*;
import ByteBank.TiposContas.ContaCorrente;

public class ExceptionTeste {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente(001, 123456789);

		System.out.println("Saldo da conta " + conta.getNumero() + " contem R$ " + conta.getSaldo());

		conta.deposita(200.00);
		try {
			conta.saca(250.00);
		} catch (SaldoInsuficienteExcepyion ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Saldo da conta " + conta.getNumero() + " contem R$ " + conta.getSaldo());

	}

}

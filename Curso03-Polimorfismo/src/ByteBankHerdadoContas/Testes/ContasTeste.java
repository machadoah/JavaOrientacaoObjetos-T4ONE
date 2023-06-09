package ByteBankHerdadoContas.Testes;

import ByteBankHerdadoContas.TiposContas.*;

public class ContasTeste {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(001, 123456);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(002, 654321);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		//cp.transfere(50, cc);
		
		System.out.println("A conta corrente tem saldo de R$" + cc.getSaldo());
		System.out.println("A conta poupanca tem saldo de R$" + cp.getSaldo());

	}

}

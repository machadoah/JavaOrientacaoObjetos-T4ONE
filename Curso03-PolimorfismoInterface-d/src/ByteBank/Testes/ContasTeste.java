package ByteBank.Testes;

import ByteBank.Imposto.CalculadorImposto;
import ByteBank.Imposto.SeguroDeVida;
import ByteBank.TiposContas.*;

public class ContasTeste {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(001, 123456);
		cc.deposita(100.0);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorImposto ci = new CalculadorImposto();
		
		ci.registra(cc);
		ci.registra(sv);

		System.out.println("Total de impostos vale R$" + ci.getTotalImposto());

	}

}

package ByteBank.Imposto;

import ByteBank.Tributavel;

public class SeguroDeVida implements Tributavel{

	@Override
	public double getValorImposto() {
		return 42;
	}

}

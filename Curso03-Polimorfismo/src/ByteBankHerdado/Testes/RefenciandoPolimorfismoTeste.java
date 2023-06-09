package ByteBankHerdado.Testes;

import ByteBankHerdado.ControleBonificacao;
import ByteBankHerdado.RecursosHumanos.EditorVideo;
import ByteBankHerdado.RecursosHumanos.Funcionario;
import ByteBankHerdado.RecursosHumanos.Gerente;

public class RefenciandoPolimorfismoTeste {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Genivaldo");
		g1.setSalario(5000.0);
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Zepelin");
		f1.setSalario(2000.0);
		
		EditorVideo ed = new EditorVideo();
		ed.setSalario(2500);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f1);
		controle.registra(ed);

		System.out.println("O gerente se chama " + g1.getNome());
		System.out.println("A soma dos custos com salarios eh de " + controle.getSoma());

	}

}

package ByteBankHerdado.Testes;

import ByteBankHerdado.ControleBonificacaoUpdate;
import ByteBankHerdado.RecursosHumanos.Designer;
import ByteBankHerdado.RecursosHumanos.EditorVideo;
import ByteBankHerdado.RecursosHumanos.Funcionario;
import ByteBankHerdado.RecursosHumanos.Gerente;

public class RefenciandoPolimorfismoTesteUpdate {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Genivaldo");
		g1.setSalario(5000.0);
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Zepelin");
		f1.setSalario(2000.0);
		
		EditorVideo ed = new EditorVideo();
		ed.setSalario(2500);
		
		Designer d = new Designer();
		d.setSalario(2000);
		
		ControleBonificacaoUpdate controle = new ControleBonificacaoUpdate();
		controle.registra(g1);
		controle.registra(f1);
		controle.registra(ed);
		controle.registra(d);

		System.out.println("O gerente se chama " + g1.getNome());
		System.out.println("A soma dos custos com salarios eh de " + controle.getSoma());

	}

}

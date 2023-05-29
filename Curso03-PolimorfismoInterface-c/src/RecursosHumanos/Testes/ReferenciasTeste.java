package RecursosHumanos.Testes;

import RecursosHumanos.ControleBonificacao.*;
import RecursosHumanos.Funcionarios.*;

public class ReferenciasTeste {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setNome("Caio Fernando Abreu");
		gerente.setSalario(5000.0);
		gerente.setCpf("123.456.789-00");
		
		EditorVideo editorVideo = new EditorVideo();
		editorVideo.setSalario(2500.0);
		
		Designer designer = new Designer();
		designer.setSalario(2000.0);

		ControleBonificacao controleBonificacao = new ControleBonificacao();
		controleBonificacao.registra(gerente);
		controleBonificacao.registra(editorVideo);
		controleBonificacao.registra(designer);
		
		System.out.println(controleBonificacao.getSoma());
	}

}

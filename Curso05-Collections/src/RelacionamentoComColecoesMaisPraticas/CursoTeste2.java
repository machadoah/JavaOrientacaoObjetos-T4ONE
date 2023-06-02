package RelacionamentoComColecoesMaisPraticas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ListasDeObjetos.Aula;
import RelacionamentoComColecoes.Curso;

public class CursoTeste2 {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com Array", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("ModelandoColecoes", 22));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getTempoTotal() + " minutos.");
		
		System.out.println(javaColecoes.toString());

	}

}

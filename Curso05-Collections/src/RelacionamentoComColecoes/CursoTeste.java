package RelacionamentoComColecoes;

import ListasDeObjetos.Aula;

public class CursoTeste {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando com Array", 21));
		
		javaColecoes.adiciona(new Aula("Trabalhando com Array", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("ModelandoColecoes", 22));
		
		//List<Aula> aulas = javaColecoes.getAulas();
		//System.out.println(aulas);

		//aulas.add(new Aula("Trabalhando com Array", 21));
		//System.out.println(aulas);
		
		System.out.println(javaColecoes.getAulas());
		
	}

}

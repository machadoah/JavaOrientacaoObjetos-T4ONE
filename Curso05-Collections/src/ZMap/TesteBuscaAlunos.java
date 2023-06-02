package ZMap;

import ListasDeObjetos.Aula;
import RelacionamentoComColecoes.Curso;
import SetAplicacoes.Aluno;

public class TesteBuscaAlunos {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com Array", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("ModelandoColecoes", 22));

		Aluno a1 = new Aluno("Antonio Henrique", 129001);
		Aluno a2 = new Aluno("Calleri", 129002);
		Aluno a3 = new Aluno("Pato", 129003);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println("Quem eh o aluno com matricula 129002? ");
		Aluno aluno = javaColecoes.buscaMatriculado(129007);
		System.out.println("aluno: " + aluno);

	}

}

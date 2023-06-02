package SetEqualsAndHashCode;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import ListasDeObjetos.Aula;
import RelacionamentoComColecoes.Curso;
import SetAplicacoes.Aluno;

public class AlunoTesteComAlunos {

	public static void main(String[] args) {

		// Instanciando um objeto da classe Curso, através do construtor!
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		// Adicionando aulas ao Array aulas! Atráves do método adiciona!
		javaColecoes.adiciona(new Aula("Trabalhando com Array", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("ModelandoColecoes", 22));

		// Instanciando os alunos!
		Aluno a1 = new Aluno("Antonio Henrique", 129001);
		Aluno a2 = new Aluno("Calleri", 129002);
		Aluno a3 = new Aluno("Pato", 129003);

		// Adicionando alunos ao conjunto alunos! atraves do método matricula!
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		// Imprimindo a lista de alunos!
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});

		/*
		 * OUTROS TIPOS SE SET E ITERADOR! -------------------------------
		 * 
		 * TreeSet -> funciona somente a classes comparable
		 * 
		 */

		// Iterator

		System.out.println("Todos os alunos matriculados: ");
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();

		while (iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
		// Vector
		
		Vector<Aluno> vector = new Vector<>();
		
		
		

	}

}

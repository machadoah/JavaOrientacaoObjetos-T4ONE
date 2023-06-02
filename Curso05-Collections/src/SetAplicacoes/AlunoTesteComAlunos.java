package SetAplicacoes;

import ListasDeObjetos.Aula;
import RelacionamentoComColecoes.Curso;


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
		
		System.out.print("\nO aluno" + a1 + " esta matriculado? ");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		// EQUALS
		
		Aluno tonio = new Aluno("Antonio Henrique", 129001);
		
		// String nome = "Antonio Henrique";
		
		System.out.println("tonio eh equivalente a a1? " + a1.equals(tonio));
		
		// Obrigatoriamente a seguinte sentença é true:
		
		System.out.println(a1.hashCode() == tonio.hashCode());

	}

}

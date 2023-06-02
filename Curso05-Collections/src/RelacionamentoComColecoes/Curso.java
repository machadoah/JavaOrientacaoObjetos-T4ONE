package RelacionamentoComColecoes;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import ListasDeObjetos.Aula;
import SetAplicacoes.Aluno;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		// return aulas;
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}

		return tempoTotal;
	}

	@Override
	public String toString() {

		return "[Curso: " + this.nome + ", total de minutos: " + this.getTempoTotal() + ", " + "aulas: " + this.aulas
				+ "]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);

	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno a1) {
		// a1 está em alunos?
		return this.alunos.contains(a1);
	}

//	public Aluno buscaMatriculado(int numero) {
//		for (Aluno aluno : alunos) {
//			if (aluno.getNumeroMatricula() == numero) {
//				return aluno;
//			}
//		}
//		throw new NoSuchElementException("Matricula " + numero + " nao encontrada.");
//	}

	public Aluno buscaMatriculado(int numero) {
		if(!matriculaParaAluno.containsKey(numero))
			throw new NoSuchElementException("Matricula inexistente!");
		return matriculaParaAluno.get(numero);

	}

}

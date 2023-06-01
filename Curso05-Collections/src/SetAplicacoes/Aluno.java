package SetAplicacoes;

public class Aluno {

	private String nome;
	private int numeroMatricula;
	// private List<Aula> aulas = new LinkedList<Aula>();
	// private Set<Aluno> alunos = new HashSet<>();

	public Aluno(String nome, int numeroMatricula) {
		super();
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	@Override
	public String toString() {

		return "[Matricula: " + getNumeroMatricula() + ", Nome: " + getNome() + "]";
	}

}

package SetAplicacoes;

public class Aluno {

	private String nome;
	private int numeroMatricula;
	// private List<Aula> aulas = new LinkedList<Aula>();
	// private Set<Aluno> alunos = new HashSet<>();

	public Aluno(String nome, int numeroMatricula) {
		if (nome == null) {
			throw new NullPointerException("Nome nao pode ser null!");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	// 7. Equal e HashCode
	
	@Override
	public boolean equals(Object obj) {
		Aluno aluno = (Aluno) obj;
		return this.nome.equals(aluno.nome);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

	@Override
	public String toString() {

		return "[Matricula: " + getNumeroMatricula() + ", Nome: " + getNome() + "]";
	}

}

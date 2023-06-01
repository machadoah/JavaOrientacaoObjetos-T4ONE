package Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class AlunosTeste {

	public static void main(String[] args) {

		//Set<String> alunos = new HashSet<>();
		Collection<String> alunos = new HashSet<>();

		alunos.add("Antonio Henrique Machado");
		alunos.add("Nico Steppat");
		alunos.add("Paulo Silveira");
		alunos.add("Pierre Bourdeau");

		System.out.println(alunos);

		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		System.out.println("Existem: " + alunos.size() + " elementos!");
		
		alunos.forEach(aluno -> {
			System.out.println("Aluno: " + aluno);
		});
		
		boolean alunoMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Antonio Henrique Machado");
		System.out.println("Paulo Silveira esta matriculado: " + alunoMatriculado);
		
		// Instanciando apartir do set!
		List<String> alunosEmLista = new ArrayList<>(alunos);
		System.out.println(alunosEmLista);
		Collections.sort(alunosEmLista);
		System.out.println(alunosEmLista);
		

	}

}

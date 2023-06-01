package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();

		// ADD
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		// REMOVE
		aulas.remove(0); // removendo 'Conhecendo mais de listas'

		// FOREACH
		for (String aula : aulas) {
			// para cada aula dentro de aulas
			System.out.println("Aula: " + aula);
		}

		// GET
		System.out.println("A primeira aula do curso trata sobre : " + aulas.get(0));

		// PERCORRENDO ATRAVES DO INDICE
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}

		// SORT

		aulas.add("Aumentando nosso conhecimento");

		// MÉTODO forEach
		aulas.forEach(aula -> {
			System.out.println("percorrendo: " + aula);
		});
		// para cada aula dentro de aulas faça

		Collections.sort(aulas); // Ordenação
		
		aulas.forEach(aula -> {
			//System.out.println("percorrendo: ");
			System.out.println("Aula " + aula);
		});
	}

}

package ListasDeObjetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AulaTeste {

	public static void main(String[] args) {
		Aula a1 = new Aula("Introducao a Teoria dos Conjuntos", 21);
		Aula a2 = new Aula("Operacoes com Conjuntos I", 15);
		Aula a3 = new Aula("Operacoes com conjuntos III", 15);
		Aula a4 = new Aula("Relacoes entre conjuntos", 20);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		aulas.add(a4);
		aulas.add(new Aula("Avaliacao Sobre Conjuntos", 50));
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas); // ordenada alfabeticamente
		
//		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		aulas.sort(Comparator.comparing(Aula::getTempo));
		// ordena as aulas comparando o tempo
		
		System.out.println(aulas);
	}

}

package listaDeAluno;

import java.util.HashMap;
import aluno.Aluno;

public class ListaDeAlunos {
	public HashMap<Integer, Aluno> addLista(int idx, Aluno aluno ) {
		HashMap<Integer, Aluno> listaDeAlunos = new HashMap<>();
		
		listaDeAlunos.put(idx, aluno);
		
		for(int i =0; listaDeAlunos.size() == 10; i++) {
			System.out.println(listaDeAlunos);
		}
		
		System.out.println("Lista de Alunos: " + listaDeAlunos);
//		listaDeAlunos.put(1, aluno);	
		return listaDeAlunos;
		
	}
}

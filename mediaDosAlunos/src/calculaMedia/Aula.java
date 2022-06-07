package calculaMedia;
import java.util.Locale;
import java.util.Scanner;
import aluno.Aluno;
import listaDeAluno.ListaDeAlunos;

public class Aula {

	public static void main(String[] args) {	

		Aluno aluno = new Aluno();
		ListaDeAlunos lista = new ListaDeAlunos();  
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int sair = 0;
		int count = 0;
		
		while(sair == 0) {
			
			System.out.print("Escreve o nome do aluno: ");
			aluno.setNome(sc.next());
			System.out.println("");
			
			System.out.print("Escreve o nome do curso: ");
			aluno.setCurso(sc.next());
			System.out.println("");
			
			System.out.println("-------------------------------");
			System.out.print("| Digite a sua primeira nota: | \n");
			System.out.println("-------------------------------");
			aluno.setNota1(sc.nextDouble());

			System.out.println("----------------------------");
			System.out.print("| Digite a sua seguta nota | \n");
			System.out.println("----------------------------");
			aluno.setNota2(sc.nextDouble());
			
			aluno.setG1(aluno.getNota1(), aluno.getNota2());
			
			if(aluno.getG1() > 6.0d )
				System.out.print("=> Aluno aprovado, parabens! \n Nota Final = " + aluno.getG1() + "\n\n");
			else
				System.out.println("=> Tu não atingiste a media.\n Media de: " + aluno.getG1() + "\n\n");
			
			System.out.println(" Para sair precione ( 1 ) e de enter ou\n para continuar precione ( 0 ) e enter.");
			
			sair = sc.nextInt();
			
			lista.addLista(count++ , aluno);		
							
			
			
		}		
		System.out.println("Encerraste o programa.");
	}

}

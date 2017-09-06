package notasAlunos;

import java.util.Scanner;

public class UsingBubbleSortTeste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nome = null;
		double nota;
		int qtdeAlunos = 0;
				
		System.out.println("Informe a Quantidade de Alunos: ");
		qtdeAlunos = input.nextInt();
		
		UsingBubbleSort bs = new UsingBubbleSort(qtdeAlunos);
		
		for (int i = 0; i < qtdeAlunos; i++) {
			System.out.println("Digite o Nome do " + (i+1) + "º Aluno: ");
			nome = input.next();
			bs.setNome(nome, i);
			
						
			System.out.println("Digite a Nota do " + (i+1) + "º Aluno: ");
			nota = input.nextDouble();
			bs.setNota(nota, i);
		}
		
		bs.showMenu();

		input.close();
	}

}

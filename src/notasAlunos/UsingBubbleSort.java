package notasAlunos;

import java.util.Scanner;

public class UsingBubbleSort {
	
	String[] nome;
	double[] nota;
	
	public UsingBubbleSort (int qtde) {
		this.nome = new String[qtde];
		this.nota = new double[qtde];
	}
	
	public void showArray() {
		System.out.printf("%-20s%6s%n", "Nome:", "Nota:");
		for (int i = 0; i < nota.length; i++) {
			System.out.printf("%-20s%5.1f%n", nome[i], nota[i]);
		}
	}
	
	public void setNome (String nome, int index) {
		this.nome[index] = nome;					
	}
	
	public void setNota (double nota, int index) {
		this.nota[index] = nota;					
	}
	
	public void showMenu() {
		Scanner input = new Scanner(System.in);
		
		
		int selecaoMenu = 0;
		
		System.out.println("\nEscolha o número referente ao tipo de Ordenação que Deseja Utilizar?");
		
		System.out.printf("%-3s%s%n%-3s%s%n%-3s%s%n%-3s%s%n%n%-3s%s%n", "1 = ", "Ordem Crescente de Nome", 
				                                              			"2 = ", "Ordem Descrescente de Nome", 
				                                              			"3 = ", "Ordem Crescente de Nota",
				                                              			"4 = ", "Ordem Decrescente de Nota",
				                                              			"0 = ", "Finalizar Aplicação...");
		selecaoMenu = input.nextInt();
		
		switch (selecaoMenu) {
			case 0:
				System.out.println("Sistema Finalizado!");
				break;
			case 1:
				System.out.println(".:: Ordem Crescente de Nome ::.");
				
				for (int i = 0; i < nome.length; i++) {
					String auxNome = null;
					double auxNota = 0;
					
					for (int j = 0; j < nome.length-1; j++) {
						
						if (nome[j].compareTo(nome[j+1]) > 0) {
							
							auxNome = nome[j];
							auxNota = nota[j];
							nome[j] = nome[j+1];
							nota[j] = nota[j+1];
							nome[j+1] = auxNome;
							nota[j+1] = auxNota;
							
						}
						
					}
				}
				showArray();
				System.out.println();
				showMenu();
				break;
			case 2:
				System.out.println(".:: Ordem Decrescente de Nome ::.");
				
				for (int i = 0; i < nome.length; i++) {
					String auxNome = null;
					double auxNota = 0;
					
					for (int j = 0; j < nome.length-1; j++) {
						
						if (nome[j].compareTo(nome[j+1]) < 0) {
							
							auxNome = nome[j];
							auxNota = nota[j];
							nome[j] = nome[j+1];
							nota[j] = nota[j+1];
							nome[j+1] = auxNome;
							nota[j+1] = auxNota;
							
						}
						
					}
				}
				showArray();
				System.out.println();
				showMenu();
				break;
			case 3:
				System.out.println(".:: Ordem Crescente de Nota ::.");
				
				for (int i = 0; i < nome.length; i++) {
					String auxNome = null;
					double auxNota = 0;
					
					for (int j = 0; j < nota.length-1; j++) {
						
						if (nota[j] > nota[j+1]) {
							
							auxNota = nota[j];
							auxNome = nome[j];
							nota[j] = nota[j+1];
							nome[j] = nome[j+1];
							nota[j+1] = auxNota;
							nome[j+1] = auxNome;
							
						}
						
					}
				}
				showArray();
				System.out.println();
				showMenu();
				break;
			case 4:
				System.out.println(".:: Ordem Decrescente de Nota ::.");
				
				for (int i = 0; i < nome.length; i++) {
					String auxNome = null;
					double auxNota = 0;
					
					for (int j = 0; j < nota.length-1; j++) {
						
						if (nota[j] < nota[j+1]) {
							
							auxNota = nota[j];
							auxNome = nome[j];
							nota[j] = nota[j+1];
							nome[j] = nome[j+1];
							nota[j+1] = auxNota;
							nome[j+1] = auxNome;
							
						}
						
					}
				}
				showArray();
				System.out.println();
				showMenu();
				break;
		}
		input.close();
	}
	
}

package notasAlunos;

import java.util.Scanner;

public class BuscaVetores {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int v[] = {21, 56, -7, 41, 0, 99, 55};
		
		int num = 0;
		int tpBusca = 0;

		System.out.println("Digite um Número: ");
		num = input.nextInt();
		
		System.out.printf("%n%s%n%s%n%s%n", "Digite 1 para Busca Ordenada.", 
				          "Digite 2 para Busca Desordenada.", "Digite 3 para Busca Binária.");
		System.out.println("\nEscolha o Tipo de Busca: ");
		tpBusca = input.nextInt();
		
		if (tpBusca == 1) {
			bubbleSort(v);
			buscaOrdenado(v, num);
			System.out.println("\nAbaixo o vetor v[] com todos os elementos ordenados: ");
			listaVetor(v);
			
		} else {
			if (tpBusca == 2) {
				buscaDesordenado(v, num);
				System.out.println("\nAbaixo o vetor v[] com todos os elementos desordenados: ");
				listaVetor(v);
			} else {
				if (tpBusca == 3) {
					bubbleSort(v);
					buscaBinaria(v, num);
					System.out.println("\nAbaixo o vetor v[] com todos os elementos ordenados: ");
					listaVetor(v);
				} else {
					System.out.println("\nOpção Inválida.");
				}
			}
		}
	}
	
	public static void buscaOrdenado(int x[], int num) {
		// Primeiro parâmetro 	= Vetor 
		// Segundo parâmetro 	= Numero de procura
		
		int i = 0;
		int achou = 0;
				
		//Inicio da Busca Ordenada
		while (i < x.length && achou == 0 && num >= x[i]) {
			if (x[i] == num) {
				achou = 1;
			} else {
				i++;
			}
		}
		
		if (achou == 1) {
			System.out.printf("\nEncontramos seu número: %d%nEle encontra-se no índice %d do vetor.", x[i], i);
		} else {
			System.out.println("\nNão encontramos o seu número!");
		}
	}
	
	public static void buscaDesordenado(int x[], int num) {
		// Primeiro parâmetro 	= Vetor 
		// Segundo parâmetro 	= Numero de procura
		int achou = 0;
		int i = 0;
		
		//Inicio da busca do vetor desordenado
		while (i < x.length && achou == 0) {
			if (x[i] == num) {
				achou = 1;
			} else {
				i++;
			}
		}

		if (achou == 1) {
			System.out.printf("\nEncontramos seu número: %d%nEle encontra-se no índice %d do vetor.", x[i], i);
		} else {
			System.out.println("\nNão encontramos o seu número!");
		}
	}
	
	public static void buscaBinaria(int v[], int num) {
		int achou = 0;
		int inicio = 0;
		int fim = v.length - 1;
		int meio = (inicio + fim) / 2;
		
		while (inicio <= fim && achou == 0) {
			if (v[meio] == num) {
				achou = 1;
			} else {
				if (num < v[meio]) {
					fim = meio - 1;
				} else {
					inicio = meio + 1;
				}
				meio = (inicio + fim) / 2;
			}
		}
		
		if (achou == 0) {
			System.out.println("\nNúmero não encontrado.");
		} else {
			System.out.println("Seu número " + v[meio] + " foi encontrado no índice " + meio);
		}
		
		
	}
	
	public static void listaVetor(int[] x) {
		System.out.println("\n");
		for (int elemento: x) {
			System.out.printf("%d ", elemento);			
		}		
		
	}
	
	public static void bubbleSort(int c[]) {
		//Inserção do Bubble Sort
		int aux;
		boolean controle;
				
		for (int i = 0; i < c.length; i++) {
			controle = true;
			for (int j = 0; j < (c.length-1); j++) {
				
				if (c[j] > c[j + 1]) {
							
					aux = c[j];
					c[j] = c[j + 1];
					c[j + 1] = aux;
					controle = false;
				}
			}
			if (controle) {
				break;
			}
		}
		
	}
	
}

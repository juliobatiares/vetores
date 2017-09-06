package ordenacaoVetores;

public class UtilizandoQuickSort {

	public static void main(String[] args) {
		int x[] = {3, 8, 15, 6, 9, 2, 1, 12};
		
		System.out.println("Vetor:");
		listaVetor(x);
		
		quickSort(x, 0, x.length-1);
		
		System.out.println("\n\nVetor Ordenado");
		listaVetor(x);
	}
	
	

	public static void quickSort(int vetor[], int i, int f) {
		int part; // fim do subvetor 1
		       // início do subvetor 2
		if (i < f) {
			part = particao(vetor, i, f);
			quickSort(vetor, i, part - 1);
			quickSort(vetor, part + 1, f);
		}
	}
	
	public static void troca(int v[], int i, int j) {
		int aux;
		aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
	
	public static int particao(int v[], int b, int e) {
		int pivo = (b + e)/2;
		int elementoPivo = v[pivo];
		
		while (b < e) {
			while (v[b] < elementoPivo) {
					b++;
			}
			while (v[e] > elementoPivo) {
					e--;
			}
			if(b < e) {
				troca(v, b, e);
			}
		}
		return e;
	}
	
	private static void listaVetor(int[] x) {
		for (int i = 0; i < x.length; i++){
			System.out.printf("%d ", x[i]);
		}		
		
	}
	

}

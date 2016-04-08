package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa2 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		double A[][];
		int M, N, i, j;
		
		System.out.println("Quantas linhas tem a matriz? ");
		M = sc.nextInt();
		System.out.println("Quantas colunas tem a matriz? ");
		N = sc.nextInt();
		
		A = new double[M][N];
		
		System.out.println("Digite os elementos da matriz: ");
		for (i=0; i<M; i++) {
			System.out.println((i+1)+"ª linha: ");
			for (j=0; j<N; j++) {
				A[i][j] = sc.nextDouble();
			}			
		}
		
		System.out.println("Matriz digitada:");
		for (i=0; i<M; i++) {
			for (j=0; j<N; j++) {
				System.out.printf("%6.1f ", A[i][j]);
			}
			System.out.println();
		}

		System.out.println("Digite o índice de uma coluna: ");
		int C = sc.nextInt();
		
		double soma = 0.0;
		for (i=0; i<M; i++) {
			soma = soma + A[i][C-1];
		}
		System.out.println("Soma da "+C+"ª coluna: "+soma);
		
		
	}
}




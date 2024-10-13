package Aula008;

import java.util.Scanner;

// For

public class aula008 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++ ) {
			
			System.out.printf("Valor de i: %d - Valor de N: %d%n", i, N);
		}
		
		sc.close();
		
	}
}

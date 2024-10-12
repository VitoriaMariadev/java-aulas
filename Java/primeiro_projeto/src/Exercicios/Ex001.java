package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex001 {
	public static void main(String[] args) {
		
		//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
		//mostre:
		//a) a área do triângulo retângulo que tem A por base e C por altura.
		//b) a área do círculo de raio C. (pi = 3.14159)
		//c) a área do trapézio que tem A e B por bases e C por altura.
		//d) a área do quadrado que tem lado B.
		//e) a área do retângulo que tem lados A e B.
		
		Locale.setDefault(Locale.US);
		
		double A, B, C, area;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextDouble();
		sc.nextLine();
		B = sc.nextDouble();
		sc.nextLine();
		C = sc.nextDouble();
		sc.nextLine();
		
		// a)
		
		area = (A * C) / 2;
		
		System.out.printf("TRIANGULO: %.3f%n", area);
		
		// b)
		
		area = 3.14159 * Math.pow(C, 2);
		
		System.out.printf("CIRCULO: %.3f%n", area);
		
		// c
		
		area = Math.pow(B, 2);
		
		System.out.printf("QUADRADO: %.3f%n", area);
		
		area = (A * B);
		
		System.out.printf("RETANGULO: %.3f%n", area);
		
		
	}
}

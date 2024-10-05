package Aula003;
import java.util.Scanner; //Importar isso aqui pra poder fazer entrada de dados

public class aula003 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // "Input"
		
		// Texto sem espaços
		
		// -----------> Strings ---------------
		
		//System.out.print("Digite algo: ");
		
		//String x;
		
		//x = sc.next();
		
		// -----------> INT ---------------
		
		//int x;

		//x = sc.nextInt();
		
		// -----------> Double ---------------
		
		// x = sc.nextDouble(); // O separador é local (,) - Só colocar o locale em cima da variavel x
		
		// -----------> CHAR ---------------
		
		//char x;
		
		//x = sc.next().charAt(1); // O valor dentro do parentese é a posição que ele vai pegar o número
		
		// -----------> MUDANDO DE LINHA ---------------
		
		int x;
		
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine(); // Tem que adicionar isso aqui para o programa não bugar
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//System.out.println("Você digitou: " + x);
		
		sc.close(); // Colocar isso quando não precisar mais do input
		
		
		
	}
}

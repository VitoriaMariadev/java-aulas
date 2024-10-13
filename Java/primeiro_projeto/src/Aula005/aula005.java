package Aula005;
import java.util.Scanner;
// Estrutura condicional


/*
public class aula005 {
	public static void main(String[] args) {
		
		int x = 5;
		
		if (x > 0) {
			
			System.out.println("Bom dia");
		
		}
		
		else if (x < 0) { // Parecido com JS
			
			System.out.println("Boa tarde");
			
		}
		
		else {
			System.out.println("Boa noite");
		}
		
	
	}
}

*/

// switch-case

public class aula005 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		String dia;
		
		 switch (x) {
		 
		 case 1:
			 dia = "Domingo";
			 break;
		 case 2:
			 dia = "Segunda";
			 break;
		 case 3:
			 dia = "Terça";
			 break;
		 case 4:
			 dia = "Quarta";
			 break;
		 case 5:
			 dia = "Quinta";
			 break;
		 case 6: 
			 dia = "Sexta";
			 break;
		 case 7:
			 dia = "Sabado";
			 break;
		 default:
			 dia = "Valor Invalido";
			 break;
			 
		 
		 }
	
	System.out.println(dia);
	
	sc.close();
		 
	}
}


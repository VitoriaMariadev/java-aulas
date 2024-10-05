package Aula001;

// Aula Básica de print e formatação

public class aula001 {

	public static void main(String[] args) {
		
		String nome = "Maria";
		int idade = 30;
		double renda = 4000.0;

		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		// %s = text
		// %d = number
		// %f = float
		
	}

}

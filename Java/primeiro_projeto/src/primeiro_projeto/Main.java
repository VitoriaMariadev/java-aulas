package primeiro_projeto;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
			
		int y = 32;
		double x = 2.34343;
		
		System.out.println(y);
		System.out.printf("%.4f%n", x );
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x );
		
		System.out.printf("Resultado = %.4f metros%n", x );
	

	}

}

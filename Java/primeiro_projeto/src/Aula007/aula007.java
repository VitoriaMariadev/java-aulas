package Aula007;
import java.util.Scanner;

// While

public class aula007 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while (x != 0) {
			x -= 1;
			System.out.println(x);
		}
		
		sc.close();
		
	}
}

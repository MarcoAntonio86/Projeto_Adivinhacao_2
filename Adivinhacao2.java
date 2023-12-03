package adivinhacao1;
import java.util.Scanner;
import java.util.Locale;
public class Adivinhacao2 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x,y;
		
		int i = 1;
				
		System.out.println("Digite o valor a ser adivinhado");
		x = sc.nextDouble();
		
		System.out.println("Digite o numero que voce acha que e o correto");
		y = sc.nextDouble();
		
		if(x != y) {
			do {
				System.out.println("Tente novamente");
				y = sc.nextDouble();
				i = i+1;
			} while (x != y);
		    
			}
		
		   System.out.println("Acertou");
		   System.out.println("Você tentou " + i + " vezes");
             		
		sc.close();

	}
}

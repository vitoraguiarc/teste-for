import java.util.Scanner;

public class TesteFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Teste for
		
		for (int x = 0; (x < 10); x++) {
			System.out.println(x + " ");
		}
		
		System.out.println();
		// Tabuada do 8 usando for
		
		System.out.println("Tabuada do 8");
		System.out.println();
		for (int a = 0; (a <= 10); a++) {
			System.out.println("8 x " + a + " = " + 8 * a);
		}
		
		System.out.println();
		// Condição String
		
		Scanner leitor = new Scanner(System.in);
		String resposta = "S";
		
		for (int b = 0; resposta.equalsIgnoreCase("s"); b++) {
			System.out.println("Volta " + b);
			System.out.println("Continuar (S/N)? ");
			resposta = leitor.next();
		}

	}

}

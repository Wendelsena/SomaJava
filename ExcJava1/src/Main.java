import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("digite dois numeros inteiros! (apenas soma, por enquanto ;D)");
		Scanner sc = new Scanner(System.in);
		
		int A, B, soma;
		A = sc.nextInt();
		B = sc.nextInt();
		soma = A + B;
		System.out.println("A soma é: " + soma );	
		
		sc.close();

	}

}

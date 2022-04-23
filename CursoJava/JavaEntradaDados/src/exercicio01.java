import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroUm = sc.nextInt();
		int numeroDois = sc.nextInt();
		int soma = numeroUm + numeroDois;
		System.out.printf("A some de " + numeroUm + " e " + numeroDois + " é = " + soma );
		
		sc.close();
		
		

	}

}

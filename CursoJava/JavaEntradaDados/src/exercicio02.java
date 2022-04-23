import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double pi = 3.14159;
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double area = pi * (Math.pow(raio, 2.0));
		System.out.printf("O Raio do ciculo é = %.4f%n ",area);
		sc.close();

	}

}

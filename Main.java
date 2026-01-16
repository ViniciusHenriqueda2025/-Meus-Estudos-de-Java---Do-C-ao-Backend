package terceiro;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
	int n;
	Locale.setDefault(Locale.US);	
	Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

	double[] vet = new double[n];
	
	for(int i = 0; i < n; i++) {
		System.out.print("Digite um numero: ");
		vet[i] = sc.nextDouble();
	}
	
	System.out.println();
	System.out.println("NUMEROS DIGITADOS: ");
	
	for(int i = 0; i < n; i++) {
		
		System.out.println(vet[i]);
	}
	
	
	
	sc.close();
	}

}

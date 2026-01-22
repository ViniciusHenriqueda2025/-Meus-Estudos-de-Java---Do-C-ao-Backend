package quinto;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n]; 
 
		for(int i = 0; i < n; i++) {
		System.out.print("Digite um numero: ");
		vetor[i] = sc.nextDouble();
	    }
		
		System.out.println("");
		
		double soma = 0;
		System.out.print("VALORES= " );
		for(int i=0; i < n; i++) {
		 System.out.print( String.format("%.1f", vetor[i])+"  ");	
		 soma = soma + vetor[i];
			
		}
		
		double media = soma / n;
		System.out.println("");
		System.out.println("SOMA = " + String.format("%.2f", soma));
		System.out.println("MEDIA = " + String.format("%.2f", media));
		
		
		
		
		
		
		
	}

}

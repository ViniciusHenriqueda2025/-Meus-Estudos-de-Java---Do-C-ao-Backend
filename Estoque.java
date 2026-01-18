import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	   
	Scanner sc = new Scanner(System.in);
	
			System.out.print("Quantos Produtos Voce vai Digitar #MÁXIMO 10#? ");
	   	int n = sc.nextInt();
	   	while( n > 10 || n < 1){
	   	    System.out.print("Valor Ivalido digite outro ");
	   	n = sc.nextInt(); 
	   	    }
	   	
	   	String[] vet = new String [n];
	   	sc.nextLine();
	  
	  for( int i = 0; i < n; i++){
      System.out.print("Nome do produto= ");	  vet[i] = sc.nextLine();
       }
	     
	    int[]quant = new int[n];
	   
	   for( int i = 0; i < n; i++){
        System.out.print("Qual a quantidade de  "  + vet[i] + " =");	        
      quant[i] = sc.nextInt();
	   }
	   	  
	int soma = 0;
	double media ;
	System.out.println("");
	System.out.println("PRODUTOS E QUANTIDADES");
    
    System.out.println("");
    
	for ( int i = 0; i < n; i++){
	
	System.out.println(vet[i] + " = " + quant[i]);
	soma = soma + quant[i];	
		
    }	 
		
	media = (double) soma / n;
	System.out.println("");
System.out.println(String.format("MEDIA %.1f", media));	
	}
}
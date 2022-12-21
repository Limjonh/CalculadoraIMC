package Bananada;

import java.util.Scanner;

public class Console {
   public static void main(String[] args) {
	
Scanner entrada = new Scanner (System.in);
    
System.out.print("Digite sua idade: ");
      int idade = entrada.nextInt();
      entrada.nextLine();
      
        System.out.print("digite seu nome: ");
       String nome = entrada.nextLine();
 
       System.out.print("Digite Seu sobrenome: ");
      String sobrenome = entrada.nextLine();
      
      System.out.print("Digite seu peso: ");
      double peso = entrada.nextDouble();
      
      System.out.print("digite sua altura: ");
      double altura = entrada.nextDouble();
      
     System.out.printf("\nO %s %s tem %d de idade\n", 
		   nome, sobrenome, idade);
     double imc = peso/(altura*altura);
   
     System.out.print("E seu IMC é de: " + imc);
   
     entrada.close();
   
   }
}

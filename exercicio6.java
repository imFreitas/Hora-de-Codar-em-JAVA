import java.util.Scanner;

class Main {  
  public static void main(String args[]) { 
    
    System.out.println("Digite um valor"); 
    Scanner scan = new Scanner(System.in);
    int valor1 = scan.nextInt();

    System.out.println("Digite um valor"); 
    int valor2 = scan.nextInt();

    System.out.println("Digite um valor"); 
    int valor3 = scan.nextInt();

    int resultado = Math.max(valor1, Math.max(valor2, valor3));

    System.out.println ("O valor maior é " + resultado);
  } 
}

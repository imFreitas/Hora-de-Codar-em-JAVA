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


    if (valor1 < valor2 && valor1 < valor3) {
      System.out.println("Soma = " + (valor2 + valor3));
    }

    if (valor2 < valor1 && valor2 < valor3) {
      System.out.println("Soma = " + (valor1 + valor3));
    }

    if (valor3 < valor1 && valor3 < valor2 ){
      System.out.println("Soma = " + (valor1 + valor2));

    }
  } 
}


import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.println("Escreva o primeiro numero: ");
    Double num1 = in.nextDouble();

    System.out.println("Escreva o segundo numero: ");
    Double num2 = in.nextDouble();
  
    while (num2 <= 0) {
      System.out.println("O segundo numero nãopode ser =0 ");
      num2 = in.nextDouble();
    }

    Double Soma = (num1/num2);

    System.out.println(num1 + " / " + num2 + " = " + Soma);

  }
}

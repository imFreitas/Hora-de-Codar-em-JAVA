import java.util.Scanner;

class Main {
  public static void main(String[] args) {

     System.out.println("Escreva um número: ");
    Scanner in = new Scanner(System.in);

    Double num = in.nextDouble();
 
    if (num > 0) {
      System.out.println(num + " é positivo");
    }

    if (num < 0) {
      System.out.println(num + " é negativo");
    }

    if (num == 0) {
      System.out.println(num + " é zero");
    }

  }
}

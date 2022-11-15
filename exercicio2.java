import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    System.out.println("INFORME O SEU NOME: ");
    Scanner in = new Scanner(System.in);

    String Nome = in.next();

    System.out.println("Olá, " + Nome);

  }
}

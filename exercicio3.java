import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("Qual seu nome: ");
    Scanner NomePessoa = new Scanner(System.in);
    String Nome = NomePessoa.next();

    System.out.println("Qual sua idade: ");
    Scanner IdadePessoa = new Scanner(System.in);
    int Idade = IdadePessoa.nextInt();

    System.out.println("Olá, " + Nome + ", sua idade é " + Idade + " anos");

  }
}

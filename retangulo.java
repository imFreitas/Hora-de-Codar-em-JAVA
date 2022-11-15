import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("Base do retângulo: ");
    Scanner base = new Scanner(System.in);
    double b = base.nextDouble();

    System.out.println("Altura do retângulo: ");
    Scanner altura = new Scanner(System.in);
    double a = altura.nextDouble();

    double area = b * a;

    System.out.println("A área é: " + area);

  }

}

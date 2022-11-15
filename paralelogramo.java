import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("Base do paralelogramo: ");
    Scanner base = new Scanner(System.in);
    double b = base.nextDouble();

    System.out.println("Altura do paralelogramo: ");
    Scanner altura = new Scanner(System.in);
    double a = altura.nextDouble();

    double area = b * a;

    System.out.println("A área é " + area);

  }

}

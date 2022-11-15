import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("Base maior do trapézio: ");
    Scanner baseMaior = new Scanner(System.in);
    double bMaior = baseMaior.nextDouble();

    System.out.println("Base menor do trapézio: ");
    Scanner baseMenor = new Scanner(System.in);
    double bMenor = baseMenor.nextDouble();

    System.out.println("Altura do trapézio: ");
    Scanner altura = new Scanner(System.in);
    double a = altura.nextDouble();

    double area = (((bMaior + bMenor) * a) / 2);

    System.out.println("A área é: " + area);

  }

}

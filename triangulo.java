import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("Base do triângulo: ");
    Scanner base = new Scanner(System.in);
    double b = base.nextDouble();

    System.out.println("Altura do triângulo: ");
    Scanner altura = new Scanner(System.in);
    double a = altura.nextDouble();

    double area = ((b * a)/2);

    System.out.println("A área é: " + area);
    
  
    }

  }


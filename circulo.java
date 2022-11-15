import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("Qual o raio do círculo: ");
    Scanner circulo = new Scanner(System.in);
    double raio = circulo.nextDouble();

    double area = ( Math.PI * (raio * raio));

    System.out.println("A área do circulo é : " + area);

  }
}

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

     System.out.println(" Maior diaogonal do losango: ");
    Scanner maior = new Scanner(System.in);
    double diagonalMaior = maior.nextDouble();

    System.out.println(" Menos diagonal do losango: ");
    Scanner menor = new Scanner(System.in);
    double diagonalMenor = menor.nextDouble();
    
    double area = ((diagonalMaior * diagonalMenor)/2);

    System.out.println(" A área é: " + area );
    }

  }


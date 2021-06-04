import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    double[][] matriz = new double[2][5];
    Scanner input = new Scanner(System.in);
    
    System.out.println("Ex 3)");

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < 5; j++) {
        matriz[i][j] = lerDouble(i, j, input);
      }
    }

    Util.printDoubleMatriz(matriz);
  }

  public static double lerDouble(int i, int j, Scanner input) {
    System.out.printf("Valor do index %dx%d: ", i, j);
    double value = input.nextDouble();

    return value;
  }
}

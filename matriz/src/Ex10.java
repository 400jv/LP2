import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {
    Util.printDoubleMatriz(lerMatrizInt());
  }

  public static double[][] lerMatrizInt() { 
    Scanner input = new Scanner(System.in);

    System.out.print("Quantidade de linhas: ");
    int linhas = input.nextInt();
    
    System.out.print("Quatidade de colunas: ");
    int colunas = input.nextInt();

    double[][] matriz = new double[linhas][colunas];

    for (int i = 0; i < linhas; i++) {
      for (int j = 0; j < colunas; j++) {
        System.out.printf("Valor do index %dx%d: ", i, j);
        matriz[i][j] = input.nextDouble();
      }
    }

    input.close();
    return matriz;
  }
}

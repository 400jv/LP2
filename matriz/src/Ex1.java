import java.lang.Math;

public class Ex1 {
  public static void main(String[] args) {
    int[][] matrizA = new int[3][10];
    int[][] matrizB = new int[4][10];
    int[][] matrizC = new int[6][6];
    int[][] matrizD = new int[9][6];
    
    System.out.println("1)");
    Util.printExln('A');

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 10; j++) {
        matrizA[i][j] = j;
      }
    }

    Util.printIntMatriz(matrizA);
    Util.printExln('B');

    for (int i = 0; i < matrizB.length; i++) {
      for (int j = 0; j < 10; j++) {
        matrizB[i][j] = (int) Math.pow(j, 2);
      }
    }

    Util.printIntMatriz(matrizB);
    Util.printExln('C');

    for (int i = 0; i < matrizC.length; i ++) {
      for (int j = 0; j < 6; j++) {
        matrizC[i][j] = i;
      }
    }

    Util.printIntMatriz(matrizC);
    Util.printExln('D');

    for (int linha = 0; linha < matrizD.length; linha++) {
      for (int coluna = 0; coluna < 6; coluna++) {
        // Se a linha for positva, então recebe -1 se não 0
        matrizD[linha][coluna] = linha % 2 == 0 ? -1 : 0;
      }
    } 

    Util.printIntMatriz(matrizD);
  }
}

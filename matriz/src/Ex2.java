import java.lang.Math;

public class Ex2 {
  public static void main(String[] args) {
    int[][] matriz = new int[4][4];

    System.out.println("2)");

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = (int) (Math.random() * 100);
      }
    }

    Util.printIntMatriz(matriz);
  }
}

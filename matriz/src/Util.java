public final class Util {
  
  public static void printIntMatriz(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
      for (int value: matriz[i]) {
        System.out.print(value + " ");
      }
      System.out.println();
    }
  }

  public static void printDoubleMatriz(double[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
      for (double value: matriz[i]) {
        System.out.print(value + " ");
      }
      System.out.println();
    }
  }

  public static void printExln(char letra) {
    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    System.out.println("Ex " + letra + ": ");
  }
}

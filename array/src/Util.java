// Classe de funções que eu preciso em quase todos os arquivos
public final class Util {
  // Função para printar um array de inteiros
  public static void printIntArray(int[] array) {
    for (int value: array) {
      System.out.print(value + " ");
    }

    System.out.println();
  }

  // Função para printar um array de booleans
  public static void printBooleanArray(boolean[] array) {
    for (Boolean value: array) {
      System.out.print(value + " ");
    }

    System.out.println();
  }
}

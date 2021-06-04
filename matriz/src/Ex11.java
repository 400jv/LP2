public class Ex11 {
  public static void main(String[] args) {
    int[][] matriz = {
      { 01, 15, 03, 84 },
      { 25, 16, 07, 14 },
      { 15, 02, 05, 44 },
      { 02, 02, 213, 4 },
    };

    Util.printIntMatriz(isParMatrizInt(matriz));
  }

  public static int[][] isParMatrizInt(int[][] matriz) {

    // Para cada valor das linhas, chama o metodo isParInt
    for (int i = 0; i < matriz.length; i++) {
      int[] linha = matriz[i];

      for (int j = 0; j < linha.length; j++) {
        matriz[i][j] = isParInt(linha[j]);
      }      
    }

    return matriz;
  }

  // Se for par retorna 1 se não -1
  public static int isParInt(int numero) {
    if (numero % 2 == 0) return 1;

    return -1;
  }
}

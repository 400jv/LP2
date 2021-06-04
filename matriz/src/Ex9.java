public class Ex9 {
  public static void main(String[] args) {
    int[][] matriz = {
      { 01, 15, 03, 84 },
      { 25, 16, 07, 14 },
      { 15, 02, 05, 44 },
      { 02, 02, 213, 4 },
    };

    System.out.println("Ex 9) Média de valores da linha: " + mediaLinhaMatrizInt(matriz, 0));
  }

  public static float mediaLinhaMatrizInt(int[][] matriz, int linha) {
    int soma = 0;
    int totalValoresLinha = matriz[linha].length;

    for (int valor: matriz[linha]) {
      soma += valor;      
    }

    return soma / totalValoresLinha;
  }
}

public class Ex8 {
  public static void main(String[] args) {
    int[][] matriz = {
      { 01, 15, 03, 84 },
      { 25, 16, 07, 14 },
      { 15, 02, 05, 44 },
      { 02, 02, 213, 4 },
    };

    System.out.println("Ex 8) Soma da matriz: " + somaValoresMatrizInt(matriz));
  }

  public static int somaValoresMatrizInt(int[][] matriz) {
    int soma = 0;

    for (int linha = 0; linha < matriz.length; linha++) {
      for (int valor: matriz[linha]) {
        soma += valor;
      }
    }

    return soma; 
  }
}

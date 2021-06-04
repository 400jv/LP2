public class Ex5 {
  public static void main(String[] args) {
    double[][] matriz = new double[4][5];

    System.out.println("Ex 5) Quantidade de colunas: " + matrizDoubleQuantidadeColunas(matriz));
  }

  public static int matrizDoubleQuantidadeColunas(double[][] matriz) {
    return matriz[0].length;
  }
}

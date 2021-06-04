public class Ex4 {
  public static void main(String[] args) {
    double[][] matriz = new double[4][5];

    System.out.println("Ex 4) Quantidades de linhas: " + matrizDoubleQuantidadeLinhas(matriz));
  }

  public static int matrizDoubleQuantidadeLinhas(double[][] matriz) {
    return matriz.length;
  }
}

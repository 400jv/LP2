public class Ex6 {
  public static void main(String[] args) {
    double[][] matriz = new double[4][5];

    System.out.println("Ex 6) ");
    System.out.println(paraStringMatrizDouble(matriz));
  }

  public static String paraStringMatrizDouble(double[][] matriz) {
    String valores = "";

    // Para cada linha da matriz, mostra os valores separado por |
    for (int linha = 0; linha < matriz.length; linha++) {
      valores += String.format("%d ", linha + 1);        

      for (double value: matriz[linha]) {
        valores += String.format("| %-2s ", value);
      }

      valores += String.format("|\n");        
    }

    return valores;
  }
}

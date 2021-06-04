public class Ex7 {
  public static void main(String[] args) {
    double[][] matriz = {
      { 01, 15, 03, 84 },
      { 25, 16, 07, 14 },
      { 15, 02, 05, 44 },
      { 02, 02, 213, 4 },
    };
    
    System.out.println("Ex 7) Maior valor na matriz: " + maiorValorMatrizDouble(matriz));
  } 
  
  public static double maiorValorMatrizDouble(double[][] matriz) {
    double maior = matriz[0][0];

    for (int linha = 0; linha < matriz.length; linha++) {
      for (double valor: matriz[linha]) {
        if (valor > maior) maior = valor;
      }
    }
    
    return maior;
  }
}

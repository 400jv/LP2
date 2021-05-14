public class Ex4 {
  public static void main(String[] args) {
    int[] array4 = { 1, -2, -5, -6, 25 };

    System.out.print("Exercício 4: " + totalNegative(array4) + " negativos");
  }

  public static int totalNegative(int[] array) {
    int total = 0;

    for (int value: array) 
      if (value < 0) ++total; 
    
    return total;
  }
}

public class Ex5 {
  public static void main(String[] args) {
    int[] a = { 1, 1, 2, 3, 3, 3, 4, 75 };

    System.out.println("Exercício 5: " + totalX(a, 1) + " vezes");
  }

  public static int totalX(int[] a, int x) {
    int total = 0;
    
    for (int value: a) {
      if (value == x) ++total;
    }

    return total;
  }
}

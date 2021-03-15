public class Ex7 {
  public static void main(String args[]) {
    calculateX(40);
  }

  public static int calculateX(int x) {
    System.out.print(x == 1 ? x : x + " -> ");

    if (x == 1) return x;

    if (x % 2 == 0) return calculateX(x /= 2);

    return calculateX(x = 3 * x +1);
  }
}

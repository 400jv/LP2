public class Ex4 {
  public static void main(String args[]) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(fat(i));
    }
  }

  public static int fat(int n) {
    if (n == 1) return 1;

    return n * fat(n -1);
  }
}

public class Ex5 {
  public static void main(String args[]) {
    for (long i = 1; i <= 20; i++) {
      System.out.println(fat(i));
    }
  }

  public static long fat(long n) {
    if (n == 1) return 1;

    return n * fat(n -1);
  }
}

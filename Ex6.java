public class Ex6 {
  public static void main(String args[]) {
    fubonnaciPrimeirosCem(0, 1, 0);
  }

  public static int fubonnaciPrimeirosCem(int n1, int n2, int n3) {
    if (n3 > 100) return n3;

    System.out.println(n3);
    return fubonnaciPrimeirosCem(n1 = n2, n2 = n3, n3 = n1 + n2);
  }
}

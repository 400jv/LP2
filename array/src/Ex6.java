public class Ex6 {
  public static void main(String[] args) {
    int[] a = { -1, 2, 3, -25, 4 };

    System.out.print("Exercício 6: ");
    Util.printBooleanArray(isPositiveArray(a));
  }

  public static boolean[] isPositiveArray(int[] a) { 
    boolean[] array = new boolean[a.length];

    // Um for chamando o método isPositive para cada elemento de A
    for (int i = 0; i < a.length; i++) {
      array[i] = isPositive(a[i]);
    }

    return array;
  }

  // Método que pega um elemento e retorna o true caso seja postivo, senão retorna falso
  public static boolean isPositive(int value) {
    if (value > 0) return true;

    return false;
  }
}

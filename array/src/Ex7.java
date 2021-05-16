public class Ex7 {
  public static void main(String[] args) {
    int[] array = { 2, 3, 255, 25, 1 };

    System.out.println("Exercício 7: O index do maior é " + findMaxValue(array));
  }

  public static int findMaxValue(int[] array) {
    int indexMax = 0;

    for (int i = 1; i < array.length; i++) {
      if (array[i] > array[indexMax]) indexMax = i;
    }

    return indexMax;
  }
}

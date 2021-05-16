public class Ex9 {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 6, 7 };

    System.out.print("Exercício 9: ");
    Util.printIntArray(isPairArray(array));
  }

  public static int[] isPairArray(int[] array) {
    // Para cada elemento no array chama o metodo isCousin
    for (int i = 0; i < array.length; i++) {
      array[i] = isPair(array[i]);
    }

    return array;
  }

  // metodo que pega um elemento e retorna 1 se for par, senão retorna -1
  public static int isPair(int number) {
    if (number % 2 == 0) return 1;

    return -1;
  }
}

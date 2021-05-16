import java.util.Scanner;

public class Ex8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Qual é o tamanho do array?: ");
    int qtElements = input.nextInt();

    readIntArray(qtElements);
    input.close();
  }

  public static int[] readIntArray(int n) {
    Scanner input = new Scanner(System.in);
    int[] array = new int[n];

    for (int i = 0; i < array.length; i++) {
      System.out.print("Digite o valor do index " + i + ": ");
      array[i] = input.nextInt();
    }

    input.close();
    return array;
  }
}

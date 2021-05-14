import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Double[] d = new Double[10];
    Scanner input = new Scanner(System.in);
  
    System.out.println("Exercício 3: ");

    for (int i = 0; i < d.length; i++) {
      System.out.print("Digite um número para o index " + i + ": ");
      d[i] = input.nextDouble();
    }

    for (Double value: d) {
      System.out.print(value + " ");
    }

    input.close();
  }
}

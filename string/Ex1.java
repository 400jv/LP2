import java.util.Scanner;

public class Ex1 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite algum texto: ");
    String text = input.nextLine();

    System.out.println("O texto " + text + " tem " + text.length() + " palavras.");

    input.close();
  }
}

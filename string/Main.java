import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    Ex3 textos = new Ex3();
    Ex4 inverterTexto = new Ex4();

    System.out.print("Digite um texto em minúsculo: ");
    String textoMinusculo = input.nextLine();

    System.out.println("O texto: " + textoMinusculo + "\nEm maiúsculo é: " + textos.paraMaiusculo(textoMinusculo));
    
    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

    System.out.print("Digite um texto em maiúsculo: ");
    String textoMaiusculo = input.nextLine();

    System.out.println("O texto: " + textoMaiusculo + "\nEm minúsculo é: " + textos.paraMinusculo(textoMaiusculo));
  
    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    
    System.out.print("Digite um texto: ");
    String texto = input.next();

    System.out.println("O texto: " + texto + "\nInvertido é: " + inverterTexto.inverter(texto));
  }
}

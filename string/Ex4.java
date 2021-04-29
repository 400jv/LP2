public class Ex4 {
  
  public String inverter(String frase) {
    String fraseInvertida = "";

    for (int i = frase.length() -1; i >= 0 ; i--) {
      fraseInvertida += frase.charAt(i);
    }

    return fraseInvertida;
  }
}

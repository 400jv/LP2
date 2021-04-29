public class Ex2 {
  public static void main(String args[]) {

    String ifpr = "IFPR";
    StringBuilder stringAux = new StringBuilder();

    for (int i = 0; i < ifpr.length(); i++) {
      stringAux.append(ifpr.charAt(i));

      System.out.println(stringAux);
    }

    for (int i = ifpr.length() -1; 0 <= i; i--) {
      stringAux.deleteCharAt(i);

      System.out.println(stringAux);
    }
  }
}

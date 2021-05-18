import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class Baralho {
  public final List<Carta> cartas;
  private String[] naipes = { "Paus", "Ouros", "Espadas", "Copas" };
  
  public Baralho() {
    cartas = new ArrayList<>();

    // Para cada Naipe
    for (int i = 0; i < naipes.length; i++) {
      String naipe = naipes[i];

      // Crie 10 cartas de 1 á 10
      for (int j = 0; j < 10; j++) {
        Carta carta = new Carta();
        carta.setNome(Integer.toString(j + 1)); 
        carta.setNaipe(naipe);

        cartas.add(carta);
      }

      // Crie um valete, um rei, uma dama e um coringa
      Carta valete = new Carta();
      valete.setNome("Valete");
      valete.setNaipe(naipe);

      Carta dama = new Carta();
      dama.setNome("Dama");
      dama.setNaipe(naipe);

      Carta rei = new Carta();
      rei.setNome("Rei");
      rei.setNaipe(naipe);

      Carta coringa = new Carta();
      coringa.setNome("coringa");
      coringa.setNaipe("coringa");

      cartas.add(valete);
      cartas.add(dama);
      cartas.add(rei);
      cartas.add(coringa);
    }
  }

}

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

  public void embaralha() {
    // Para 13 cartas aleatórias no array
    for (int i = 0; i < 13; i++) {
      // sorteia dois indexs
      int card1 = (int) (Math.random() * cartas.size());
      int card2 = (int) (Math.random() * cartas.size());

      // E chama o método swap passando os dois indexs
      swapCard(card1, card2);
    }
  }
  
  // Método para pegar dois index e trocar os valores nesses indexs
  private void swapCard(int card1_index, int card2_index) {
    String card1Nome = cartas.get(card1_index).getNome();
    String card1Naipe = cartas.get(card1_index).getNaipe();
    
    Carta copyCard1 = new Carta();
    copyCard1.setNome(card1Nome);
    copyCard1.setNaipe(card1Naipe);
    
    cartas.set(card1_index, cartas.get(card2_index));
    cartas.set(card2_index, copyCard1);
  }
}

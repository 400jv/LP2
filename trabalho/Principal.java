public class Principal {
  public static void main(String args[]) {
    MeioTransporte oid1 = new MeioTransporte(
      "Ônibus", 
      "Mercedes", 
      "Vitória", 
      "numeroLugares", 
      (short) 45,
      74
    );

    MeioTransporte oid2 = new MeioTransporte(
      "Avião", 
      "AirBus", 
      "A320",
      "Querosene", 
      (short) 180,
      820
    );
  }
}

public class MeioTransporte {
  private String tipo;
  private String marca;
  private String modelo;
  public int qtdMeioTransportes;

  public MeioTransporte(String tipo, String marca, String modelo, int qtdMeioTransportes) {
    this.tipo = tipo;
    this.marca = marca;
    this.modelo = modelo;
    this.qtdMeioTransportes = qtdMeioTransportes + 1;
  }
}

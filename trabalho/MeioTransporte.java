public class MeioTransporte {
  private String tipo;
  private String marca;
  private String modelo;
  private String combustivel;
  private Short numeroLugares;
  private float velocidadeAtual;

  public MeioTransporte(
    String tipo, 
    String marca, 
    String modelo, 
    String combustivel, 
    Short numeroLugares,
    float velocidadeAtual
    ) {
    this.tipo = tipo;
    this.marca = marca;
    this.modelo = modelo;
    this.combustivel = combustivel;
    this.numeroLugares = numeroLugares;
    this.velocidadeAtual = velocidadeAtual;
  }


  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  } 

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  } 

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getCombustivel() {
    return combustivel;
  }

  public void setCombustivel(String combustivel) {
    this.combustivel = combustivel;
  }

  public Short getNumeroLugares() {
    return numeroLugares;
  }

  public void setCombustivel(Short numeroLugares) {
    this.numeroLugares = numeroLugares;
  }

  public void iniciarViagem() {
    return;
  }

  public void interromperViagem() {
    return;
  }

  public float acelerar(float valor) {
    return valor;
  }

  public void frear() {
    return;
  }

  public float obterVelocidade() {
    return velocidadeAtual;
  }
}

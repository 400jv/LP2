public class PessoaJuridica extends Cliente {
  private String cnpj;
  private String nomeFantasia;

  public PessoaJuridica(
    String nome, 
    String endereco, 
    String telefone, 
    String cnpj,
    String nomeFantasia
  ) {
    super(nome, endereco, telefone);
    this.cnpj = cnpj;
    this.nomeFantasia = nomeFantasia;
  }

  public void ImprimirDados() {
    System.out.println("Nome: " + super.getNome());
    System.out.println("Endereço: " + super.getEndereco());
    System.out.println("Telefone: " + super.getTelefone());
    System.out.println("CNPJ: " + this.cnpj);
    System.out.println("Nome Fantasia: " + this.nomeFantasia);
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getNomeFantasia() {
    return nomeFantasia;
  }

  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }
}

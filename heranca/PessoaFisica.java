public class PessoaFisica extends Cliente {
  private String cpf;

  public PessoaFisica(String nome, String endereco, String telefone, String cpf) {
    super(nome, endereco, telefone);
    this.cpf = cpf;
  }

  @Override
  public void ImprimirDados() {
    System.out.println("Nome: " + super.getNome());
    System.out.println("Endereço: " + super.getEndereco());
    System.out.println("Telefone: " + super.getTelefone());
    System.out.println("CPF: " + this.cpf);
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}

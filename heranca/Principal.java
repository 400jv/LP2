public class Principal {
  public static void main(String args[]) {
    PessoaFisica umaPessoaFisica = new PessoaFisica("Jão", "Avenida", "2222", "2222");

    PessoaJuridica umaPessoaJuridica = new PessoaJuridica(
      "Victor", 
      "Avenida", 
      "4444", 
      "4444", 
      "Vitão"
    );

    umaPessoaFisica.ImprimirDados();
    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
    umaPessoaJuridica.ImprimirDados();
  }
}

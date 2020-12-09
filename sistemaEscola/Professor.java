package sistemaEscola;

public class Professor implements Controlador {
    private String nome;
    private String end;
    private String tel;
    private String email;

    public Professor(String nome, String end, String tel, String email) {
        this.nome = nome;
        this.end = end;
        this.tel = tel;
        this.email = email;
    }

    // Os metodos setters NÃO serão usados, porém coloquei pois o trabalho pediu

    public String getNome() {
        return nome;
    }

    //private void setNome(String nome) {
    //    this.nome = nome;
    //}

    private String getEnd() {
        return end;
    }

    //private void setEnd(String end) {
    //    this.end = end;
    //}

    private String getTel() {
        return tel;
    }

    //private void setTel(String tel) {
    //    this.tel = tel;
    //}

    private String getEmail() {
        return email;
    }

    //private void setEmail(String email) {
    //    this.email = email;
    //}

    @Override
    public void regPrecensa(String aluno) {
        System.out.println(aluno + " está presente, chamada do professor " + this.getNome());
    }

    //Metodo que recebe uma nota em números, e retorna o conceito do aluno
    @Override
    public void corrigirProva(float nota, String aluno) {
        if (nota <= 50) {
            System.out.println(aluno + " tirou D, na matéria do progessor " + this.getNome());
            return;
        }
        if (nota <= 60) {
            System.out.println(aluno + " tirou C, na matéria do progessor " + this.getNome());
            return;
        }
        if (nota < 90) {
            System.out.println(aluno + " tirou B, na matéria do progessor " + this.getNome());
            return;
        }
        System.out.println(aluno + " tirou A, na matéria do progessor " + this.getNome());
    }

    // Não sabia extamente oq era pra fazer com "Preencher relatório" Porém fiz isso ae
    @Override
    public void preencherRel(String conteudo) {
        System.out.println("Relátoria sobre " + conteudo + " finalizado, pelo professor " + this.getNome());
    }

    @Override
    public void mostraProfessor() {
        System.out.println("Nome: " + this.getNome() +
                              "\nEndereço: " + this.getEnd() +
                              "\nTelefone: " + this.getTel() +
                              "\nE-mail: " + this.getEmail()
        );
    }
}

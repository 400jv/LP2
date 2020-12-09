package sistemaEscola;

public interface Controlador {

    // O editor ficou reclamando que eu explícitei "public abstract"
    void regPrecensa(String aluno);
    void corrigirProva(float nota, String aluno);
    void preencherRel(String conteudo);
    void mostraProfessor();
}

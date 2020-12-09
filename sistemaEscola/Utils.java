package sistemaEscola;

import java.util.Scanner;

public class Utils {
    // Reaproveitei um código, de procurar professores
    private static Professor procurarProfessor(String nome, Professor[] professores) {
        for (int i = 0; i < 2; i++) {
            if (nome.equals(professores[i].getNome())) {
                return professores[i];
            }
        }
        return null;
    }
    // Reaproveitei, nesse uma analise que é feita em 4 funções diferentes
    private static Professor isProfessor(Professor[] professores) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do professor: ");
        String nome = input.nextLine();

        Professor prof = procurarProfessor(nome, professores);

        if (prof == null) {
            System.out.println("⚠️ Professor não existe!. ⚠️");
            return null;
        }
        return prof;
    }

    public static Professor regProfessores() {

        Scanner input = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = input.nextLine();

        System.out.print("Endereço: ");
        String end = input.nextLine();

        System.out.print("Telefone: ");
        String tel = input.nextLine();

        System.out.print("E-mail: ");
        String email = input.nextLine();

        return new Professor(nome, end, tel, email);
    }

    public static void exibirUmProfessor(Professor[] professores) {

        Professor prof = isProfessor(professores);

        if (prof == null) {
            return;
        }

        prof.mostraProfessor();
    }

    public static void regPrecensas(Professor[] professores) {

        Professor prof = isProfessor(professores);

        if (prof == null) {
            return;
        }

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos alunos estão na sala?: ");
        int qt_alunos = Integer.parseInt(input.nextLine()); /* Precisei fazer essa gambiarra
                                                               pois o for no primeiro valor
                                                               recebia um tipo de "lixo de String"
                                                             */
        for (int i = 0; i < qt_alunos; i++) {
            System.out.print("Nome do aluno " + (i+1) + ": ");
            String aluno = input.nextLine();

            prof.regPrecensa(aluno);
        }
    }

    public static void corrgirProva(Professor[] professores) {

        Professor prof = isProfessor(professores);

        if (prof == null) {
            return;
        }

        Scanner input = new Scanner(System.in);

        System.out.print("Quantas provas tem?: ");
        int qt_prova = Integer.parseInt(input.nextLine());

        for (int i = 0; i < qt_prova; i++) {
            System.out.println("=-=-=-=-=-=-=-=-=- Aluno " + (i + 1) + " -=-=-=-=-=-=-=-=-=-=");

            System.out.print("Nome do aluno: ");
            String aluno = input.nextLine();

            System.out.print("Nota do " + aluno + ": ");
            float nota = Float.parseFloat(input.nextLine());

            prof.corrigirProva(nota, aluno);
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public static void preencherRel(Professor[] professores) {

        Professor prof = isProfessor(professores);

        if (prof == null) {
            return;
        }

        Scanner input = new Scanner(System.in);

        System.out.print("Conteúdo do relatório: ");
        String conteudo = input.nextLine();

        prof.preencherRel(conteudo);

    }
}

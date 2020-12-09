package sistemaEscola;

import java.util.Scanner;

public class Princial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Professor[] professores = new Professor[10];


        for (int i = 0; i < 10; i++) {
            System.out.println("-=-=-=-=-=-=-=-=- Professor "+ (i+1) + " -=-=-=-=-=-=-=-=-");
            professores[i] = Utils.regProfessores();
        }

        boolean rodando = true;
        while (rodando) {
            System.out.println("-=-=-=-=-=-=-=-=-=- Menu -=-=-=-=-=-=-=-=-=-=-=");
            System.out.println(
                    "[ 1 ] - Registrar outros 10 Professores    \n" +
                    "[ 2 ] - Mostrar um professor               \n" +
                    "[ 3 ] - Registrar presença                 \n" +
                    "[ 4 ] - Corrigir prova                     \n" +
                    "[ 5 ] - Preencher relatório                \n" +
                    "[ 6 ] - Fechar programa                    \n"
            );
            System.out.print("Digite sua opção: ");
            int op = input.nextInt();

            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            switch (op) {
                case 1: {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("-=-=-=-=-=-=-=-=- Professor " + (i + 1) + " -=-=-=-=-=-=-=-=-");
                        professores[i] = Utils.regProfessores();
                    }
                    break;
                }
                case 2: {
                    Utils.exibirUmProfessor(professores);
                    break;
                }
                case 3: {
                    Utils.regPrecensas(professores);
                    break;
                }
                case 4: {
                    Utils.corrgirProva(professores);
                    break;
                }
                case 5: {
                    Utils.preencherRel(professores);
                    break;
                }
                case 6: {
                    System.out.println("Bye bye! =) \nFinalizando...");
                    rodando = false;
                    break;
                }
                default: {
                    System.out.println("⚠️ Erro! Opção invalida ⚠️");
                    break;
                }
            }
        }
    }
}

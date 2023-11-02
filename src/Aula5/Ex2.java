package Aula5;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        // declara as variáveis 
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int votoNulo = 0;
        int votoBranco = 0;
        int finalizador = 0;
        int voto = 1;

        // apresenta uma tabela para o usuario 
        System.out.println("////////////////");
        System.out.println("Candidato 1 - 1");
        System.out.println("Candidato 2 - 2");
        System.out.println("Candidato 3 - 3");
        System.out.println("Candidato 4 - 4");
        System.out.println("Voto nulo   - 5");
        System.out.println("Voto branco - 6");
        System.out.println("Finalizador - 0");
        System.out.println("////////////////");
        System.out.println("");

        Scanner scan = new Scanner(System.in);

        // enquanto o valor digitado for diferente de 0, o while irá rodar
        while (voto != 0) {
            System.out.println("Digite o seu voto:");
            voto = scan.nextInt();

            // verifica a entrada do usuário e acrescenta os votos
            switch (voto) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                case 4:
                    candidato4++;
                    break;
                case 5:
                    votoNulo++;
                    break;
                case 6:
                    votoBranco++;
                    break;
                case 0:
                    finalizador = voto;
                    break;
                default:
                    System.out.println("O numero não corresponde a uma opção");
                    break;

            }
        }
        // saida dos dados
        System.out.println("O candidato 1 teve:" + candidato1 + " votos");
        System.out.println("O candidato 2 teve:" + candidato2 + " votos");
        System.out.println("O candidato 3 teve:" + candidato3 + " votos");
        System.out.println("O candidato 4 teve:" + candidato4 + " votos");
        System.out.println("O total de votos nulos foi:" + votoNulo);
        System.out.println("O total de votos brancos foi:" + votoBranco);

    }

}

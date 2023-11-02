package Aula5;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int codigoAluno = 1;

        // enquanto a entrada digitadaa for diferente de 0 o codigo continua a rodar
        while (codigoAluno != 0) {

            System.out.println("Qual o codigo do aluno:");
            codigoAluno = scan.nextInt();

            if (codigoAluno != 0) {

                // pede as notas do aluno para calcular a media
                System.out.println("Digite as tres notas:");
                int nota1 = scan.nextInt();
                int nota2 = scan.nextInt();
                int nota3 = scan.nextInt();

                int media = (nota1 + nota2 + nota3) / 3;

                // saida dos dados 
                System.out.println("A media do aluno foi:" + media);
            }

        }

    }
}

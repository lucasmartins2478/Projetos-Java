package Aula6;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] notas = new int[4];
        int[] mediaAluno = new int[3];

        for (int i = 0; i < mediaAluno.length; i++) {
            System.out.println("//////////////////////");
            for (int x = 0; x < notas.length; x++) {
                System.out.println("Digite sua nota:");
                notas[x] = scan.nextInt();

                mediaAluno[i] = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
            }

        }
        for (int i = 0; i < mediaAluno.length; i++) {
            System.out.println("A media do aluno " + (i + 1) + " e:" + mediaAluno[i]);
        }
        for (int i = 0; i < mediaAluno.length; i++) {
            if (mediaAluno[i] != 0) {
                if (mediaAluno[i] > 7) {
                    System.out.println("Os alunos com media maior que 7 e: Aluno " + (i + 1));
                }
            }
        }
    }

}

package Aula5;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = 0;
        int div = 1;
        int read = 1;
        int media = 0;

        // executa o codigo enquanto o numero digitado não for 0
        while (read != 0) {
            System.out.println("Digite um numero par:");
            read = scan.nextInt();

            // verifica se o numero digitado é par
            if (read % 2 == 0) {

                num += read;

                media = num / div;
                div++;

            }

        }
        //saida de dados
        System.out.println("A media dos numeros pares digitados foi:" + media);

    }

}

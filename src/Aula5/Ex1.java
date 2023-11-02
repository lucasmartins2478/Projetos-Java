package Aula5;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        // Declarando as variáveis
        int read = 0;
        int media = 0;
        int div = 1;
        int num = 0;

        Scanner scan = new Scanner(System.in);

        // enquanto o valor da leitura for positivo, o while continua rodando
        while (read >= 0) {

            System.out.println("Digite um numero:");
            read = scan.nextInt();

            if (read > 0) {

                num += read;

                media = num / div;

                div++;
            }
        }
        // saida dos dados
        System.out.println("A media e:" + media);
    }

}

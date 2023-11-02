package Aula5;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int read = 1;
        int num = 0;

        // enquanto o numero digitado for diferente de 0 ele executa o while
        while (read != 0) {

            System.out.println("Digite um numero negativo");
            read = scan.nextInt();

            //verifica se o numero digitado é negativo
            if (read < 0) {
                num += read;

            }
        }
        //saida dos dados 
        System.out.println("A soma de todos os numeros negativos digitados e:" + num);

    }

}

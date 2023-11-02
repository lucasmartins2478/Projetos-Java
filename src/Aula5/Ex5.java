package Aula5;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //declara variaveis
        int num = 0;
        int intervalo1 = 0;
        int intervalo2 = 0;
        int intervalo3 = 0;
        int intervalo4 = 0;

        // explicando os intervalos para o usuario
        System.out.println("Intervalo 1 = [0 a 25]");
        System.out.println("Intervalo 2 = [26 a 50]");
        System.out.println("Intervalo 3 = [51 a 75]");
        System.out.println("Intervalo 4 = [76 a 100]");
        System.out.println("");

        //executa enquanto o numero digitado for positivo
        while (num >= 0) {
            System.out.println("Digite um numero:");
            num = scan.nextInt();

            // verifica em qual intervalo o numero digitado esta
            if (num >= 0 && num <= 25) {
                intervalo1++;
            } else if (num >= 26 && num <= 50) {
                intervalo2++;
            } else if (num >= 51 && num <= 75) {
                intervalo3++;
            } else if (num >= 76 && num <= 100) {
                intervalo4++;
            } else {
                System.out.println("Numero invalido");
            }

        }
        //saida dos dados
        System.out.println("Numeros no intervalo 1 [0 a 25]:" + intervalo1);
        System.out.println("Numeros no intervalo 2 [26 a 50]:" + intervalo2);
        System.out.println("Numeros no intervalo 3 [51 a 75]:" + intervalo3);
        System.out.println("Numeros no intervalo 4 [76 a 100]:" + intervalo4);
    }

}

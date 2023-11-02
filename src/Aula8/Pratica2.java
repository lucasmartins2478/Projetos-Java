package Aula8;

import java.util.Scanner;

public class Pratica2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtd = 0;
        int num = 0;
        int[] cont = new int[10];
        int[] numeros = new int[10];
        int[] numerosInversos = new int[10];

        while (qtd < 10) {
            System.out.println("Digite um numero:");
            numeros[qtd] = scan.nextInt();
            qtd++;
        }
        for (int x = 9; x > 0; x--) {
            numerosInversos[num] = numeros[x];
            num++;
        }
        for (int x = 0; x < numerosInversos.length; x++) {

            System.out.println(numerosInversos[x]);

        }
        for (int x = 0; x < numeros.length; x++) {
            if (numeros[x] == numerosInversos[x]) {
                System.out.println(x + "");
            }
        }

    }

}

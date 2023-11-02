package Exercicios;

import java.util.Scanner;

public class Conversor_moedas {

    public static void main(String[] args) {

        // Entrada de dados
        Scanner scan = new Scanner(System.in);
        System.out.println("Conversor de Moedas");
        System.out.println("Digite a Moeda:");
        String moeda = scan.next();
        System.out.println("Digite a moeda que quer converter:");
        String convert = scan.next();
        System.out.println("Digite o valor:");
        double valor = scan.nextDouble();

        //Defininndo valores das moedas
        int real = 1;
        double dolar = 4.99;
        double euro = 5.5;
        double libra = 6.23;

        //Se a moeda for dolar
        if (moeda.equals("dolar")) {
            if (convert.equals("real")) {
                double valorc = valor / 4.99;
                System.out.println("O valor convertido e U$" + valorc);
            } else if (convert.equals("euro")) {
                double valorc = valor * 1.10;
                System.out.println("O valor convertido e " + valorc + "€");
            } else if (convert.equals("libra")) {
                double valorc = valor * 0.80;
                System.out.println("O valor convertido e £" + valorc);
            }
        } //Se a moeda for real
        else if (moeda.equals("real")) {
            if (convert.equals("dolar")) {
                double valorc = valor * 4.99;
                System.out.println("O valor convertido e U$" + valorc);
            } else if (convert.equals("euro")) {
                double valorc = valor * 5.50;
                System.out.println("O valor convertido e " + valorc + "€");
            } else if (convert.equals("libra")) {
                double valorc = valor * 6.23;
                System.out.println("O valor convertido e £" + valorc);
            }
        } //Se a moeda for euro
        else if (moeda.equals("euro")) {
            if (convert.equals("real")) {
                double valorc = valor / 0.18;
                System.out.println("O valor convertido e R$" + valorc);
            } else if (convert.equals("dolar")) {
                double valorc = valor / 0.90;
                System.out.println("O valor convertido e U$" + valorc);
            } else if (convert.equals("libra")) {
                double valorc = valor * 0.88;
                System.out.println("O valor convertido e £" + valorc);
            }
        } //Se a moeda for libra
        else if (moeda.equals("libra")) {
            if (convert.equals("real")) {
                double valorc = valor / 0.16;
                System.out.println("O valor convertido e R$" + valorc);
            } else if (convert.equals("dolar")) {
                double valorc = valor / 0.80;
                System.out.println("O valor convertido e U$" + valorc);
            } else if (convert.equals("euro")) {
                double valorc = valor / 0.88;
                System.out.println("O valor convertido e " + valorc + "€");
            }
        }
    }

}

package Aula5;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idadeMasc = 0;
        int idadeFem = 0;
        int idadeTotal = 0;
        int fem = 0;
        int masc = 0;
        double alturaMulheres = 0;
        int mediaIdadeTotal = 0;
        double mediaAlturaMulheres = 0;
        int mediaIdadeHomens = 0;
        double percentualPessoas = 0;
        int count = 1;
        double porcentagem = 0;

        while (count <= 5) {
            System.out.println("Digite sua idade:");
            int idade = scan.nextInt();
            System.out.println("Digite sua altura:");
            double altura = scan.nextDouble();
            System.out.println("Digite seu sexo:0-feminino | 1-masculino");
            int sexo = scan.nextInt();

            idadeTotal += idade;
            mediaIdadeTotal = idadeTotal / count;

            if (sexo == 0) {
                fem++;
                alturaMulheres += altura;
                mediaAlturaMulheres = alturaMulheres / fem;
            } else if (sexo == 1) {
                masc++;
                idadeMasc += idade;
                mediaIdadeHomens = idadeMasc / masc;
            } else {
                System.out.println("opcao de sexo  nao existe");
            }

            if (idade >= 18 || idade <= 35) {
                percentualPessoas++;
                porcentagem = percentualPessoas ;
                percentualPessoas = porcentagem * 100;

            }

            count++;
        }
        System.out.println("A media de idade total e :" + mediaIdadeTotal);
        System.out.println("A media de altura das mulheres e :" + mediaAlturaMulheres);
        System.out.println("A media de idade dos homens e :" + mediaIdadeHomens);
        System.out.println("A porcentagem de pessoas entre 18 e 35 anos e :" + percentualPessoas);

    }

}

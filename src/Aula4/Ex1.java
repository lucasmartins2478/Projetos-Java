package Aula4;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Digite a operação");
        String operador = sc.next();

        switch (operador) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;

            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Operador invalido");
        }

    }

}

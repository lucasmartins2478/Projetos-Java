package Aula6;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nums = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Digite um numero");
            nums[i] = scan.nextInt();
            if (nums[i] % 2 == 0) {
                pares[i] = nums[i];
            } else {
                impares[i] = nums[i];
            }
        }
        System.out.println("///////////////////////");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("O numero"+(i+1)+" e:"+nums[i]);
        }
        System.out.println("///////////////////////");
        for (int i = 0; i < pares.length; i++) {
            if (pares[i] != 0) {
                System.out.println("Os numeros pares sao:"+pares[i]);
            }
        }
        System.out.println("///////////////////////");
        for (int i = 0; i < impares.length; i++) {
            if (impares[i] != 0) {
                System.out.println("Os numeros impares sao:" + impares[i]);
            }
        }
    }
}
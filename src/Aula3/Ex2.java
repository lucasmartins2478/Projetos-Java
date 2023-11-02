package Aula3;
import java.util.Scanner;
public class Ex2 {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite qual tabuada voce quer:");
        int tabuada = sc.nextInt();
        System.out.println("Tabuada do "+tabuada+ ":");
        
        for (int x = 1; x<=10; x++){
            int resultado = tabuada * x;
            System.out.println(tabuada+" * "+ x+ " = "+ resultado);
        }
    }

}

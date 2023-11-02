package Aula4;
import java.util.Scanner;
public class Main1 {

 
    public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
          System.out.println("Digite uma letra");
          String letra = sc.nextLine();
          
          switch (letra){
              case  "a" :
                      System.out.println("Abacaxi");
                      break;
              case "b":
                      System.out.println("Banana");
                      break;
              case "c":
                      System.out.println("Carambola");
                      break;
              case "d":
                      System.out.println("Doutor");
              default :
                      System.out.println("Letra inválida");
                       
              
          }
     }

}

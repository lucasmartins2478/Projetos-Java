package Aula8;
import java.util.Scanner;
public class Ex6 {

 
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        int matriz [][] = new int [3][4];
        int opt = 0;
        double media = 0;
        
        
        for ( int x = 0; x<matriz.length; x++){
            for(int y = 0; y<matriz[x].length; y++){
                System.out.println("Digite um numero:");
                matriz[x][y] = scan.nextInt();
            }
           
        }
        
        for ( int x = 0; x<matriz.length; x++){
            for (int y = 0; y<matriz[x].length; y++){
                System.out.print(matriz[x][y]+"");
            }
            System.out.println("");
        }
        System.out.println("Digite qual coluna voce quer a media:");
            opt = scan.nextInt();
            
            switch(opt){
                case 1:
                    media = (matriz[0][0]+matriz[0][1]+matriz[0][2]+matriz[0][3])/matriz[0].length;
                    break;
                case 2:
                    media = (matriz[1][0]+matriz[1][1]+matriz[1][2]+matriz[1][3])/matriz[1].length;
                    break;
                case 3:
                    media = (matriz[2][0]+matriz[2][1]+matriz[2][2]+ matriz[2][3])/matriz[2].length;
                    break;
                default:
                    break;
            }
        System.out.printf("A media e:"+media);
        
    }

}

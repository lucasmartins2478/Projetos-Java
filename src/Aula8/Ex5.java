package Aula8;


public class Ex5 {

 
    public static void main(String[] args) {
        
        int matriz[][] = new int [3][3];
        int matrizDobro[][] = new int [3][3];
        int num = 10;
        
        for ( int x = 0; x<matriz.length; x++){
            for ( int y = 0; y<matriz[x].length; y++){
              matriz[x][y] = num;
              num++;
            }
        }
        
        for ( int x = 0; x<matriz.length; x++){
            for ( int y = 0; y<matriz[x].length; y++){
              matrizDobro[x][y] = matriz[x][y]*2;
            }
        }
        
        
        
        for ( int x = 0; x<matriz.length; x++){
            for ( int y = 0; y<matriz[x].length; y++){
                
                System.out.print("|"+matriz[x][y]+"|");
            }
            System.out.println("");
        }
        
        System.out.println("////////////");
        for ( int x = 0; x<matriz.length; x++){
            for ( int y = 0; y<matriz[x].length; y++){
                
                System.out.print("|"+matrizDobro[x][y]+"|");
            }
            System.out.println("");
        }
    }

}

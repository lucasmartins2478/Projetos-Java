package POO;
import java.util.Scanner;
import javax.swing.JFrame;

public class teste_aluno {

 
    public static void main(String[] args) {
        
        JFrame tela = new JFrame("Ola");
        tela.setVisible(true);
        tela.setSize(800, 500);
        tela.setDefaultCloseOperation(tela.EXIT_ON_CLOSE);

        Scanner scan = new Scanner(System.in);
        
        Aluno aluno1 = new Aluno();
        
        int opt = 0;
        
        while(opt != 3){
            
            System.out.println("\nMenu:");
            System.out.println("\n1 - Criar Aluno\n2 - Mostrar aluno\n3 - Sair");
            
            opt = scan.nextInt();
            
            switch(opt){
                case 1:
                    System.out.println("Digite seu nome:");
                    aluno1.setNome(scan.next());
                    System.out.println("Digite seu RA:");
                    aluno1.setRa(scan.next());
                    System.out.println("Digite sua nota da Ac1:");
                    aluno1.setAc1(scan.nextFloat());
                    System.out.println("Digite sua nota da Ac2:");
                    aluno1.setAc2(scan.nextFloat());
                    System.out.println("Digite sua nota da AG:");
                    aluno1.setAg(scan.nextFloat());
                    System.out.println("Digite sua nota da AF:");
                    aluno1.setAf(scan.nextFloat());
                    
                    break;
                    
                case 2:
                    System.out.println(aluno1.imprimir());
                    break;
                    
                case 3:
                    break;
                    
                default:
                    System.out.println("Opcao invalida!");
            }
        }
        
    }

}

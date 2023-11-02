package POO;
import java.util.Scanner;

public class teste_pessoa {

 
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Pessoa user1 = new Pessoa();
        int opt = 0;

        
        
        while(opt != 3){
            
             System.out.println("\nMenu:\n");
             System.out.println("1 - Criar pessoa\n2 - Mostrar Pessoa\n3 - Sair");
             System.out.println("");
        
             opt = scan.nextInt();
            
            switch(opt){
                case 1:
                
                    System.out.println("Digite o nome da pessoa:");
                    user1.setNome(scan.next());
                    System.out.println("Digite a idade da pessoa:");
                    user1.setIdade(scan.nextInt());
                    System.out.println("Digite o CPF da pessoa:");
                    user1.setCpf(scan.next());
                    System.out.println("Digite o telefone da pessoa:");
                    user1.setTelefone(scan.next());
                    System.out.println("");
                    break;
                    
                case 2:
                  
                    System.out.println(user1.imprimir());
                    
                    break;
                    
                case 3:
                    break;
                    
                default:
                    System.out.println("Opcao invalida!");
            }
        }
        
    }

}

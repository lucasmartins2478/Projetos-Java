package POO;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class teste_funcionario {

 
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        
        Funcionario funcionario = new Funcionario();
        
        JOptionPane.showMessageDialog(null,"Olá Mundo!");
        String nome = JOptionPane.showInputDialog(null,"digite seu nome:");
        JOptionPane.showMessageDialog(null,"Olá, "+nome);
        
        int opt =0;
        
        while (opt !=4){
            System.out.println("\nMenu\n");
            System.out.println("1 - Criar funcionario\n2 - Mostrar folha de pagamento\n3 - Alterar remuneracao\n4 - Sair");
            opt = scan.nextInt();
            
            switch(opt){
                case 1:
                    
                    System.out.println("Digite o nome do funcionario:");
                    funcionario.setNome(scan.next());
                    System.out.println("Digite o numero do cracha:");
                    funcionario.setCracha(scan.nextInt());
                    System.out.println("Digite o tipo de vinculo:");
                    funcionario.setTipoVinculo(scan.next().charAt(0));
                    if (funcionario.getTipoVinculo() == 'H'){
                        
                        System.out.println("Digite o valor hora:");
                        funcionario.setValorHora(scan.nextFloat());
                        System.out.println("Digite a quantidade de horas:");
                        funcionario.setQtdHora(scan.nextFloat());
                        
                    }else{
                        System.out.println("Digite o salario:");
                        funcionario.setSalario(scan.nextFloat());
                  
                    }
                    System.out.println("Digite o valor do desconto:");
                    funcionario.setValorDesconto(scan.nextFloat());
                    
                    break;
                case 2:
                    
                    System.out.println(funcionario.imprimir());
                    break;
                case 3:
                    
                    if (funcionario.getTipoVinculo() == 'H'){
                        
                        System.out.println("Digite o valor hora:");
                        funcionario.setValorHora(scan.nextFloat());
                        System.out.println("Digite a quantidade de horas:");
                        funcionario.setQtdHora(scan.nextFloat());
                        
                    }else{
                        System.out.println("Digite o salario:");
                        funcionario.setSalario(scan.nextFloat());
                  
                    }
                    break;
                    
                case 4:
                    break;
                
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }

}

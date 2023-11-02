package POO_Aula2;

import java.util.Scanner;

public class Vendedor {
    
    private int codigo;
    private String nome;
    private double percentualComissao;
    
    public void vendedor(){
        
    }
    public void vendedor(int codigo , String nome , double percentualComissao){
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    public double calcularPagamentoComissao(double valorVenda){
        return valorVenda * percentualComissao / 100;
    }
    public double calcularPagamentoComissao(double valorVenda , double desconto){
        return calcularPagamentoComissao(valorVenda) - desconto;
    }
    public String imprimir (double valorVenda , double desconto){
        return "\nCodigo: "+getCodigo()+"\nNome: "+getNome()+"\nValor venda: "
                +valorVenda+"\n%Comissao: "+getPercentualComissao()+"\nDesconto: "+desconto+"\nValor a pagar: "
                +calcularPagamentoComissao(valorVenda, desconto);
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        Vendedor vendedor = new Vendedor();
        
        int opt = 0;
        
        
        while(opt !=3){
            
            System.out.println("=======Menu=======");
            System.out.println("1 - Cadastrar Vendedor\n2 - Calcular Comissao\n3 - Sair\n");
        
            opt = scan.nextInt();
            
            switch (opt){
                
                case 1:
                    System.out.println("Digite o codigo do vendedor:");
                    vendedor.setCodigo(scan.nextByte());
                    System.out.println("Digite o nome::");
                    vendedor.setNome(scan.next());
                    System.out.println("Digite a porcentagem de comissao:");
                    vendedor.setPercentualComissao(scan.nextByte());
                    System.out.println("Vendedor cadastrado!");
                    break;
                case 2:
                    System.out.println("Digite o valor da venda:");
                    double valorVenda = vendedor.calcularPagamentoComissao(scan.nextByte());
                    System.out.println("Digite o valor do desconto");
                    double desconto = vendedor.calcularPagamentoComissao(0, scan.nextByte());
                    System.out.println(vendedor.imprimir(valorVenda, desconto));
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcao invalida!");
                            
                    
            }
            
            
            
        }
        
    }
    
    
}

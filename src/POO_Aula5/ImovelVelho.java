/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_Aula5;


public class ImovelVelho extends Imovel{
    
    private double valorDesconto;

    public ImovelVelho(){

    }
    public ImovelVelho(int codigo , String endereco , double valor , double valorDesconto){
        super(codigo, endereco, valorDesconto);
        this.valorDesconto = valorDesconto;
    }
    public void setValorDesconto(double valorDesconto){
        this.valorDesconto = valorDesconto;
    }
    public double getValorDesconto(){
        return valorDesconto;
    }
    public double caulcularValorImovel(){
        double valorTotal = super.getValor() - valorDesconto;
        return valorTotal;
    }
    public String imprimir(){
        return "\nCódigo:"+super.getCodigo()+"\nEndereço:"+super.getEndereco()+"\nValor Total:"+caulcularValorImovel();

    }
    
    @Override
    
    public String toString(){
        
        return "\nCódigo:"+super.getCodigo()+"\nEndereço:"+super.getEndereco()+"\nValor Total:"+caulcularValorImovel();
        
    }
    
}

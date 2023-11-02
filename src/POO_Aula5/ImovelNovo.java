/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_Aula5;


public class ImovelNovo extends Imovel{
    
    private double valorAdicional;

    public ImovelNovo(){

    }
    public ImovelNovo(int codigo , String endereco , double valor , double valorAdicional){
        super(codigo, endereco, valorAdicional);
        this.valorAdicional = valorAdicional;
    }
    public void setValorAdicional(double valorAdicional){
        this.valorAdicional = valorAdicional;
    }
    public double getValorAdicional(){
        return valorAdicional;
    }
    public double caulcularValorImovel(){
        double valorTotal = super.getValor() + valorAdicional;
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

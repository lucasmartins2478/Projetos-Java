/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_Aula5;

/**
 *
 * @author lucas
 */
public class FuncionarioHorista extends Funcionario{
    
    private int qtdHoras;
    private double valorHora;
    
    public FuncionarioHorista(){
        super();
    }
    public FuncionarioHorista(int numeroCracha , String nome , String setor ,
            String funcao , int qtdHoras , double valorHora){
        
        
        super(numeroCracha, nome, setor, funcao);
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
        
        
    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public String imprimir(){
        return "\nCRACHA:"+super.getNumeroCracha()+"NOME:"+super.getNome()+"SETOR:"+super.getSetor()+
                "FUNCAO:"+super.getFuncao()
                +"QUANTIDADE HORA:"+qtdHoras+"VALOR HORA:"+valorHora+"TOTAL A RECEBER:"+valorHora*qtdHoras+"\n";
    }
    
    @Override
    
    public String toString(){
        return "\nCRACHA:"+super.getNumeroCracha()+"\nNOME:"+super.getNome()+"\nSETOR:"+super.getSetor()+
                "\nFUNCAO:"+super.getFuncao()
                +"\nQUANTIDADE HORA:"+qtdHoras+"\nVALOR HORA:"+valorHora+"\nTOTAL A RECEBER:"+valorHora*qtdHoras+"\n";
    }
}

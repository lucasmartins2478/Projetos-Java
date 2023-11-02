package POO;

public class Funcionario {
    private int cracha;
    private String nome;
    private char tipoVinculo;
    private float valorHora;
    private float qtdHora;
    private float salario;
    private float valorDesconto;
    
    
    public void setCracha(int cracha){
        this.cracha = cracha;
    }
    public int getCracha(){
        return cracha;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome (){
        return nome;
    }
    public void setValorHora(float valorHora){
        this.valorHora = valorHora;
    }
    public float getValorHora(){
        return valorHora;
    }
    public void setTipoVinculo(char tipoVinculo){
        this.tipoVinculo = tipoVinculo;
    }
    public char getTipoVinculo(){
        return tipoVinculo;
    }
    public void setQtdHora(float qtdHora){
        this.qtdHora = qtdHora;
    }
    public float getQtdHora(){
        return qtdHora;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }
    public float getSalario(){
        return salario;
    }
    public void setValorDesconto(float valorDesconto){
        this.valorDesconto = valorDesconto;
    }
    public float getValorDesconto(){
        return valorDesconto;
    }
    public float calcularValorSalario(){
        
        if (tipoVinculo == 'H'){
            
            return valorHora*qtdHora - valorDesconto;
        }
        else{
            
            return salario - valorDesconto;
            
        }
    }
   
    public String imprimir(){
        if (tipoVinculo == 'H'){
            return "\nCracha:"+cracha+"\nNome:"+nome+"\nTipo vinculo:"+tipoVinculo+"\nValor hora:"+valorHora+"\nQuantidade de horas:"+qtdHora+"\nDesconto:"+valorDesconto+"\nValor a receber:"+calcularValorSalario();
           
        }else{
            return "\nCracha:"+cracha+"\nNome:"+nome+"\nTipo vinculo:"+tipoVinculo+"\nSalario:"+salario+"\nDesconto:"+valorDesconto+"\nValor a receber:"+calcularValorSalario();
            
        }
    }
}

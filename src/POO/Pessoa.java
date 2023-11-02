package POO;

public class Pessoa {
    
    private String nome;
    private String telefone;
    private int idade;
    private String cpf;
 
 
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }
    
    public String imprimir(){
        
        return "Nome:"+nome+"\nIdade:"+idade+"\nCPF:"+cpf+"\nTelefone:"+telefone;
                   
    }
    
    
}

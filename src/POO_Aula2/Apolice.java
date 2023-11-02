package POO_Aula2;

import java.util.Scanner;

public class Apolice {
    
    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private double valorAutomovel;
    
    public void Apolice(){
        
    }
    public void Apolice(int numero , String nome , int idade, 
            char sexo, double valorAutomovel){
        
    }
    public double calcularValor(){
        if (sexo =='M' & idade<= 25){
            return valorAutomovel * 10/100;
        }else if (sexo == 'M' & idade > 25){
            return valorAutomovel* 5/100;
        }else{
            return valorAutomovel * 2/100;
        }
    }
    
    public String imprimir (){
        return "\nNumero: "+numero+"\nNome: "+nome+"\nIdade: "+idade+"\nSexo: "+sexo+
                "\nValor automovel:" +valorAutomovel+"\nValor apolice:" +calcularValor();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Apolice apolice = new Apolice();
        
        int opt = 0;
        
        while(opt !=3){
            
            System.out.println("\n1 - Criar apolice\n2 - Ver dados apolice\n3 - Sair");
            opt = scan.nextInt();
            
            switch(opt){
                
                case 1:
                    System.out.println("Digite o numero da apolice:");
                    apolice.setNumero(scan.nextInt());
                    System.out.println("Digite o seu nome:");
                    apolice.setNome(scan.next());
                    System.out.println("Digite sua idade:");
                    apolice.setIdade(scan.nextInt());
                    System.out.println("Digite o seu sexo:");
                    apolice.setSexo(scan.next().charAt(0));
                    System.out.println("Digite o valor do Automovel:");
                    apolice.setValorAutomovel(scan.nextByte());
                    System.out.println("O valor da apolice é:"+apolice.calcularValor());
                    break;
                    
                case 2:
                    System.out.println(apolice.imprimir());
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }   
}

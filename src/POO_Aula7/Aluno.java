/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_Aula7;

/**
 *
 * @author lucas
 */
public class Aluno {
    private String ra;
    private String nome;
    private String curso;
    
    
    public Aluno(){
        
    }
    public Aluno(String ra , String nome , String curso){
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    public String toString(){
        return"";
    }
    public double calcularMedia(){
        return 0;
    }
    public String verificarAprovacao(){
        return "";
    }
    
}

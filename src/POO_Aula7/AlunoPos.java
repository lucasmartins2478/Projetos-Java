/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_Aula7;

/**
 *
 * @author lucas
 */
public class AlunoPos extends Aluno{
    
    private String anoConclusaoGraduacao;
    private double nota1;
    private double nota2;
    
    
    public AlunoPos(){
        
    }
    public AlunoPos(String ra, String nome , String curso , String anoConclusaoGraduacao){
        super(ra , nome , curso);
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }

    public String getAnoConclusaoGraduacao() {
        return anoConclusaoGraduacao;
    }

    public void setAnoConclusaoGraduacao(String anoConclusaoGraduacao) {
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    @ Override
    
    public double calcularMedia(){
        return (nota1+nota2)/2;
    }
    
    public String toString (){
        return "\nRA: "+super.getRa()+"\nNome: "+super.getNome()+"\nCurso: "+super.getCurso()+"\nAno de conclusao de graduacao: "+anoConclusaoGraduacao+"\nMedia: "+calcularMedia()+"\n";
    }
    
    
    
}

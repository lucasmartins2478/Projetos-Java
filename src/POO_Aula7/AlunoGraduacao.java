/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_Aula7;

/**
 *
 * @author lucas
 */
public class AlunoGraduacao extends Aluno{
    
    private String anoConclusaoEnsinoMedio;
    private double ac1;
    private double ac2;
    private double ag;
    private double af;
    
    public AlunoGraduacao(){
        
    }
    public AlunoGraduacao(String ra, String nome , String curso , String anoConclusaoEnsinoMedio){
        super(ra , nome , curso);
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }

    public String getAnoConclusaoEnsinoMedio() {
        return anoConclusaoEnsinoMedio;
    }

    public void setAnoConclusaoEnsinoMedio(String anoConclusaoEnsinoMedio) {
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }

    public double getAc1() {
        return ac1;
    }

    public void setAc1(double ac1) {
        this.ac1 = ac1;
    }

    public double getAc2() {
        return ac2;
    }

    public void setAc2(double ac2) {
        this.ac2 = ac2;
    }

    public double getAg() {
        return ag;
    }

    public void setAg(double ag) {
        this.ag = ag;
    }

    public double getAf() {
        return af;
    }

    public void setAf(double af) {
        this.af = af;
    }
    @Override
    
    
    
    public double calcularMedia(){
        return (ac1 * 0.1)+(ac2*0.3)+(ag*0.2)+(af*0.4);
        
    }
    public String toString(){
    
        return "\nRA: "+super.getRa()+"\nNome: "+super.getNome()+"\nCurso: "+super.getCurso()+
                "\nAno de Conclusao do Ensino Medio: "+anoConclusaoEnsinoMedio+"\nMedia: "+calcularMedia();
    }
    
    public String verificarAprovacao(){
  
        if (calcularMedia() >= 7){
            return "O aluno foi aprovado!";
        }else{
            return "O aluno foi reprovado!";
        }
    }
    
    
    
    
}

package POO;

public class Aluno {
    
    private String ra;
    private String nome;
    private float ac1;
    private float ac2;
    private float ag;
    private float af;
    
    public void setRa(String ra){
        this.ra = ra;
    }
    public String getRa(){
        return ra;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setAc1(float ac1){
        this.ac1 = ac1;
    }
    public float getAc1(){
        return ac1;
    }
    public void setAc2(float ac2){
        this.ac2 = ac2;
    }
    public float getAc2(){
        return ac2;
    }
    public void setAg(float ag){
        this.ag = ag;
    }
    public float getAg(){
        return ag;
    }
    public void setAf(float af){
        this.af = af;
    }
    public float getAf(){
        return af;
    }
    public double calcularMedia(){
        
        double media = (ac1 * 0.15)+(ac2 * 0.3)+(ag * 0.1)+(af * 0.45);
        return media;
        
    }
    public String verificarAprovação(){
        
        if(calcularMedia()>=5){
            return "Aprovado";
           
        }else{
            return "Reprovado";
        }
    }
    
    public String imprimir(){
        return "Ra:"+ra+"\nNome:"+nome+"\nAc1:"+ac1+"\nAc2:"+ac2+"\nAG:"+ag+"\nAF:"+af+"\nMedia:"+calcularMedia()+"\nSituacao:"+verificarAprovação();
    }
    
}

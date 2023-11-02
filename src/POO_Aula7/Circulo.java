/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_Aula7;

/**
 *
 * @author lucas
 */
public class Circulo extends FormaGeometrica{
    
    private double raio;
    
    
    public Circulo(double raio){
        this.raio = raio;
    }
    public void setRaio(double raio){
        this.raio = raio;
    }
    public double getRaio(){
        return raio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * (raio*raio);
    }
    
    public String toString(){
        return "\nRaio: "+raio+"\nArea: "+calcularArea()+"\n";
    }
        
    
}

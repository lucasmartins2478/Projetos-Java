/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO_Aula7;

/**
 *
 * @author lucas
 */
public class Retangulo extends FormaGeometrica{
    private double largura;
    private double altura;
    
    public Retangulo(double largura , double altura){
        this.altura = altura;
        this.largura = largura;
    }
    public void setLargura(double largura){
        this.largura = largura;
    }
    public double getLargura(){
        return largura;
    }   
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }
    
    @Override
    
    public double calcularArea(){
        return largura * altura;
    }
    
    public String toString(){
        return "\nLargura: "+largura+"\nAltura: "+altura+"\nArea: "+calcularArea()+"\n";
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria;

/**
 *
 * @author ficdev
 */
public class Retangulo {
    
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double calcularArea() {
        return this.base * this.altura;
    }
    
    public double calcularPerimetro(){
        return 2 * (this.base + this.altura);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meuPrograma;

import geometria.Retangulo;
/**
 *
 * @author ficdev
 */
public class Main {
    
    public static void main(String[] args){
        Retangulo retangulo = new Retangulo(5.0, 10.0);
        
        double area = retangulo.calcularArea();
        double perimetro = retangulo.calcularPerimetro();
        
        System.out.println ("A área do retângulo: " + area);
        System.out.println("Perímetro do retângulo: " + perimetro);
    }
    
}

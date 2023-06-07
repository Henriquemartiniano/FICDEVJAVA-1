/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafioaula08;

/**
 *
 * @author ficdev
 */
public class DesafioAula08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
try {
int resultado = 10/ 0;
System.out.println(resultado);
} catch (ArithmeticException e) {
System.out.println("Não é possível dividir por zero.");
}
        // TODO code application logic here
    }
    
}

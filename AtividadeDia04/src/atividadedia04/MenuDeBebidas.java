/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadedia04;

/**
 *
 * @author ficdev
 */
import javax.swing.JOptionPane;

public class MenuDeBebidas {
    public static void main(String[] args){
        int opcao;
        double preco = 0.0;
        
        String menu = "Menu de Bebidas:\n" +
                      "1. Cerveja\n " +
                      "2. Suco\n" +
                      "3. Água com Gás\n" +
                      "4. Chá de Camomila\n";
        
        opcao = Integer.parseInt(JOptionPane.showInputDialog(menu + " Digite a sua opcão desejada: "));
        
                    switch (opcao){
                        case 1 -> preco = 3.90;
                        case 2 -> preco = 8.0;
                        case 3 -> preco = 3.50;
                        case 4 -> preco = 4.20;
                        default -> JOptionPane.showMessageDialog (null, "Opção Inválida!");
                    }
                    if (preco != 0.0) {
                        JOptionPane.showMessageDialog(null, String.format("O preço da bebida escolhida é R$ %.2f", preco));
                    }
    }
    
}

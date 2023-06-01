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
public class NotasEAlunos {
    public static void main(String[] args){
        String[][] alunos = new String [50][3];
        int qntdAlunos = 0;
        while (true){
            String nome = JOptionPane.showInputDialog (null, "Digite o nome do aluno: ");
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, " Digite a idade do aluno: "));
            double nota = Double.parseDouble(JOptionPane.showInputDialog(null, " Digite a nota do aluno: "));
            
            alunos[qntdAlunos][0] = nome;
            alunos[qntdAlunos][1] = Integer.toString(idade);
            alunos[qntdAlunos][2] = Double.toString (nota);
            qntdAlunos++;
                    
                    int opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro aluno? ");
                    if (opcao != JOptionPane.YES_OPTION){
                        break;
                    }
        }
        String ListaAlunos = "Lista de alunos cadastrados: \n";
        double totalNotas = 0.0;
        for (int i = 0; i < qntdAlunos; i++){
            ListaAlunos += alunos[i][0] + " - " + alunos [i][1] + " anos - Nota: " + alunos[i][2] + "\n";
            totalNotas += Double.parseDouble(alunos [i][2]);
        }
        double mediaNotas = totalNotas / qntdAlunos;
        ListaAlunos += "\nMédia das notas: " + mediaNotas;
        JOptionPane.showMessageDialog (null, ListaAlunos);
    }
    
}

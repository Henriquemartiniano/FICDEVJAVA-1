/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafioaula05;

/**
 *
 * @author ficdev
 */
public class Gerente extends Funcionario {
private int senha;
private int numeroDeFuncionariosGerenciados;
public boolean autentica(int senha) {
if (this.senha == senha) {
System.out.println("Acesso Permitido!");
return true;
} else {
System.out.println("Acesso Negado!");
return false;
}
}
// setter da senha omitido
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Alunos
 */
public class ContaBancaria {
    private final String agencia;
    private String numero;
    private Pessoa Pessoa;
    private double saldo;
    
    public ContaBancaria(String agencia, String numero) {
        this.agencia = agencia;
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

}

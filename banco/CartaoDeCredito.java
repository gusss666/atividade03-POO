/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Alunos
 */
public class CartaoDeCredito {
    private String numero;
    private double limite;
    private ContaBancaria ContaBancaria;
    public CartaoDeCredito(String numero, double limite) {
        this.numero = numero;
        this.limite = limite;
    }

    public String getNumero() {
        return numero;
    }

    public double getLimite() {
        return limite;
    }
    
    
}

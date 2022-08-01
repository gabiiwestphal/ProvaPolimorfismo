/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provaprogquestao1;

/**
 *
 * @author Gabriela
 */
public abstract class Pessoa {
    protected String nome;
    protected String altura;
    
    public abstract String MostrarIdade (int idade);

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", altura=" + altura + '}';
    }
}

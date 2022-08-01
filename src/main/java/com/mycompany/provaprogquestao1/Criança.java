/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.provaprogquestao1;

/**
 *
 * @author Gabriela
 */
public class Criança extends Pessoa{

    @Override
    public String MostrarIdade(int idade) {
       return "voce possui " + idade + " anos";
    }
    
     public String toString(){
        return super.toString() + ", é uma criança";
        
     }
}

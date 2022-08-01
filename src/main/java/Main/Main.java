/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import com.mycompany.provaprogquestao1.Adolescente;
import com.mycompany.provaprogquestao1.Criança;
import com.mycompany.provaprogquestao1.Idoso;
import com.mycompany.provaprogquestao1.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        List <Pessoa> pessoas = new ArrayList<>();
        
        Pessoa p1 = new Adolescente();
        Pessoa p2 = new Criança();
        Pessoa p3 = new Idoso();
       
        System.out.println(p1.MostrarIdade(16));
        System.out.println(p2.MostrarIdade(8));
        System.out.println(p3.MostrarIdade(80));
        
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoas.toString());
            
        }
    }
}


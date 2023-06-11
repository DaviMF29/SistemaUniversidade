/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escola;

import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Aluno extends Pessoa{
    double nota1;
    double nota2;
    
    public Aluno(String nome, String id, String email, int idade) {
        super(nome, id, email, idade);
        
    }
    
    ArrayList<Cadeiras> cadeiras = new ArrayList<Cadeiras>();
    
    

    public ArrayList<Cadeiras> getCadeiras() {
        return cadeiras;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }
    
    
    
    
    
}

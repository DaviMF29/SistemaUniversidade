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
public class Cadeiras {
    
    String nomeCadeira;
    int cargaHorária;
    String dia;
    int data;
    boolean preRequisito;
    double nota1 =0;
    double nota2 =0;
    
    
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    ArrayList<Cadeiras> preCadeiras = new ArrayList<Cadeiras>();
    
    
    public Cadeiras(String nome, int cargaHorária, String dia, int data, boolean preRequisito) {
        this.nomeCadeira = nome;
        this.cargaHorária = cargaHorária;
        this.dia = dia;
        this.data = data;
        this.preRequisito = preRequisito;
        
    }
    
    @Override
    public String toString() {
        return "\nCadeira:" + nomeCadeira + "\nCarga horária:" +
                cargaHorária + "\ndia:" + dia + "\ndata:" + data +
                "\nNota 1: "+nota1+ "\nNota 2:"+ nota2+"\n";
    }
    
    public String infCadeira(){
        return "\nCadeira:" + nomeCadeira + "\nCarga horária:" +
                cargaHorária + "\ndia:" + dia + "\ndata:" + data+"\n";
    }
    

    public boolean verificarPreRequisito(){
        if(this.preRequisito){
            return true;
        }
        else{
            return false;
        }
        
        
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    
    
    
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    
    
    
}

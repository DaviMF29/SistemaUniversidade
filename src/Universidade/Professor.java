/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escola;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Professor extends Pessoa{
    String cargo;
    String diaAula;
    
    Scanner input = new Scanner(System.in);
    
    //ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    
    public Professor(String cargo, String diaAula, String nome, String id, String email, int idade) {
        super(nome, id, email,idade);
        this.cargo = cargo;
        this.diaAula = diaAula;
        
    }
    
    
    
    ArrayList<Cadeiras> cadeiras = new ArrayList<Cadeiras>();

    public ArrayList<Cadeiras> getCadeira() {
        return cadeiras;
    }

    
    
    public void cadastrarNotasAluno(Aluno aluno, Cadeiras materia){
        if(aluno.cadeiras.isEmpty() ){
            System.out.println("Não é possível cadastrar nenhuma nota.");
        
        }else{
            System.out.println("Adicionar nota em:"+ materia.nomeCadeira);
            System.out.println("Cadastrar nota em qual unidade? 1 ou 2.");    
            int unidade = input.nextInt();
            if(unidade ==1){  
                System.out.println("Adcione a nota da unidade 1:");
                double notaAluno =0;
                notaAluno = input.nextDouble();
                materia.setNota1(notaAluno);
                
                
            }
            else if(unidade ==2){
                System.out.println("Adcione a nota da unidade 2:");
                double notaAluno =0;
                notaAluno = input.nextDouble();
                materia.setNota2(notaAluno);
            }
    
    }
        
}
    public void realizarFrenquencia(){
        
    }  
    
}
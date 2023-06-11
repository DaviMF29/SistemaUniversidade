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
public class Sistema {

    Scanner input = new Scanner(System.in);
    ArrayList<Cadeiras> cadeiras = new ArrayList<Cadeiras>();

    public void cadastrarCadeirasSistema(Cadeiras cadeira) {
        cadeiras.add(cadeira);
    }

    public void removerCadeiraSistema() {
        int posicaoCadeira = 0;

        if (cadeiras.isEmpty()) {
            System.out.println("Nenhuma cadeira cadastrada no sistema");
        } else {
            listarCadeiras();
            System.out.println("Insira a posição para remoção da cadeira: ");
            posicaoCadeira = input.nextInt();

            while (posicaoCadeira > cadeiras.size() || posicaoCadeira <= 0) {
                System.out.println("Valor inválido! Apenas números entre 1 e " + cadeiras.size());
                System.out.println("Insira a posição para remoção da cadeira: ");
                posicaoCadeira = input.nextInt();

            }
            cadeiras.remove(posicaoCadeira - 1);
            System.out.println("Remoção bem sucedida");

        }

    }

    public void listarCadeiras() {
        if (cadeiras.isEmpty()) {
            System.out.println("Nenhuma cadeira adicionada");
        } else {
            for (int i = 0; i < cadeiras.size(); i++) {
                System.out.println((i + 1) + "-" + cadeiras.get(i).infCadeira());
            }
        }
    }

    public void listarCadeirasAluno(Aluno aluno) {
        if (aluno.cadeiras.isEmpty()) {
            System.out.println("Nenhuma cadeira cadastrada");
        } else {
            System.out.println("Cadeiras cadastradas de " + aluno.nome);
            
            for (int i = 0; i < cadeiras.size(); i++) {
                System.out.println((i + 1) + "-" + cadeiras.get(i));
            }
                
                
            }
            
        }
    
    
    

    public void cadastrarCadeiraAluno(Aluno aluno, Cadeiras cadeira) {
        if (aluno.cadeiras.size() >= 9) {
            System.out.println("Limite máximo de cadeiras cadastradas atingido.");
            System.out.println("Não foi possível adicionar mais nenhuma cadeira."); 
                
        }
        else if(cadeira.verificarPreRequisito()){
            System.out.println("O aluno precisa cumprir uma cadeira anterior!");
        }
            else {
            aluno.cadeiras.add(cadeira);
        }
    }

    public void cadastrarCadeiraProfessor(Professor professor, Cadeiras cadeira) {
        
        for (int i = 0; i < professor.getCadeira().size(); i++) {
            if (professor.diaAula.equals(cadeira.dia)) {
                professor.getCadeira().add(cadeira);
            }

        }
    }
    
    public void adicionarPreRequisito(Cadeiras cadeira,Cadeiras Cadeirarequisito){
        if(cadeira.preRequisito){
            cadeira.preCadeiras.add(Cadeirarequisito);
            System.out.println("\nPré-requisito adicionado!");
        }
       
        else{
            System.out.println("Esta cadeira não necessita nenhum pré-requisito!");
        }
    }
    
    
    public void mostrarPreRequisito(Cadeiras cadeira){
        if(cadeira.preRequisito){
            System.out.println("A cadeira: "+ cadeira.nomeCadeira+
                    " em os seguinte(s) pré-requisitos:");
            for(int i =0 ;i< cadeira.preCadeiras.size();i++){
                System.out.println(cadeira.preCadeiras.get(i));    
            }
            
        }
        else{
            System.out.println("Não há nenhum pré-requisito cadastrado!");
            
        }
    }
    
    
}
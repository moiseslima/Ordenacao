/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author moises
 */
public class Aluno {
    private String nome;
    private int matricula;
    private int ingresso;

    public Aluno(){};

    public Aluno(String nome, int matricula, int ingresso){
        this.nome = nome;
        this.matricula = matricula;
        this.ingresso = ingresso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIngresso() {
        return ingresso;
    }

    public void setIngresso(int ingresso) {
        this.ingresso = ingresso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", matricula=" + matricula + ", ingresso=" + ingresso + '}';
    }
    
}

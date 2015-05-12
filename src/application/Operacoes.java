/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author moises
 */
public class Operacoes {
     // FunÃ§Ã£o geraNome: Cria um nome randÃ´mico



    private static String geraNome(){
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for(int i = 0; i < 20; i++){
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        return sb.toString();
    }


    //FunÃ§Ã£o geraMatricula: Cria uma matrÃ­cula randÃ´mica

    private static int geraMatricula(){
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        int val;

        for(int i = 0; i < 8; i++){
            val =  rand.nextInt(10);
            sb.append(val);
        }
        return Integer.parseInt(sb.toString());
    }


     //FunÃ§Ã£o geraAno: Randomiza um ano em um intervalo especÃ­fico


    private static int geraAno(){
        Random rand = new Random();
        return rand.nextInt(2014 - 1980) + 1980;
    }


     /* FunÃ§Ã£o geraAluno: Cria um novo aluno a partir dos dados randomizados por:
                -geraNome
                -geraMatricula
                -geraAno

    */
    public static Aluno geraAluno(){
        String nome = geraNome();
        int matricula = geraMatricula();
        int ano = geraAno();

        Aluno a = new Aluno(nome, matricula, ano);
        return a;
    }


    // FunÃ§Ã£o exibeLista: Exibe todos os dados contidos em uma lista


    public static void exibeLista(ArrayList<Aluno> al){
        System.out.println("");
        for(Aluno a: al){
            System.out.println(""+a.toString());
        }
        System.out.println("");
    }


    // FunÃ§Ã£o displaySortInfo: Exibe informaÃ§Ãµes a respeito de cada sort


    public static void displaySortInfo(ArrayList<Aluno> al, int sort){
        long permutas = 0;
        long startTime = 0;
        long endTime = 0;

        switch(sort){
            case 1:
                System.out.println("Bubble Sort: ");
                startTime = System.currentTimeMillis();
                permutas = Ordenacao.bubbleSort(al);
                endTime = System.currentTimeMillis();
                System.out.println(">Permutacoes: "+ permutas);
                System.out.println(">Tempo decorrido: " + (endTime - startTime) + "ms");
                break;
            case 2:
                System.out.println("Insertion Sort: ");
                startTime = System.currentTimeMillis();
                permutas = Ordenacao.insertionSort(al);
                endTime = System.currentTimeMillis();
                System.out.println(">Permutacoes: "+ permutas);
                System.out.println(">Tempo decorrido: " + (endTime - startTime) + "ms");
                break;
            case 3:
                System.out.println("Selection Sort: ");
                startTime = System.currentTimeMillis();
                permutas = Ordenacao.selectionSort(al);
                endTime = System.currentTimeMillis();
                System.out.println(">Permutacoes: "+ permutas);
                System.out.println(">Tempo decorrido: " + (endTime - startTime) + "ms");
                break;
            case 4:
                System.out.println("Shell Sort: ");
                startTime = System.currentTimeMillis();
                permutas = Ordenacao.shellSort(al);
                endTime = System.currentTimeMillis();
                System.out.println(">Permutacoes: "+ permutas);
                System.out.println(">Tempo decorrido: "+ (endTime - startTime) + "ms");
                break;
            default:
                System.out.println("OpÃ§Ã£o invalida!");
        }
    }
    
}

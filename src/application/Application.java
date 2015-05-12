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

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //entrada de dados pelo output 
       
        int escolha = 0;
        int Tamanho = 0;
       

        System.out.print("Digite o Número de elementos que deseja ordenar:: ");
       
        while (true) {                    
            if (input.hasNextInt()) {
                Tamanho = input.nextInt();
                break;
            } else {
                System.out.print("Valor invalido!: ");
                input.next();
            }
        }

        ArrayList<Aluno> al = new ArrayList<>(); //ArrayList de alunos
        ArrayList<Aluno> aux;

        for (int i = 0; i < Tamanho; i++) { //cria e insere os alunos no ArrayList
            al.add(Operacoes.geraAluno());
        }

        System.out.println("\n          MENU");
        System.out.println("Escolha uma das opções\n"
                + "1 - Exibir o ArrayList\n"
                + "2 - Exibir o Tempo de Execução das ordenações e a quantidade de trocas de cada algoritimo \n"
                + "Opcao: ");
        while(true){
            if(input.hasNextInt()){
                escolha = input.nextInt();
                if(escolha == 1 || escolha == 2){
                    break;
                }else{
                    System.out.print("Valor invalido: ");
                }
            }else{
                System.out.print("Valor invalido: ");
                input.next();
            }
        }

        if(escolha == 1){ //Realiza as ordenações e exibe a lista
            Operacoes.exibeLista(al);
            for(int i = 1; i <= 4; i++){
                aux = new ArrayList<Aluno>(al);
                Operacoes.displaySortInfo(aux, i);
                Operacoes.exibeLista(aux);
            }
        }else{ //Realiza as ordenaÃ§Ãµes
            for(int i = 1; i <= 4; i++){
                aux = new ArrayList<Aluno>(al);
                Operacoes.displaySortInfo(aux, i);
            }
        }
        
    }
    
}

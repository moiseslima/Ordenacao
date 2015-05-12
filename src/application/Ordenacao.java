/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author moises
 */
public class Ordenacao {
      public static long bubbleSort(ArrayList<Aluno> al) {
        long permutas = 0;
        boolean troca = false;

        for (int i = 0; i < al.size(); i++) {
            for (int j = 0; j < al.size() - 1; j++) {
                if (al.get(j).getMatricula() > al.get(j + 1).getMatricula()) {
                    Collections.swap(al, j, j + 1);
                    troca = true;
                    permutas++;
                }
            }
            if (!troca) {
                break;
            }
        }
        return permutas;
    }

    public static long selectionSort(ArrayList<Aluno> al) {
        int min = 0;
        int aux = 0;
        long permutas = 0;
        boolean troca = false;

        for (int i = 0; i < al.size() - 1; i++) {
            min = i;
            for (int j = i + 1; j < al.size(); j++) {
                if (al.get(min).getMatricula() > al.get(j).getMatricula()) {
                    min = j;
                    troca = true;
                }
            }
            if (troca) {
                Collections.swap(al, min, i);
                permutas++;
            }
        }
        return permutas;
    }

    public static long insertionSort(ArrayList<Aluno> al) {
        int j = 0;
        long permuta = 0;
        Aluno aux;

        for (int i = 1; i < al.size(); i++) {
            aux = al.get(i);
            for (j = i - 1; j >= 0 && al.get(j).getMatricula() > aux.getMatricula(); j--) {
                al.set(j + 1, al.get(j));
                permuta++;
            }
            al.set(j + 1, aux);
        }
        return permuta;
    }

    public static long shellSort(ArrayList<Aluno> al) {
        int h = 0;
        long permuta = 0;
        int j = 0;
        Aluno aux;

        while (h < al.size()) {
            h = (h * 3) + 1;
        }
        h /= 3;
        while (h > 0) {
            for (int i = h; i < al.size(); i++) {
                aux = al.get(i);
                j = i;
                while (j >= h && al.get(j - h).getMatricula() > aux.getMatricula()) {
                    al.set(j, al.get(j - h));
                    j -= h;
                    permuta++;
                }
                al.set(j, aux);
            }
            h /= 2;
        }
        return permuta;
    }

}
package com.angi.datos;

import java.util.ArrayList;
import java.util.Comparator;

public class MetodosGenericos {
    /**
     * Inserta elementos en una ArrayList
     * @param <T> tipo genérico que será definido una vez seleccionado el método
     * @param elemento a insertar
     * @param lista a crear
     */
    public <T> void insertar(T elemento, ArrayList<T>lista){
        lista.add(elemento);
    }
    
    /**
     * Imprime los elementos del ArrayList
     * @param <T> tipo genérico que será definido una vez seleccionado el método
     * @param lista a imprimir
     */
    public static <T> void mostrar(ArrayList<T>lista){
        for (T ele:lista)
            System.out.println(ele);
    }
    
    /**
     * Imprime los elementos del ArrayList ordenado de menor a mayor
     * @param <T> tipo genérico que será definido una vez seleccionado el método
     * @param lista a imprimir
     */
    public static <T> void ordenar(ArrayList<T>lista){
        lista.sort((Comparator<? super T>) Comparator.naturalOrder());
        for(T ele:lista){
            System.out.println(ele);
        }
    }
}

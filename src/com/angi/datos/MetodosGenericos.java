package com.angi.datos;

import java.util.ArrayList;
import java.util.Collections;
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
            System.out.println("Los elemento de la lista son: "+ele);
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
    
    /**
     * Imprime el elemento de valor más bajo de un ArrayList
     * @param <T> tipo genérico que será definido una vez seleccionado el método
     * @param lista donde buscará el elemento
     */
    public static <T> void minimoLista(ArrayList<T>lista){
        System.out.println("El elemento con su valor mínimo es: "+Collections.min(lista,null));
    }
    
    /**
     * Imprime el elemento de valor más alto de un ArrayList
     * @param <T> tipo genérico que será definido una vez seleccionado el método
     * @param lista donde buscará el elemento
     */
    public static <T> void maximoLista(ArrayList<T>lista){
        System.out.println("El elemento con su valor máximo es: "+Collections.max(lista,null));
    }
    
    /**
     * Busca e imprime un elemento de la lista
     * @param <T> tipo genérico que será definido una vez seleccionado el método
     * @param elemento a buscar en la lista
     * @param lista donde buscará el elemento
     */
    public static <T> void buscar(T elemento,ArrayList<T>lista){
        if(lista.indexOf(elemento)>=0){
            System.out.println("El elemento "+elemento+" está en la lista");
        }else{
            System.out.println("El elemento "+elemento+ "no está en la lista");
        }
    }
    
    /**
     * Busca un elemento de la lista y lo elimina
     * @param <T> tipo genérico que será definido una vez seleccionado el método
     * @param elemento a buscar y eliminar en la lista
     * @param lista donde buscará el elemento
     */
    public static <T> void eliminar(T elemento,ArrayList<T>lista){
        if(lista.indexOf(elemento)>=0){
            lista.remove(elemento);
        }else{
            System.out.println("El elemento "+elemento+ "no está en la lista");
        }
        
    }
}

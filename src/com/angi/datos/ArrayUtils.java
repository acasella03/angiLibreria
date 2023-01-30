package com.angi.datos;

public class ArrayUtils {
    
    /**
     * Método que permite buscar un elemento en un Array
     * @param array lista de elementos
     * @param elementoBuscar elemento a buscar
     * @return índice del elemento en la lista
     */
    public static int buscar(String[] array, String elementoBuscar){
        for (int i = 0; i < array.length; i++) {
            if(elementoBuscar.equals(array[i])){
                return i;
            }
        }
        return -1;
    }
    
}

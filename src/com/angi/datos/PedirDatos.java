package com.angi.datos;

import javax.swing.JOptionPane;

public class PedirDatos {
    
    /**
     * Método que pide los datos de tipo String por ventana
     * @param mensaje reflejado en la ventana para pedir el dato al usuario
     * @return el dato de tipo String introducido por el usuario
     */
    public static String pedirDatos(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }
    
    /**
     * Método que pide los datos de tipo int por ventana
     * @param mensaje reflejado en la ventana para pedir el dato
     * @return el dato de tipo int introducido por el usuario
     */
    public static int pedirEntero(String mensaje) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
    
    /**
     * Método que pide los datos de tipo float por ventana
     * @param mensaje reflejado en la ventana para pedir el dato
     * @return el dato de tipo float introducido por el usuario
     */
    public static float pedirFloat(String mensaje){
        return Float.parseFloat(JOptionPane.showInputDialog(mensaje));
    }
}

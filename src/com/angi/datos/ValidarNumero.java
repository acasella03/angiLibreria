package com.angi.datos;

import javax.swing.JOptionPane;

public class ValidarNumero {
    
    /**
     * Método que valida la nota de un alumno comprendida del 0 al 10 ambos incluídos
     * @param nota de tipo int solicitada por ventana al usuario
     * @return la nota de tipo int introducida por el usuario
     */
    
    public static int validarNota(int nota) {
        do {
            nota = Integer.parseInt(JOptionPane.showInputDialog("teclea nota entre 0 y 10"));
        } while (nota < 0 || nota > 10);
        return nota;
    }
    
}

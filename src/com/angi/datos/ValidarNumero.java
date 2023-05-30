package com.angi.datos;

public class ValidarNumero {

    /**
     * Método que valida si un número está comprendido entre el 0 al 10 ambos
     * incluídos
     *
     * @param numero de tipo int solicitada por ventana al usuario
     * @return true si está entre el cero y el 10, false si no lo está.
     */
    public static boolean validarNumeroEnRango(int numero) {
        if (numero >= 0 && numero <= 10) {
            return true; // Está en el rango
        } else {
            return false; // No está en el rango
        }
    }

    /**
     *Método que valida si un número es mayor que 1
     * @param numero de tipo int solicitada por ventana al usuario
     * @return true si es mayor que cero, false si es menor que cero
     */
    public static boolean validarNumeroPositivo(int numero) {
        if (numero >= 0) {
            return true;
        }
        return false;
    }
}

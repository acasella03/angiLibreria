package com.angi.datos;

import java.util.GregorianCalendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PedirDatos {

    /**
     * Método que pide los datos de tipo String por ventana
     *
     * @param mensaje reflejado en la ventana para pedir el dato al usuario
     * @return el dato de tipo String introducido por el usuario
     */
    public static String pedirDatos(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }

    /**
     * Método que pide los datos de tipo int por ventana
     *
     * @param mensaje reflejado en la ventana para pedir el dato
     * @return el dato de tipo int introducido por el usuario
     */
    public static int pedirEntero(String mensaje) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }

    /**
     * Método que pide los datos de tipo float por ventana
     *
     * @param mensaje reflejado en la ventana para pedir el dato
     * @return el dato de tipo float introducido por el usuario
     */
    public static float pedirFloat(String mensaje) {
        return Float.parseFloat(JOptionPane.showInputDialog(mensaje));
    }
    
    /*public static GregorianCalendar pedirFecha() {
        // crea un objeto Scanner para leer la entrada del usuario desde la consola
        Scanner scanner = new Scanner(System.in);
        // solicita al usuario que ingrese la fecha en formato "dd/mm/yyyy"
        pedirDatos("Ingrese la fecha en formato dd/mm/yyyy: ");
        String fechaString = scanner.nextLine();
        // separa la cadena de entrada en día, mes y año utilizando el caracter "/"
        String[] fechaPartes = fechaString.split("/");
        int dia = Integer.parseInt(fechaPartes[0]);
        int mes = Integer.parseInt(fechaPartes[1]) - 1; // los meses en GregorianCalendar van de 0 a 11
        // los meses en GregorianCalendar van de 0 a 11
        int ano = Integer.parseInt(fechaPartes[2]);
        // crea un objeto GregorianCalendar a partir de los valores ingresados
        GregorianCalendar fecha = new GregorianCalendar(ano, mes, dia);
        return fecha;
    }*/
}

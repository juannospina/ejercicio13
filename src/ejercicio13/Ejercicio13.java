/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        String equipo[] = new String[8];     // matriz llamada equipo con tamaño de 8 celdas de tipo String
        
        llenarVector(equipo); // se llama al primer procedimiento
        System.out.println("Los compañeros son: ");
        mostrarVector(equipo);// se llama al segundo procedimiento
    }
    
    public static void llenarVector(String equipo[]){
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < 8; i++) {
            System.out.print("Ingresa el nombre del compañero "+(i+1)+":");
            equipo[i] = entrada.nextLine(); // se llena cada celda o posicion del vector a medida que se ingresa los nombres por teclado
        }
    }
    public static void mostrarVector(String equipo[]){
         for (int i = 0; i < 8; i++) {
            System.out.println("["+equipo[i]+"]");   //se imprime cada nombre de cada celda de cada posición         
        }
    }
}

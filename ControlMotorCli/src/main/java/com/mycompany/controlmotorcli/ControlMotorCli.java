/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controlmotorcli;

import java.util.Scanner;

/**
 *
 * @author raula
 */
public class ControlMotorCli {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\nElija una opción:");
            System.out.println("1 - Girar a la izquierda");
            System.out.println("2 - Girar a la derecha");
            System.out.println("3 - Detener");
            System.out.println("4 - Salir");

            opcion = scanner.nextLine();

            switch (opcion) {
                case "1" -> System.out.println("Estado del motor: Girando en sentido antihorario");
                case "2" -> System.out.println("Estado del motor: Girando en sentido horario");
                case "3" -> System.out.println("Estado del motor: Detenido");
                case "4" -> System.out.println("Saliendo...");
                default -> System.out.println("Opcio77n invalida. Intentelo de nuevo.");
            }
        } while (!opcion.equals("4"));

        scanner.close();
    }
    
}

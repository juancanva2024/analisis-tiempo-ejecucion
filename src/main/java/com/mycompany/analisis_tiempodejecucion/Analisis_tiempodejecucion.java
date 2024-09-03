/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.analisis_tiempodejecucion;

import java.util.Scanner;

/**
 *
 * @author Juan Jose Navarro M
 */
public class Analisis_tiempodejecucion {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        String continuar;

        // Registrar el tiempo inicial antes de comenzar el proceso de entrada y suma
        long tiempoInicialTotal = System.nanoTime();

        // Bloque de entrada de datos y suma
        do {
            System.out.print("Ingresa un número: ");
            double numero = scanner.nextDouble();
            suma += numero;

            System.out.print("¿Deseas ingresar otro número? (s/n): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("s"));

        // Registrar el tiempo final después de completar el proceso de entrada y suma
        long tiempoFinalTotal = System.nanoTime();

        // Calcular el tiempo total de ejecución
        long tiempoEjecucionTotal = tiempoFinalTotal - tiempoInicialTotal;

        // Mostrar los resultados
        System.out.println("La suma de los números ingresados es: " + suma);
        System.out.println("Tiempo total de ejecución en nanosegundos: " + tiempoEjecucionTotal);

        // Convertir a milisegundos si es necesario
        double tiempoEjecucionTotalMs = tiempoEjecucionTotal / 1_000_000.0;
        System.out.println("Tiempo total de ejecución en milisegundos: " + tiempoEjecucionTotalMs);

        // Registrar el tiempo inicial antes de la simulación de la suma
        long tiempoInicialSuma = System.nanoTime();

        // Simulación de la suma de un gran número de datos
        int n = 1000000;
        double sumaSimulada = 0;
        for (int i = 0; i < n; i++) {
            sumaSimulada += i * 1.0; // Simulación de la suma de números
        }

        // Registrar el tiempo final después de la suma simulada
        long tiempoFinalSuma = System.nanoTime();

        // Calcular el tiempo de ejecución de la suma simulada
        long tiempoEjecucionSuma = tiempoFinalSuma - tiempoInicialSuma;

        // Mostrar los resultados de la suma simulada
        System.out.println("La suma simulada de los números es: " + sumaSimulada);
        System.out.println("Tiempo de ejecución de la suma simulada en nanosegundos: " + tiempoEjecucionSuma);

        // Convertir a milisegundos si es necesario
        double tiempoEjecucionSumaMs = tiempoEjecucionSuma / 1_000_000.0;
        System.out.println("Tiempo de ejecución de la suma simulada en milisegundos: " + tiempoEjecucionSumaMs);
    }
}
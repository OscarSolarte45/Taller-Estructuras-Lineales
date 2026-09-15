package matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15IntercambiarFilas {

    public static int[][] generarMatriz(
            int filas, int columnas) {

        int[][] matriz = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                matriz[i][j] = random.nextInt(100) + 1;
            }
        }

        return matriz;
    }

    public static void intercambiarFilas(
            int[][] matriz) {

        int[] temporal = matriz[0];

        matriz[0] = matriz[1];
        matriz[1] = temporal;
    }

    public static void imprimirMatriz(int[][] matriz) {

        for (int[] fila : matriz) {

            for (int numero : fila) {
                System.out.print(numero + "\t");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        if (filas < 2) {

            System.out.println(
                    "La matriz debe tener mínimo 2 filas.");

            scanner.close();
            return;
        }

        int[][] matriz = generarMatriz(filas, columnas);

        System.out.println("\nMatriz original:");
        imprimirMatriz(matriz);

        intercambiarFilas(matriz);

        System.out.println("\nMatriz después de intercambiar "
                + "la primera y segunda fila:");

        imprimirMatriz(matriz);

        scanner.close();
    }
}
package matrices;

import java.util.Scanner;

public class Ejercicio14Transpuesta {

    public static int[][] generarMatriz(
            int filas, int columnas) {

        int[][] matriz = new int[filas][columnas];

        int valor = 1;

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                matriz[i][j] = valor;
                valor++;
            }
        }

        return matriz;
    }

    public static int[][] calcularTranspuesta(
            int[][] matriz) {

        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                transpuesta[j][i] = matriz[i][j];
            }
        }

        return transpuesta;
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

        int[][] matriz = generarMatriz(filas, columnas);

        int[][] transpuesta = calcularTranspuesta(matriz);

        System.out.println("\nMatriz inicial:");
        imprimirMatriz(matriz);

        System.out.println("\nMatriz transpuesta:");
        imprimirMatriz(transpuesta);

        scanner.close();
    }
}
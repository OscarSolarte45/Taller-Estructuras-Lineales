package matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio12Diagonal {

    public static int[][] generarMatriz(int n) {

        int[][] matriz = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(101) - 50;
            }
        }

        return matriz;
    }

    public static int calcularDiagonalSecundaria(
            int[][] matriz) {

        int suma = 0;
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            suma += matriz[i][n - 1 - i];
        }

        return suma;
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

        System.out.print("Ingrese el tamaño de la matriz: ");
        int n = scanner.nextInt();

        int[][] matriz = generarMatriz(n);

        System.out.println("\nMatriz:");
        imprimirMatriz(matriz);

        int suma = calcularDiagonalSecundaria(matriz);

        System.out.println(
                "\nSumatoria de la diagonal secundaria: "
                + suma);

        scanner.close();
    }
}
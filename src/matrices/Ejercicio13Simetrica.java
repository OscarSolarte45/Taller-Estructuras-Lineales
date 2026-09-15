package matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio13Simetrica {

    public static int[][] generarMatriz(int n) {
        int[][] matriz = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(21);
            }
        }

        return matriz;
    }

    public static boolean esSimetrica(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int numero : fila) {
                System.out.print(numero + "\t");
            }

            System.out.println();
        }
    }

    public static void imprimirEsquinas(int[][] matriz) {
        int ultimaFila = matriz.length - 1;
        int ultimaColumna = matriz[0].length - 1;

        System.out.println("\nEsquinas:");

        System.out.println(
                "Esquina superior izquierda: "
                + matriz[0][0]);

        System.out.println(
                "Esquina superior derecha: "
                + matriz[0][ultimaColumna]);

        System.out.println(
                "Esquina inferior izquierda: "
                + matriz[ultimaFila][0]);

        System.out.println(
                "Esquina inferior derecha: "
                + matriz[ultimaFila][ultimaColumna]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz: ");
        int n = scanner.nextInt();

        int[][] matriz = generarMatriz(n);

        System.out.println("\nMatriz:");
        imprimirMatriz(matriz);

        if (esSimetrica(matriz)) {
            System.out.println("\nLa matriz es simétrica.");
        } else {
            System.out.println("\nLa matriz no es simétrica.");
        }

        imprimirEsquinas(matriz);

        scanner.close();
    }
}
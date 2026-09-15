package matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio11Buscar {

    public static int[][] generarMatriz(int filas, int columnas) {

        int[][] matriz = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }

        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }

            System.out.println();
        }
    }

    public static boolean buscarNumero(
            int[][] matriz, int numero) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == numero) {

                    System.out.println(
                            "Número encontrado en la posición: ["
                            + i + "][" + j + "]");

                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        int[][] matriz = generarMatriz(filas, columnas);

        System.out.println("\nMatriz generada:");
        imprimirMatriz(matriz);

        System.out.print("\nIngrese el número que desea buscar: ");
        int numero = scanner.nextInt();

        boolean encontrado = buscarNumero(matriz, numero);

        if (!encontrado) {
            System.out.println(
                    "El número no se encuentra en la matriz.");
        }

        scanner.close();
    }
}
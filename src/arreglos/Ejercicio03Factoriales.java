package arreglos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio03Factoriales {

    public static int[] generarNumeros(int cantidad) {

        int[] numeros = new int[cantidad];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10);
        }

        return numeros;
    }

    public static long calcularFactorial(int numero) {

        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static long[] calcularFactoriales(int[] numeros) {

        long[] factoriales = new long[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            factoriales[i] = calcularFactorial(numeros[i]);
        }

        return factoriales;
    }

    public static void imprimirNumeros(int[] numeros) {

        System.out.println("Números iniciales:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println();
    }

    public static void imprimirFactoriales(long[] factoriales) {

        System.out.println("Factoriales:");

        for (long factorial : factoriales) {
            System.out.print(factorial + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int cantidad = scanner.nextInt();

        int[] numeros = generarNumeros(cantidad);
        long[] factoriales = calcularFactoriales(numeros);

        imprimirNumeros(numeros);
        imprimirFactoriales(factoriales);

        scanner.close();
    }
}
package arreglos;

import java.util.Random;

public class Ejercicio04MayorMenor {

    public static int[] generarArreglo() {

        int[] numeros = new int[25];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(101) - 50;
        }

        return numeros;
    }

    public static int encontrarMenor(int[] numeros) {

        int menor = numeros[0];

        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }

        return menor;
    }

    public static int encontrarMayor(int[] numeros) {

        int mayor = numeros[0];

        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
        }

        return mayor;
    }

    public static void imprimirArreglo(int[] numeros) {

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] numeros = generarArreglo();

        System.out.println("Arreglo generado:");
        imprimirArreglo(numeros);

        System.out.println("Número menor: " + encontrarMenor(numeros));
        System.out.println("Número mayor: " + encontrarMayor(numeros));
    }
}
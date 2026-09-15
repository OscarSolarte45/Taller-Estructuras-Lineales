package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio08Frecuencias {

    public static ArrayList<Integer> generarNumeros() {

        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            numeros.add(random.nextInt(20) + 1);
        }

        return numeros;
    }

    public static int contarFrecuencia(
            ArrayList<Integer> numeros, int valor) {

        int frecuencia = 0;

        for (int numero : numeros) {
            if (numero == valor) {
                frecuencia++;
            }
        }

        return frecuencia;
    }

    public static void imprimirTabla(
            ArrayList<Integer> numeros) {

        System.out.println("\nNúmero\tFrecuencia");
        System.out.println("-------------------");

        for (int i = 1; i <= 20; i++) {

            int frecuencia = contarFrecuencia(numeros, i);

            System.out.println(i + "\t" + frecuencia);
        }
    }

    public static int encontrarMayorFrecuencia(
            ArrayList<Integer> numeros) {

        int numeroMayor = 1;
        int frecuenciaMayor = 0;

        for (int i = 1; i <= 20; i++) {

            int frecuencia = contarFrecuencia(numeros, i);

            if (frecuencia > frecuenciaMayor) {
                frecuenciaMayor = frecuencia;
                numeroMayor = i;
            }
        }

        return numeroMayor;
    }

    public static void main(String[] args) {

        ArrayList<Integer> numeros = generarNumeros();

        System.out.println("ArrayList generado:");
        System.out.println(numeros);

        imprimirTabla(numeros);

        int numeroMayor = encontrarMayorFrecuencia(numeros);
        int frecuenciaMayor = contarFrecuencia(numeros, numeroMayor);

        System.out.println("\nNúmero con mayor frecuencia: "
                + numeroMayor);

        System.out.println("Frecuencia: " + frecuenciaMayor);
    }
}
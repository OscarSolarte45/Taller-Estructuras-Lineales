package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio06ArrayList {

    public static ArrayList<Integer> generarNumeros() {

        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        int numero;

        do {
            numero = random.nextInt(21) - 10;
            numeros.add(numero);
        } while (numero != 10);

        return numeros;
    }

    public static int calcularSuma(ArrayList<Integer> numeros) {

        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }

        return suma;
    }

    public static double calcularMedia(ArrayList<Integer> numeros) {

        int suma = calcularSuma(numeros);

        return (double) suma / numeros.size();
    }

    public static void imprimirNumeros(ArrayList<Integer> numeros) {

        System.out.println("Números generados:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        ArrayList<Integer> numeros = generarNumeros();

        imprimirNumeros(numeros);

        System.out.println("Suma: " + calcularSuma(numeros));
        System.out.println("Media: " + calcularMedia(numeros));
    }
}
package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio09Ordenamiento {

    public static ArrayList<Integer> generarNumeros() {

        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            numeros.add(random.nextInt(100) + 1);
        }

        return numeros;
    }

    public static ArrayList<Integer> obtenerPares(
            ArrayList<Integer> numeros) {

        ArrayList<Integer> pares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }

        return pares;
    }

    public static ArrayList<Integer> obtenerImpares(
            ArrayList<Integer> numeros) {

        ArrayList<Integer> impares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 != 0) {
                impares.add(numero);
            }
        }

        return impares;
    }

    public static void main(String[] args) {

        ArrayList<Integer> numeros = generarNumeros();

        System.out.println("Lista original:");
        System.out.println(numeros);

        ArrayList<Integer> menorMayor =
                new ArrayList<>(numeros);

        Collections.sort(menorMayor);

        System.out.println("\nMenor a mayor:");
        System.out.println(menorMayor);

        ArrayList<Integer> mayorMenor =
                new ArrayList<>(menorMayor);

        Collections.reverse(mayorMenor);

        System.out.println("\nMayor a menor:");
        System.out.println(mayorMenor);

        ArrayList<Integer> pares =
                obtenerPares(numeros);

        ArrayList<Integer> impares =
                obtenerImpares(numeros);

        System.out.println("\nNúmeros pares:");
        System.out.println(pares);

        System.out.println("\nNúmeros impares:");
        System.out.println(impares);
    }
}
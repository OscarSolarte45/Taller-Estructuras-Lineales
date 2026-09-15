package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio07Ordenado {

    public static ArrayList<Integer> generarPares() {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numeros.add((i + 1) * 2);
        }

        return numeros;
    }

    public static void insertarOrdenado(
            ArrayList<Integer> numeros, int valor) {

        int posicion = 0;

        while (posicion < numeros.size()
                && numeros.get(posicion) < valor) {

            posicion++;
        }

        numeros.add(posicion, valor);
    }

    public static void eliminarValor(
            ArrayList<Integer> numeros, int valor) {

        if (numeros.contains(valor)) {
            numeros.remove(Integer.valueOf(valor));
            System.out.println("Valor eliminado correctamente.");
        } else {
            System.out.println(
                    "El valor no se encuentra en la lista.");
        }
    }

    public static void imprimirLista(ArrayList<Integer> numeros) {
        System.out.println(numeros);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numeros = generarPares();

        System.out.println("ArrayList inicial:");
        imprimirLista(numeros);

        System.out.print("Ingrese un número para insertar: ");
        int valorInsertar = scanner.nextInt();

        insertarOrdenado(numeros, valorInsertar);

        System.out.println("\nArrayList después de insertar:");
        imprimirLista(numeros);

        System.out.print("\nIngrese un número para eliminar: ");
        int valorEliminar = scanner.nextInt();

        eliminarValor(numeros, valorEliminar);

        System.out.println("\nArrayList después de eliminar:");
        imprimirLista(numeros);

        scanner.close();
    }
}
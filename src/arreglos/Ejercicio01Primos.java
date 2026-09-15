package arreglos;

public class Ejercicio01Primos {

    public static void imprimirArreglo(int[] numeros) {
        System.out.println("Primeros 10 números primos:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] primos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        imprimirArreglo(primos);
    }
}
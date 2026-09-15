package arreglos;

import java.util.Random;

public class Ejercicio05InvertirNumeros {

    public static int[] generarNumeros() {

        int[] numeros = new int[20];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(1000);
        }

        return numeros;
    }

    public static int invertirNumero(int numero) {

        int invertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }

        return invertido;
    }

    public static int[] generarInvertidos(int[] numeros) {

        int[] invertidos = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            invertidos[i] = invertirNumero(numeros[i]);
        }

        return invertidos;
    }

    public static void imprimirArreglo(String mensaje, int[] numeros) {

        System.out.println(mensaje);

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] numeros = generarNumeros();
        int[] invertidos = generarInvertidos(numeros);

        imprimirArreglo("Números originales:", numeros);
        imprimirArreglo("Números invertidos:", invertidos);
    }
}
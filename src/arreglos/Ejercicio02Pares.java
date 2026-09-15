package arreglos;

public class Ejercicio02Pares {

    public static int[] generarPares() {

        int[] pares = new int[100];

        for (int i = 0; i < pares.length; i++) {
            pares[i] = i * 2;
        }

        return pares;
    }

    public static void imprimirUnaLinea(int[] numeros) {

        System.out.println("100 primeros números pares:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println();
    }

    public static void imprimirDiezLineas(int[] numeros) {

        System.out.println("\nNúmeros organizados en 10 líneas:");

        for (int i = 0; i < numeros.length; i++) {

            if (i % 10 == 0) {
                System.out.print("Línea " + ((i / 10) + 1) + ": ");
            }

            System.out.print(numeros[i] + " ");

            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        int[] pares = generarPares();

        imprimirUnaLinea(pares);
        imprimirDiezLineas(pares);
    }
}
package main;

/**
 * @author nagredo
 * @project OpenBootcamp
 * @class Main
 */
public class Main {

    public static void main(String[] args) {
        sumar(1, 2, 3);

        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println(miCoche.numeroPuertas);
    }

    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }
}

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

        int numeroIf = 0;

        if (numeroIf == 0) {
            System.out.println("numeroIf igual a 0");
        }

        if (numeroIf > 0) {
            System.out.println("numeroIf mayor a 0");
        }

        if (numeroIf < 0) {
            System.out.println("numeroIf menor a 0");
        }

        int numeroWhile = 2;

        while (numeroWhile <= 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile <= 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        int estacion = 0;
        switch (estacion){
            case 1:
                System.out.println("Primavera");
            case 2:
                System.out.println("Otoño");
            case 3:
                System.out.println("Invierno");
            case 4:
                System.out.println("Verano");
            default:
                System.out.println("No es una estacion");
        }
    }

    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }
}

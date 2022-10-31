package com.EjerciciosTema4;

public class Main {
    public static void main(String[] args) {

        int numeroIf = 2;
        if (numeroIf > 0) {
            System.out.println("el numero "+numeroIf+", es positivo.");
        } else if (numeroIf < 0) {
            System.out.println("el numero "+numeroIf+" ,es negativo.");
        } else {
            System.out.println("el numero "+numeroIf+" ,es un cero.");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile ++;
            System.out.println(numeroWhile);
        }

        do {
            numeroWhile ++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        var estacion = "primavera";
        switch (estacion) {
            case "otoño":
                System.out.println("Estamos en primavera");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            default:
                System.out.println("No pertenece a una estacion del año.");

        }
    }
}
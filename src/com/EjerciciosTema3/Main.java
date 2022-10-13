package com.EjerciciosTema3;
public class Main {
    public static void main(String[] args) {

        sumar(14, 9, 2);

        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
        System.out.println(miCoche.puertas);
    }

    public static void sumar(int x, int y, int z) {
        int resultado = x + y + z;
        System.out.println(resultado);
    }
}
class Coche {
    public int puertas = 3;

    public void agregarPuerta() {
        this.puertas++;
    }
}
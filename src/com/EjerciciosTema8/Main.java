package com.EjerciciosTema8;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(27);
        System.out.println("La edad de la persona UNO es: "+persona1.getEdad());
        persona1.setNombre("Oscar");
        System.out.println("El nombre de la persona UNO es: "+persona1.getNombre());
        persona1.setTelefono(4770006);
        System.out.println("El telefono de la persona UNO es: "+persona1.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad( int edadPersona) {
        this.edad = edadPersona;
    }
    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombrePersona) {
        this.nombre = nombrePersona;
    }
    public String getNombre() {
        return nombre;
    }
    public void setTelefono(int telefonoPersona) {
        this.telefono = telefonoPersona;
    }
    public int getTelefono() {
        return telefono;
    }
}

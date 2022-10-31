package com.EjerciciosTema9;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setEdad(34);
        System.out.println("Edad del cliente es: "+cliente.getEdad());
        cliente.setNombre("Jose");
        System.out.println("Nombre del cliente: "+cliente.getNombre());
        cliente.setTelefono(134432456);
        System.out.println("Telefono del cliente: "+cliente.getTelefono());
        cliente.setCredito(2000);
        System.out.println("Credito disponible del cliente: "+cliente.getCredito());

        Trabajador trabajador = new Trabajador();

        trabajador.setEdad(22);
        System.out.println("Edad del trabajdor es: "+trabajador.getEdad());
        trabajador.setNombre("Luis");
        System.out.println("Nombre del trabajador es: "+trabajador.getNombre());
        trabajador.setTelefono(134543678);
        System.out.println("Telefono del trabajador es: "+trabajador.getTelefono());
        trabajador.setSalario(14000);
        System.out.println("Salario del trabajador es: "+trabajador.getSalario());
    }
}
class Persona {
    int edad;
    String nombre;
    int telefono;

    public Persona() {}

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    private int credito;

    public Cliente() {}

    public int getCredito() {
        return credito;
    }
    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private int salario;

    public Trabajador() {}

    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
}
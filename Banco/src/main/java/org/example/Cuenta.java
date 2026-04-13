package org.example;

public class Cuenta {
    String nombre;
    String direccion;
    String tipoCuenta;
    double saldo;

    public Cuenta(String nombre, String direccion, String tipoCuenta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0; 
    }
}

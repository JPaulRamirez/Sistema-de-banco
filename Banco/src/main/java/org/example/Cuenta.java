package org.example;

public class Cuenta {
    public String nombre;
    public String direccion;
    public String tipoCuenta;
    public double saldo;

    public Cuenta(String nombre, String direccion, String tipoCuenta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0;
    }

    public void depositar(double monto) {
        this.saldo += monto;
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Se  te despositaron: "+monto);
    }

    public void transferir(Cuenta cuentaDestino, double monto) {
        if (this.saldo >= monto)
        {
            this.saldo -= monto;
            cuentaDestino.depositar(monto);
            System.out.println("Transferencia realizada");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void mostrar() {
        System.out.println("Nombre: " + this.nombre);
        //System.out.println("Direccion: " + this.direccion);
        //System.out.println("Tipo de cuenta: " + this.tipoCuenta);
        System.out.println("Saldo: $" + this.saldo);
        System.out.println("----------------------");
    }
}

package org.example;
import java.util.List;
import java.util.ArrayList;

public class Banco {
    List<Cuenta> cuentas = new ArrayList<>();

    public void crearCuentas()
    {
        cuentas.add(new Cuenta("Paul","Calle falsa 123","Ahorro",1));
        cuentas.add(new Cuenta("Leonel","Calle falsa 444","Ahorro",2));
        cuentas.add(new Cuenta("Ariana","Calle falsa 233","Corriente",3));
        System.out.println("----------- Cuentas creadas -----------");
    }
    public void modificarCuenta(int dni, String nombre, String nuevaDireccion) {
        Cuenta cuenta = buscarPorDni(dni);

        if (cuenta != null) {
            cuenta.nombre = nombre;
            cuenta.direccion = nuevaDireccion;
            System.out.println("----------- Cuenta modificada -----------");
        } else {
            System.out.println("Cuenta no encontrada");
        }
    }

    public void mostrarBalance() {
        System.out.println("----- BALANCE GENERAL ----- ");
        for (Cuenta cuenta : cuentas) {
            cuenta.mostrar();
        }
    }
    public void transferir(int dniOrigen, int dniDestino, double monto) {

        if (dniOrigen == dniDestino) {
            System.out.println("No podés transferirte a la misma cuenta");
            return;
        }
        Cuenta origen = buscarPorDni(dniOrigen);
        Cuenta destino = buscarPorDni(dniDestino);

        if (origen == null || destino == null) {
            System.out.println("Cuenta no encontrada");
            return;
        }

        origen.transferirCuenta(destino, monto);
    }
    public void depositar(int dni, double monto) {
        Cuenta cuenta = buscarPorDni(dni);

        if (cuenta != null) {
            cuenta.depositar(monto);
        } else {
            System.out.println("Cuenta no encontrada");
        }
    }
    public Cuenta buscarPorDni(int dni) {
        for (Cuenta c : cuentas) {
            if (c.dni == dni) {
                return c;
            }
        }
        return null;
    }
}

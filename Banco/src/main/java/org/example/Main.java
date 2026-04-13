package org.example;

public class Main {
    static void main() {

        var banco = new Banco();

        banco.crearCuentas();

        banco.cuenta1.depositar(20);

        banco.cuenta2.depositar(20);
        banco.mostrarBalance();
        banco.cuenta1.transferir(banco.cuenta2,10);

        banco.mostrarBalance();




    }
}

package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var cuenta1 = new Cuenta("Paul","Calle falsa 123","Ahorro");
        var cuenta2 = new Cuenta("Leonel","Calle falsa 444","Corriente");
        var cuenta3 = new Cuenta("Ariana","Calle falsa 233","Ahorro");
        cuenta1.mostrar();
        cuenta2.mostrar();
        cuenta1.depositar(20);
        cuenta2.depositar(20);

        cuenta1.mostrar();
        cuenta2.mostrar();

        cuenta1.transferir(cuenta2,10);

        cuenta1.mostrar();
        cuenta2.mostrar();



    }
}

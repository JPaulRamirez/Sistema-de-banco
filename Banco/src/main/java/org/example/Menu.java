package org.example;
import java.util.Scanner;

public class Menu {
    private Banco banco;
    private Scanner sc;

    public Menu() {
        banco = new Banco();
        sc = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion = 0;

        while (opcion != 6) {

            System.out.println("\n=== MENU BANCO ===");
            System.out.println("1. Crear cuentas");
            System.out.println("2. Depositar");
            System.out.println("3. Transferir");
            System.out.println("4. Modificar cuenta");
            System.out.println("5. Mostrar balance");
            System.out.println("6. Salir");
            System.out.print("Elegir opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    banco.crearCuentas();
                    break;
                case 2:
                    banco.cuenta1.depositar(1000);
                    banco.cuenta2.depositar(500);
                    banco.cuenta3.depositar(2000);
                    break;
                case 3:
                    banco.cuenta1.transferir(banco.cuenta2, 1000);
                    break;
                case 4:
                    banco.modificarCuenta(banco.cuenta2, "Juan", "Calle real 234");
                    break;
                case 5:
                    banco.mostrarBalance();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
            }
        }
        sc.close();
    }
}

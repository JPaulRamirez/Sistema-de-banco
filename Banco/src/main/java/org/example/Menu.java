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
                    System.out.print("Ingrese DNI: ");
                    int dni = sc.nextInt();

                    System.out.print("Monto: ");
                    double monto = sc.nextDouble();

                    banco.depositar(dni, monto);
                    break;

                case 3:
                    System.out.print("DNI origen: ");
                    int dniOrigen = sc.nextInt();

                    System.out.print("DNI destino: ");
                    int dniDestino = sc.nextInt();

                    System.out.print("Monto: ");
                    double montoTrans = sc.nextDouble();

                    banco.transferir(dniOrigen, dniDestino, montoTrans);
                    break;

                case 4:
                    System.out.print("Ingrese DNI: ");
                    int dniMod = sc.nextInt();
                    sc.nextLine(); // limpiar buffer

                    System.out.print("Nuevo nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Nueva direccion: ");
                    String direccion = sc.nextLine();

                    banco.modificarCuenta(dniMod, nombre, direccion);
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

package org.example;
import org.example.Modelo.Admin;
import org.example.Modelo.Cuenta;
import java.util.ArrayList;
import java.util.List;

public class Surcusal {
    private String nombre;
    private Admin admin;
    private List<Cuenta> cuentas;

    // Constructor
    public Sucursal(String nombre, Admin admin) {
        this.nombre = nombre;
        this.admin = admin;
        this.cuentas = new ArrayList<>();
    }

    public boolean loginAdmin(String username,String pass)
    {
        if(admin.login(username,pass))
        {
            System.out.println("Login exitoso");
            return true;
        }else {
            System.out.println("Credenciales incorrectas");
            return false;
        }

    }
}

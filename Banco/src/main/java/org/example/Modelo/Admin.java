package org.example.Modelo;

import org.example.Rol;

public class Admin extends Usuario {

    private String correo;
    private String username;
    private String password;

    // Constructor
    public Admin(String nombre, int dni, Rol rol , String correo, String username, String password) {
        super(nombre, dni,rol);
        this.correo = correo;
        this.username = username;
        this.password = password;
    }

    public boolean login(String user, String pass) {
        return this.username.equals(user) && this.password.equals(pass);
    }

    public void mostrarAdmin() {
        mostrarDatos();
        System.out.println("Correo: " + this.correo);
        System.out.println("Username: " + this.username);
    }

    public String getCorreo() {
        return correo;
    }

    public String getUsername() {
        return username;
    }

}

package org.example.Modelo;

import org.example.enums.Rol;

public class Usuario {

    public String nombre;
    public int dni;
    public Rol rol;

    public Usuario(String nombre, int dni, Rol rol)
    {
        this.nombre=nombre;
        this.dni = dni ;
        this.rol =rol;
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
    }

}

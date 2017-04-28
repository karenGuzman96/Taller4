package com.karen.taller4;

public class usuario extends factura {
    protected static String Nombre;
    protected String Apellido;
    protected int Edad;

    public usuario() {
    }
    public void datosUsuario(){
    }

    public void setNombre(String nombre) {

        this.Nombre = nombre;
    }

    public String getApellido() {

        return Apellido;
    }

    public void setApellido(String apellido) {

        this.Apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {

        this.Edad = edad;
    }

    //public abstract void datosUsuario();
}



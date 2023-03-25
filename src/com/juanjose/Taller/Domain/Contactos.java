package com.juanjose.Taller.Domain;

public class Contactos {
    private long numerodecelular;
    private String nombre;

    public Contactos(long numerodecelular, String nombre) {
        this.numerodecelular = numerodecelular;
        this.nombre = nombre;
    }

    public long getNumerodecelular() {
        return numerodecelular;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNumerodecelular(long numerodecelular) {
        this.numerodecelular = numerodecelular;
    }
}

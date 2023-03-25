package com.juanjose.Taller.Domain;

public class Snacks {
    private long codigo;
    private String nombre;
    private int unidades;

    public Snacks(long codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidades() {
        return unidades;
    }

    public void Aumentarunidad() {
        this.unidades = unidades+1;
    }
    public void Disminuirunidad(){
        this.unidades=unidades-1;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
}

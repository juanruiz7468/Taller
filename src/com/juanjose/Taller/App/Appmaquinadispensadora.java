package com.juanjose.Taller.App;

import com.juanjose.Taller.Domain.Maquinadispensadora;

public class Appmaquinadispensadora {
    public static void main(String[] args) {
        Maquinadispensadora v = new Maquinadispensadora();
        v.Agregarsnacks("Doritos", 1);
        v.Agregarsnacks("Cheesetrees", 2);
        v.Snackquequedan();
        v.Aumentarunidades(2,5);
        v.Snackquequedan();
        v.Ordenarsnacksmayoramenor();
    }
}

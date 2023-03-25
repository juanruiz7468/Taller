package com.juanjose.Taller.App;
import com.juanjose.Taller.Domain.Agendatelefonica;
import com.juanjose.Taller.Domain.Agendatelefonica;
import com.juanjose.Taller.Domain.Contactos;

public class Appagendatelefonica {
    public static void main(String[] args) {
        Agendatelefonica t = new Agendatelefonica();
        t.Crearcontacto("juan jose", 6005057);
        t.getContactos().forEach(Contactos->{
            System.out.println(Contactos.getNombre());
        });

    }


}
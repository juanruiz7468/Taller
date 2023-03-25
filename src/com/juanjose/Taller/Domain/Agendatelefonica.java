package com.juanjose.Taller.Domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class Agendatelefonica {
    public static final byte CAPACIDAD=50;
   private  List<Contactos> contactos;

    public  List<Contactos> getContactos() {
        return contactos;
    }

    public Agendatelefonica(){
       this.contactos=new ArrayList<>();
   }

    public Contactos Buscarcontactopornombre(String nombredecontacto) {
        Contactos contactosretornara = null;
        for (Contactos contacto : this.contactos) {
            if (contacto.getNombre() == nombredecontacto) {
                contactosretornara = contacto;
                break;
            }
        }
        return contactosretornara;


    }
    public  void Crearcontacto(String nombredecontacto, long numero){
        if (Buscarcontactopornombre(nombredecontacto)==null && Buscarcontactopornumero(numero)==null && this.contactos.size()<=CAPACIDAD){
            Contactos contactoañadir= new Contactos(numero,nombredecontacto);
            this.contactos.add(contactoañadir);
            System.out.println("ya se creao el contacto");
        }
        else{
            System.out.println("No se pudo crear el contacto por que ya existe");
        }
    }
    public void eliminarcontacto(String nombredecontacto, long numero){
        Contactos contacto= Buscarcontactopornombre(nombredecontacto);
        if(Buscarcontactopornombre(nombredecontacto)!=null && Buscarcontactopornumero(numero)==null){
            this.contactos.remove(contacto);
        }
        else{
            System.out.println("la tienda no existe todavia");
        }
    }
    public Contactos Buscarcontactopornumero(long numero){
        Contactos contactosretornara=null;
        for (Contactos contacto:this.contactos){
            if(contacto.getNumerodecelular()==numero){
                contactosretornara=contacto;
                break;
            }
        }
        return contactosretornara;
    }
    public void Cambiarelcelular(int numero){
        Contactos contacto=Buscarcontactopornumero(numero);
        contacto.setNumerodecelular(numero);
    }
    public void Ordenarcontactos(){
        this.contactos.sort(Comparator.comparing(Contactos::getNombre));
    }
}

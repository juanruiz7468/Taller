package com.juanjose.Taller.Domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Maquinadispensadora {
    public static final byte CAPACIDAD=12;
    private List<Snacks> snacks;

    public Maquinadispensadora(){
        this.snacks=new ArrayList<>();
    }

    public List<Snacks> getSnacks() {
        return snacks;
    }
    public Snacks Snackspornombre (String nombredesnack) {
        Snacks snacksretornara = null;
        for (Snacks snack : snacks) {
            if (snack.getNombre() == nombredesnack) {
                snacksretornara = snack;
                break;
            }
        }
        return snacksretornara;

    }
    public Snacks Snacksporcodigo(long codigosnack){
        Snacks snacksretornara=null;
        for(Snacks snack:snacks){
            if(snack.getCodigo()==codigosnack){
                snacksretornara=snack;
                break;
            }
        }
        return snacksretornara;
    }
    public void Agregarsnacks(String nombredesnack,long codigosnack){
        if (Snackspornombre(nombredesnack)==null && Snacksporcodigo(codigosnack)==null&&this.snacks.size()<=CAPACIDAD){
            Snacks snackañadir=new Snacks(codigosnack,nombredesnack);
            snackañadir.Aumentarunidad();
            this.snacks.add(snackañadir);
            System.out.println("Se añadio exitosamente el snack");
        }
        else{
            System.out.println("No se pudo añadir el snack por que ya esta");
        }

    }
    public void Sacarunidades(String nombredesnack){
        if (Snackspornombre(nombredesnack)!=null){
            Snackspornombre(nombredesnack).Disminuirunidad();
            System.out.println("Se saco exitosamente un snack");
        }
        else{
            System.out.println("No se encontro el snack");
        }
    }
    public void Aumentarunidades(long codigosnack, int numerodeunidades){
        if (Snacksporcodigo(codigosnack)!=null&&Snacksporcodigo(codigosnack).getUnidades()+numerodeunidades<=6 ){
            int numerodeunidadesnueva = Snacksporcodigo(codigosnack).getUnidades() + numerodeunidades;
            Snacksporcodigo(codigosnack).setUnidades(numerodeunidadesnueva);
            System.out.println("Se cambio exitosamente las unidades");

        }
        else{
            System.out.println("No se encontro el snack o las unidades indicadas superan las maximas que son 6");
        }
    }
    public void Sacarsnack(String nombredesnack){
        Snacks snack=Snackspornombre(nombredesnack);
        if (Snackspornombre(nombredesnack)!=null){
            this.snacks.remove(snack);
            System.out.println("Se elimino correctamente");
        }
        else{
            System.out.println("No se encontro el snack");
        }
    }
    public void Unidadesrestantes(String nombredesnack){
        Snacks snack=Snackspornombre(nombredesnack);
        if(snack!=null){
            System.out.println("las unidades restantes son:"+snack.getUnidades());
        }
        else{
            System.out.println("No se encontro el snack que se busca");
        }
    }
    public void Snacksagotados(){
        for(Snacks snack:snacks){
            if (snack.getUnidades()==0){
                System.out.println("el snack"+snack.getNombre()+"se encuentra agotado");
            }
        }

    }
    public void Snackquequedan(){
        for(Snacks snack:snacks){
            System.out.println("el snack"+snack.getNombre()+"tiene"+snack.getUnidades()+"unidades");
        }
    }
    public void Ordenarsnacksmayoramenor(){
        this.snacks.sort(Comparator.comparing(Snacks::getUnidades));
    }
    public void Ordenarsnacksmenoramayor(){
        this.snacks.sort(Comparator.comparing(Snacks::getUnidades).reversed());
    }
}

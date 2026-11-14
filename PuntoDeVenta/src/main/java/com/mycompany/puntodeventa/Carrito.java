package com.mycompany.puntodeventa;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    //Atributos
    List<ItemCarrito> items;


    //Constructor
    public Carrito() {
        this.items = new ArrayList<>();
    }

    //Metodos
    public void agregarItem(){
    }

    public void quitarItem(){
    }

    public void calcularTotal(){
    }

    public void vaciarCarrito(){
    }

    public void estaVacio(){
    }

    //Getters y Setters
    public List<ItemCarrito> getItems(){
        return items;
    }

    public void setItems(List<ItemCarrito> items){
        this.items = items;
    }
}
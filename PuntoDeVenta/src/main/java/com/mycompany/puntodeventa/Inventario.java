package com.mycompany.puntodeventa;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    //Atributos
    protected List<Producto> productos;

    //Constructor
     public Inventario() {
        this.productos = new ArrayList<>();
    }

    //Metodos
    public void agregarProducto(){
    }

    public void listarProductos(){
    }

    public Producto buscarProducto(){
        return null; //Cambiar al hacer el metodo
    }

    public boolean descontarExistencias(){
        return true; //Cambiar al hacer el metodo
    }

    public void eliminarProducto(){
    }
}

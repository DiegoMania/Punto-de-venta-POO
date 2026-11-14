package com.mycompany.puntodeventa;

public class ItemCarrito {
    //Atributos
    protected Producto producto;
    protected int cantidad;

    //Constructor
    public ItemCarrito(Producto producto, int cantidad){
        this.producto=producto;
        this.cantidad=cantidad;
    }

    //Metodos
    public double calcularSubtotal(){
        return 0.0; //borrar retorno hal hacer el metodo
    }

    //getters / setters
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

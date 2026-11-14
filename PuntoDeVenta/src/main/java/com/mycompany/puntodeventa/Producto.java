package com.mycompany.puntodeventa;

public class Producto {
    //Atributos
    protected int id;
    protected String nombre;
    protected double precio;
    protected int existencias;
    protected String descripcion;
    protected String categoria;
    protected String caracteristicas;
    protected String rutaImagen;

    //Constructor
    public Producto(int id, String nombre, double precio, int existencias, String descripcion, String categoria, String caracteristicas, String rutaImagen){
        this.id=id;
        this.nombre=nombre;
        this.precio=precio;
        this.existencias=existencias;
        this.descripcion=descripcion;
        this.categoria=categoria;
        this.caracteristicas=caracteristicas;
        this.rutaImagen=rutaImagen;
    }

    //Metodos
    public boolean hayStock(){
        return true;
    }

    //Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String getCaracteristicas() {
        return caracteristicas;
    }
    
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
}

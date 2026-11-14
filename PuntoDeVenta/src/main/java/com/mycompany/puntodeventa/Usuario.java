package com.mycompany.puntodeventa;

public abstract class Usuario{
    //Atributos
    protected String nombre;
    protected String contraseña;
    protected String correo;
    protected String telefono;
    protected int id;

    //Constructor 
    public Usuario(String nombre,String contraseña, String correo, String telefono, int id){
         this.nombre = nombre;
         this.contraseña = contraseña;
         this.correo = correo;
         this.telefono = telefono;
         this.id = id;
    }
    
    //Metodos
    public void registro(){
    }
    
    public void inicioSesion(){
    }

    public void cerrarSesion(){
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }
    
}

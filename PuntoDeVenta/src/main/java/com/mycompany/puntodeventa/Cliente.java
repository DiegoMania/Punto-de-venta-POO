
package com.mycompany.puntodeventa;

public class Cliente extends Usuario{

    //Atributos
    protected String carrito;
    protected String direccion;

    //Constructor
   public Cliente(String nombre,String contraseña, String correo, String telefono, int id, String carrito, String direccion){
        super(nombre, contraseña, correo, telefono, id);
        this.carrito=carrito;
        this.direccion=direccion;
    }


    //Metodos

    public void agregarCarrito(){
    }

    public void verCarrito(){
    }

    public void pagar(){
    }

    public void quitarDelCarrito(){
    }

}

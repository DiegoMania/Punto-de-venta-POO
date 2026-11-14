package com.mycompany.puntodeventa;

public class PagoPaypal extends Pago{

    //Atributos
    protected String correo;
    protected String contraseña;

    //Constructor
     public PagoPaypal(Cliente cliente, double monto, String fecha, String correo, String contraseña){
        super(cliente, monto, fecha);

        this.correo=correo;
        this.contraseña=contraseña;
     }

    //Metodos
    public boolean validarPaypal(){
        return true;
    }
    
    public void realizarPago(){
    }
}

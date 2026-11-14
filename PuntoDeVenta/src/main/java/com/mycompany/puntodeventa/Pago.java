package com.mycompany.puntodeventa;

public abstract class Pago {

    //Atributos
    protected Cliente cliente;
    protected double monto;
    protected String fecha;

    //Constructor
    public Pago(Cliente cliente, double monto, String fecha){
        this.cliente=cliente;
        this.monto=monto;
        this.fecha=fecha;
    }

    //Metodos
    public abstract void realizarPago();

    public void ticket(){
    }
    
}

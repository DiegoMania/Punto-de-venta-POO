package com.mycompany.puntodeventa;

public class PagoTarjeta extends Pago{

    //Atributos
    protected String numeroTarjeta;
    protected String cvv;
    protected String titular;
    protected String vencimiento;


    //Constructor
      public PagoTarjeta(Cliente cliente, double monto, String fecha, String numeroTarjeta, String cvv, String titular, String vencimiento){
        super(cliente, monto, fecha);

        this.numeroTarjeta=numeroTarjeta;
        this.cvv=cvv;
        this.titular=titular;
        this.vencimiento=vencimiento;
      }

    //Metodos

    public boolean validarTarjeta(){
        return true;
    }

    public void realizarPago(){
    }
    
}

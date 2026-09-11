package com.example;

/*import com.example.o.PagoPSE;
import com.example.o.Ejecucion;
import com.example.o.PagoTarjeta;*/
import com.example.l.Cuenta;
import com.example.l.CuentaAhorros;

public class Main{
    public static void main (String[]args){

        //operacion.calcularTotal(factura);*/

        //Ejecucion ejecucion = new Ejecucion();
        //ejecucion.procesarCobro(new PagoPSE(), 120000);

        //ejecucion.procesarCobro(new PagoTarjeta(),98000);

        Cuenta cuenta = new CuentaAhorros(10000000);
        double restante = cuenta.retirarSaldo(4500000);
        System.out.println("Me quedo en la cuenta de ahorros: " + restante);
    }
}
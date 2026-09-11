package com.example.o;

public class PagoPSE implements MedioPago {

    @Override
    public void cobrar(double monto) {
        System.out.println("Procesando pago con PSE del monto : $ " + monto);
    }
}
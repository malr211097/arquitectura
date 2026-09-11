package com.example.s;

public class Factura {
    private String razonSocial;
    private String identificacion;
    private String direccion;
    private int impuesto;
    private double subtotal;

    public Factura(String razonSocial, String identificacion, String direccion, int impuesto, double subtotal) {
        this.razonSocial = razonSocial;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.impuesto = impuesto;
        this.subtotal = subtotal;
    }

    //geters and setters for the attributes can be added here if needed
    public String getRazonSocial() {
        return razonSocial;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public double getSubtotal() {
        return subtotal;
    }
}
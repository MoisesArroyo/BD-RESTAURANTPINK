/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emp.mx.entity;

import java.sql.Date;

/**
 *
 * @author Moise
 */
public class Pedidos {
    private int PEDIDO_ID;
    private int NUM_MESA;
    private Date PEDIDO_FECHA;
    private int PEDIDO_EMPLEADO;
    private int PEDIDO_METODO_PAGO;
    private int PEDIDO_CLIENTE;

    @Override
    public String toString() {
        return "Pedidos{" + "PEDIDO_ID=" + PEDIDO_ID + ", NUM_MESA=" + NUM_MESA + ", PEDIDO_FECHA=" + PEDIDO_FECHA + ", PEDIDO_EMPLEADO=" + PEDIDO_EMPLEADO + ", PEDIDO_METODO_PAGO=" + PEDIDO_METODO_PAGO + ", PEDIDO_CLIENTE=" + PEDIDO_CLIENTE + '}';
    }

    public void setPEDIDO_ID(int PEDIDO_ID) {
        this.PEDIDO_ID = PEDIDO_ID;
    }

    public void setNUM_MESA(int NUM_MESA) {
        this.NUM_MESA = NUM_MESA;
    }

    public void setPEDIDO_FECHA(Date PEDIDO_FECHA) {
        this.PEDIDO_FECHA = PEDIDO_FECHA;
    }

    public void setPEDIDO_EMPLEADO(int PEDIDO_EMPLEADO) {
        this.PEDIDO_EMPLEADO = PEDIDO_EMPLEADO;
    }

    public void setPEDIDO_METODO_PAGO(int PEDIDO_METODO_PAGO) {
        this.PEDIDO_METODO_PAGO = PEDIDO_METODO_PAGO;
    }

    public void setPEDIDO_CLIENTE(int PEDIDO_CLIENTE) {
        this.PEDIDO_CLIENTE = PEDIDO_CLIENTE;
    }

    public int getPEDIDO_ID() {
        return PEDIDO_ID;
    }

    public int getNUM_MESA() {
        return NUM_MESA;
    }

    public Date getPEDIDO_FECHA() {
        return PEDIDO_FECHA;
    }

    public int getPEDIDO_EMPLEADO() {
        return PEDIDO_EMPLEADO;
    }

    public int getPEDIDO_METODO_PAGO() {
        return PEDIDO_METODO_PAGO;
    }

    public int getPEDIDO_CLIENTE() {
        return PEDIDO_CLIENTE;
    }

    public Pedidos(int PEDIDO_ID, int NUM_MESA, Date PEDIDO_FECHA, int PEDIDO_EMPLEADO, int PEDIDO_METODO_PAGO, int PEDIDO_CLIENTE) {
        this.PEDIDO_ID = PEDIDO_ID;
        this.NUM_MESA = NUM_MESA;
        this.PEDIDO_FECHA = PEDIDO_FECHA;
        this.PEDIDO_EMPLEADO = PEDIDO_EMPLEADO;
        this.PEDIDO_METODO_PAGO = PEDIDO_METODO_PAGO;
        this.PEDIDO_CLIENTE = PEDIDO_CLIENTE;
    }

    public Pedidos() {
    }
}


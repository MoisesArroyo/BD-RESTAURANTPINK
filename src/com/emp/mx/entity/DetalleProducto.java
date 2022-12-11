/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emp.mx.entity;

/**
 *
 * @author Moise
 */
public class DetalleProducto {

    public DetalleProducto() {
    }

    public DetalleProducto(int DETA_PRODUCTO_ID, int DETA_INGREDIENTE_ID, int PORCION) {
        this.DETA_PRODUCTO_ID = DETA_PRODUCTO_ID;
        this.DETA_INGREDIENTE_ID = DETA_INGREDIENTE_ID;
        this.PORCION = PORCION;
    }

    public int getDETA_PRODUCTO_ID() {
        return DETA_PRODUCTO_ID;
    }

    public int getDETA_INGREDIENTE_ID() {
        return DETA_INGREDIENTE_ID;
    }

    public int getPORCION() {
        return PORCION;
    }

    public void setDETA_PRODUCTO_ID(int DETA_PRODUCTO_ID) {
        this.DETA_PRODUCTO_ID = DETA_PRODUCTO_ID;
    }

    public void setDETA_INGREDIENTE_ID(int DETA_INGREDIENTE_ID) {
        this.DETA_INGREDIENTE_ID = DETA_INGREDIENTE_ID;
    }

    public void setPORCION(int PORCION) {
        this.PORCION = PORCION;
    }

    @Override
    public String toString() {
        return "DetalleProducto{" + "DETA_PRODUCTO_ID=" + DETA_PRODUCTO_ID + ", DETA_INGREDIENTE_ID=" + DETA_INGREDIENTE_ID + ", PORCION=" + PORCION + '}';
    }
    private int DETA_PRODUCTO_ID;
    private int DETA_INGREDIENTE_ID;
    private int PORCION;
}

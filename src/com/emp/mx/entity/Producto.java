/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emp.mx.entity;

/**
 *
 * @author Moise
 */
public class Producto {

    public Producto() {
    }

    public Producto(int ID_PRODUCTO, String NAME_PRODUCTO, String DETALLES_PRODUCTO, String TIPO_PRODUCTO, int COSTO_PRODUCTO) {
        this.ID_PRODUCTO = ID_PRODUCTO;
        this.NAME_PRODUCTO = NAME_PRODUCTO;
        this.DETALLES_PRODUCTO = DETALLES_PRODUCTO;
        this.TIPO_PRODUCTO = TIPO_PRODUCTO;
        this.COSTO_PRODUCTO = COSTO_PRODUCTO;
    }

    public int getID_PRODUCTO() {
        return ID_PRODUCTO;
    }

    public String getNAME_PRODUCTO() {
        return NAME_PRODUCTO;
    }

    public String getDETALLES_PRODUCTO() {
        return DETALLES_PRODUCTO;
    }

    public String getTIPO_PRODUCTO() {
        return TIPO_PRODUCTO;
    }

    public int getCOSTO_PRODUCTO() {
        return COSTO_PRODUCTO;
    }

    public void setID_PRODUCTO(int ID_PRODUCTO) {
        this.ID_PRODUCTO = ID_PRODUCTO;
    }

    public void setNAME_PRODUCTO(String NAME_PRODUCTO) {
        this.NAME_PRODUCTO = NAME_PRODUCTO;
    }

    public void setDETALLES_PRODUCTO(String DETALLES_PRODUCTO) {
        this.DETALLES_PRODUCTO = DETALLES_PRODUCTO;
    }

    public void setTIPO_PRODUCTO(String TIPO_PRODUCTO) {
        this.TIPO_PRODUCTO = TIPO_PRODUCTO;
    }

    public void setCOSTO_PRODUCTO(int COSTO_PRODUCTO) {
        this.COSTO_PRODUCTO = COSTO_PRODUCTO;
    }

    @Override
    public String toString() {
        return "Producto{" + "ID_PRODUCTO=" + ID_PRODUCTO + ", NAME_PRODUCTO=" + NAME_PRODUCTO + ", DETALLES_PRODUCTO=" + DETALLES_PRODUCTO + ", TIPO_PRODUCTO=" + TIPO_PRODUCTO + ", COSTO_PRODUCTO=" + COSTO_PRODUCTO + '}';
    }
    private int    ID_PRODUCTO;
    private String    NAME_PRODUCTO;
    private String    DETALLES_PRODUCTO;
    private String    TIPO_PRODUCTO;
    private int    COSTO_PRODUCTO;
}

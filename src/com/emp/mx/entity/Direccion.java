/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emp.mx.entity;

/**
 *
 * @author Moise
 */
public class Direccion {

    public Direccion() {
    }

    public Direccion(int DOMICILIO_ID, String CALLE, int NUM_EXT, int NUM_INT, String COLONIA, String MUNICIPIO, int CP_DOMICILIO, int DOM_ESTADO_ID) {
        this.DOMICILIO_ID = DOMICILIO_ID;
        this.CALLE = CALLE;
        this.NUM_EXT = NUM_EXT;
        this.NUM_INT = NUM_INT;
        this.COLONIA = COLONIA;
        this.MUNICIPIO = MUNICIPIO;
        this.CP_DOMICILIO = CP_DOMICILIO;
        this.DOM_ESTADO_ID = DOM_ESTADO_ID;
    }

    public int getDOMICILIO_ID() {
        return DOMICILIO_ID;
    }

    public String getCALLE() {
        return CALLE;
    }

    public int getNUM_EXT() {
        return NUM_EXT;
    }

    public int getNUM_INT() {
        return NUM_INT;
    }

    public String getCOLONIA() {
        return COLONIA;
    }

    public String getMUNICIPIO() {
        return MUNICIPIO;
    }

    public int getCP_DOMICILIO() {
        return CP_DOMICILIO;
    }

    public int getDOM_ESTADO_ID() {
        return DOM_ESTADO_ID;
    }

    public void setDOMICILIO_ID(int DOMICILIO_ID) {
        this.DOMICILIO_ID = DOMICILIO_ID;
    }

    public void setCALLE(String CALLE) {
        this.CALLE = CALLE;
    }

    public void setNUM_EXT(int NUM_EXT) {
        this.NUM_EXT = NUM_EXT;
    }

    public void setNUM_INT(int NUM_INT) {
        this.NUM_INT = NUM_INT;
    }

    public void setCOLONIA(String COLONIA) {
        this.COLONIA = COLONIA;
    }

    public void setMUNICIPIO(String MUNICIPIO) {
        this.MUNICIPIO = MUNICIPIO;
    }

    public void setCP_DOMICILIO(int CP_DOMICILIO) {
        this.CP_DOMICILIO = CP_DOMICILIO;
    }

    public void setDOM_ESTADO_ID(int DOM_ESTADO_ID) {
        this.DOM_ESTADO_ID = DOM_ESTADO_ID;
    }

    @Override
    public String toString() {
        return "Direccion{" + "DOMICILIO_ID=" + DOMICILIO_ID + ", CALLE=" + CALLE + ", NUM_EXT=" + NUM_EXT + ", NUM_INT=" + NUM_INT + ", COLONIA=" + COLONIA + ", MUNICIPIO=" + MUNICIPIO + ", CP_DOMICILIO=" + CP_DOMICILIO + ", DOM_ESTADO_ID=" + DOM_ESTADO_ID + '}';
    }
        private int DOMICILIO_ID;
        private String CALLE;
        private int NUM_EXT;
        private int NUM_INT;
        private String COLONIA;
        private String MUNICIPIO;
        private int CP_DOMICILIO;
        private int DOM_ESTADO_ID;
}

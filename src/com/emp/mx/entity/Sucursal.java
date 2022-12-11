/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emp.mx.entity;

/**
 *
 * @author Moise
 */
public class Sucursal {
        private int SUCURSAL_ID;
        private String NAME_SUCURSAL;
        private int NUM_EXT;
        private int LADA_SUCURSAL;
        private int TEL_SUCURSAL;
        private String CORREO_SUCURSAL;
        private int SUCURSAL_HORARIO;
        private int SUCURSAL_DOMICILIO;

    @Override
    public String toString() {
        return "Sucursal{" + "SUCURSAL_ID=" + SUCURSAL_ID + ", NAME_SUCURSAL=" + NAME_SUCURSAL + ", NUM_EXT=" + NUM_EXT + ", LADA_SUCURSAL=" + LADA_SUCURSAL + ", TEL_SUCURSAL=" + TEL_SUCURSAL + ", CORREO_SUCURSAL=" + CORREO_SUCURSAL + ", SUCURSAL_HORARIO=" + SUCURSAL_HORARIO + ", SUCURSAL_DOMICILIO=" + SUCURSAL_DOMICILIO + '}';
    }

    public void setSUCURSAL_ID(int SUCURSAL_ID) {
        this.SUCURSAL_ID = SUCURSAL_ID;
    }

    public void setNAME_SUCURSAL(String NAME_SUCURSAL) {
        this.NAME_SUCURSAL = NAME_SUCURSAL;
    }

    public void setNUM_EXT(int NUM_EXT) {
        this.NUM_EXT = NUM_EXT;
    }

    public void setLADA_SUCURSAL(int LADA_SUCURSAL) {
        this.LADA_SUCURSAL = LADA_SUCURSAL;
    }

    public void setTEL_SUCURSAL(int TEL_SUCURSAL) {
        this.TEL_SUCURSAL = TEL_SUCURSAL;
    }

    public void setCORREO_SUCURSAL(String CORREO_SUCURSAL) {
        this.CORREO_SUCURSAL = CORREO_SUCURSAL;
    }

    public void setSUCURSAL_HORARIO(int SUCURSAL_HORARIO) {
        this.SUCURSAL_HORARIO = SUCURSAL_HORARIO;
    }

    public void setSUCURSAL_DOMICILIO(int SUCURSAL_DOMICILIO) {
        this.SUCURSAL_DOMICILIO = SUCURSAL_DOMICILIO;
    }

    public int getSUCURSAL_ID() {
        return SUCURSAL_ID;
    }

    public String getNAME_SUCURSAL() {
        return NAME_SUCURSAL;
    }

    public int getNUM_EXT() {
        return NUM_EXT;
    }

    public int getLADA_SUCURSAL() {
        return LADA_SUCURSAL;
    }

    public int getTEL_SUCURSAL() {
        return TEL_SUCURSAL;
    }

    public String getCORREO_SUCURSAL() {
        return CORREO_SUCURSAL;
    }

    public int getSUCURSAL_HORARIO() {
        return SUCURSAL_HORARIO;
    }

    public int getSUCURSAL_DOMICILIO() {
        return SUCURSAL_DOMICILIO;
    }

    public Sucursal(int SUCURSAL_ID, String NAME_SUCURSAL, int NUM_EXT, int LADA_SUCURSAL, int TEL_SUCURSAL, String CORREO_SUCURSAL, int SUCURSAL_HORARIO, int SUCURSAL_DOMICILIO) {
        this.SUCURSAL_ID = SUCURSAL_ID;
        this.NAME_SUCURSAL = NAME_SUCURSAL;
        this.NUM_EXT = NUM_EXT;
        this.LADA_SUCURSAL = LADA_SUCURSAL;
        this.TEL_SUCURSAL = TEL_SUCURSAL;
        this.CORREO_SUCURSAL = CORREO_SUCURSAL;
        this.SUCURSAL_HORARIO = SUCURSAL_HORARIO;
        this.SUCURSAL_DOMICILIO = SUCURSAL_DOMICILIO;
    }

    public Sucursal() {
    }
}

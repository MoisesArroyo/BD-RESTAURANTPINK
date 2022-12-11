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
public class Cliente {
        private int ID_CLIENTE;
        private String NAME_CLIENTE;
        private String APELLIDOP_CLIENTE;
        private String APELLIDOM_CLIENTE;
        private int LADA_CLIENTE;
        private int TEL_CLIENTE;
        private String CORREO_CLIENTE;
        private Date CUMPLEANIOS_CLIENTE;

    @Override
    public String toString() {
        return "Cliente{" + "ID_CLIENTE=" + ID_CLIENTE + ", NAME_CLIENTE=" + NAME_CLIENTE + ", APELLIDOP_CLIENTE=" + APELLIDOP_CLIENTE + ", APELLIDOM_CLIENTE=" + APELLIDOM_CLIENTE + ", LADA_CLIENTE=" + LADA_CLIENTE + ", TEL_CLIENTE=" + TEL_CLIENTE + ", CORREO_CLIENTE=" + CORREO_CLIENTE + ", CUMPLEANIOS_CLIENTE=" + CUMPLEANIOS_CLIENTE + '}';
    }

    public void setID_CLIENTE(int ID_CLIENTE) {
        this.ID_CLIENTE = ID_CLIENTE;
    }

    public void setNAME_CLIENTE(String NAME_CLIENTE) {
        this.NAME_CLIENTE = NAME_CLIENTE;
    }

    public void setAPELLIDOP_CLIENTE(String APELLIDOP_CLIENTE) {
        this.APELLIDOP_CLIENTE = APELLIDOP_CLIENTE;
    }

    public void setAPELLIDOM_CLIENTE(String APELLIDOM_CLIENTE) {
        this.APELLIDOM_CLIENTE = APELLIDOM_CLIENTE;
    }

    public void setLADA_CLIENTE(int LADA_CLIENTE) {
        this.LADA_CLIENTE = LADA_CLIENTE;
    }

    public void setTEL_CLIENTE(int TEL_CLIENTE) {
        this.TEL_CLIENTE = TEL_CLIENTE;
    }

    public void setCORREO_CLIENTE(String CORREO_CLIENTE) {
        this.CORREO_CLIENTE = CORREO_CLIENTE;
    }

    public void setCUMPLEANIOS_CLIENTE(Date CUMPLEANIOS_CLIENTE) {
        this.CUMPLEANIOS_CLIENTE = CUMPLEANIOS_CLIENTE;
    }

    public int getID_CLIENTE() {
        return ID_CLIENTE;
    }

    public String getNAME_CLIENTE() {
        return NAME_CLIENTE;
    }

    public String getAPELLIDOP_CLIENTE() {
        return APELLIDOP_CLIENTE;
    }

    public String getAPELLIDOM_CLIENTE() {
        return APELLIDOM_CLIENTE;
    }

    public int getLADA_CLIENTE() {
        return LADA_CLIENTE;
    }

    public int getTEL_CLIENTE() {
        return TEL_CLIENTE;
    }

    public String getCORREO_CLIENTE() {
        return CORREO_CLIENTE;
    }

    public Date getCUMPLEANIOS_CLIENTE() {
        return CUMPLEANIOS_CLIENTE;
    }

    public Cliente(int ID_CLIENTE, String NAME_CLIENTE, String APELLIDOP_CLIENTE, String APELLIDOM_CLIENTE, int LADA_CLIENTE, int TEL_CLIENTE, String CORREO_CLIENTE, Date CUMPLEANIOS_CLIENTE) {
        this.ID_CLIENTE = ID_CLIENTE;
        this.NAME_CLIENTE = NAME_CLIENTE;
        this.APELLIDOP_CLIENTE = APELLIDOP_CLIENTE;
        this.APELLIDOM_CLIENTE = APELLIDOM_CLIENTE;
        this.LADA_CLIENTE = LADA_CLIENTE;
        this.TEL_CLIENTE = TEL_CLIENTE;
        this.CORREO_CLIENTE = CORREO_CLIENTE;
        this.CUMPLEANIOS_CLIENTE = CUMPLEANIOS_CLIENTE;
    }

    public Cliente() {
    }
}

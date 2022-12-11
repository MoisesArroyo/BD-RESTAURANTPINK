package com.emp.mx.entity;

/**
 *
 * @author Moise
 */
public class empleado {
    
    private int EMPLEADO_ID;
    private String  NAME_EMPLEADO;
    private String  APELLIDOP_EMPLEADO;
    private String  APELLIDOM_EMPLEADO;
    private int    LADA_EMPLEADO;
    private int    TEL_EMPLEADO;
    private String    CORREO_EMPLEADO;
    private String    RFC_EMPLEADO;
    private String    ROL_EMPLEADO;
    private int    EMPLEADO_SUCURSAL;
    private int    EMPLEADO_DOMICILIO;

    public empleado() {
    }
    
    public empleado(int EMPLEADO_ID, String NAME_EMPLEADO, String APELLIDOP_EMPLEADO, String APELLIDOM_EMPLEADO, int LADA_EMPLEADO, int TEL_EMPLEADO, String CORREO_EMPLEADO, String RFC_EMPLEADO, String ROL_EMPLEADO, int EMPLEADO_SUCURSAL, int EMPLEADO_DOMICILIO) {
        this.EMPLEADO_ID = EMPLEADO_ID;
        this.NAME_EMPLEADO = NAME_EMPLEADO;
        this.APELLIDOP_EMPLEADO = APELLIDOP_EMPLEADO;
        this.APELLIDOM_EMPLEADO = APELLIDOM_EMPLEADO;
        this.LADA_EMPLEADO = LADA_EMPLEADO;
        this.TEL_EMPLEADO = TEL_EMPLEADO;
        this.CORREO_EMPLEADO = CORREO_EMPLEADO;
        this.RFC_EMPLEADO = RFC_EMPLEADO;
        this.ROL_EMPLEADO = ROL_EMPLEADO;
        this.EMPLEADO_SUCURSAL = EMPLEADO_SUCURSAL;
        this.EMPLEADO_DOMICILIO = EMPLEADO_DOMICILIO;
    }


    public int getEMPLEADO_ID() {
        return EMPLEADO_ID;
    }

    public String getNAME_EMPLEADO() {
        return NAME_EMPLEADO;
    }

    public String getAPELLIDOP_EMPLEADO() {
        return APELLIDOP_EMPLEADO;
    }

    public String getAPELLIDOM_EMPLEADO() {
        return APELLIDOM_EMPLEADO;
    }

    public int getLADA_EMPLEADO() {
        return LADA_EMPLEADO;
    }

    public int getTEL_EMPLEADO() {
        return TEL_EMPLEADO;
    }

    public String getCORREO_EMPLEADO() {
        return CORREO_EMPLEADO;
    }

    public String getRFC_EMPLEADO() {
        return RFC_EMPLEADO;
    }

    public String getROL_EMPLEADO() {
        return ROL_EMPLEADO;
    }

    public int getEMPLEADO_SUCURSAL() {
        return EMPLEADO_SUCURSAL;
    }

    public int getEMPLEADO_DOMICILIO() {
        return EMPLEADO_DOMICILIO;
    }

    public void setEMPLEADO_ID(int EMPLEADO_ID) {
        this.EMPLEADO_ID = EMPLEADO_ID;
    }

    public void setNAME_EMPLEADO(String NAME_EMPLEADO) {
        this.NAME_EMPLEADO = NAME_EMPLEADO;
    }

    public void setAPELLIDOP_EMPLEADO(String APELLIDOP_EMPLEADO) {
        this.APELLIDOP_EMPLEADO = APELLIDOP_EMPLEADO;
    }

    public void setAPELLIDOM_EMPLEADO(String APELLIDOM_EMPLEADO) {
        this.APELLIDOM_EMPLEADO = APELLIDOM_EMPLEADO;
    }

    public void setLADA_EMPLEADO(int LADA_EMPLEADO) {
        this.LADA_EMPLEADO = LADA_EMPLEADO;
    }

    public void setTEL_EMPLEADO(int TEL_EMPLEADO) {
        this.TEL_EMPLEADO = TEL_EMPLEADO;
    }

    public void setCORREO_EMPLEADO(String CORREO_EMPLEADO) {
        this.CORREO_EMPLEADO = CORREO_EMPLEADO;
    }

    public void setRFC_EMPLEADO(String RFC_EMPLEADO) {
        this.RFC_EMPLEADO = RFC_EMPLEADO;
    }

    public void setROL_EMPLEADO(String ROL_EMPLEADO) {
        this.ROL_EMPLEADO = ROL_EMPLEADO;
    }

    public void setEMPLEADO_SUCURSAL(int EMPLEADO_SUCURSAL) {
        this.EMPLEADO_SUCURSAL = EMPLEADO_SUCURSAL;
    }

    public void setEMPLEADO_DOMICILIO(int EMPLEADO_DOMICILIO) {
        this.EMPLEADO_DOMICILIO = EMPLEADO_DOMICILIO;
    }
    

    @Override //Sobre 
    public String toString() {
        return "empleado{" + "EMPLEADO_ID=" + EMPLEADO_ID + ", NAME_EMPLEADO=" + NAME_EMPLEADO + ", APELLIDOP_EMPLEADO=" + APELLIDOP_EMPLEADO + ", APELLIDOM_EMPLEADO=" + APELLIDOM_EMPLEADO + ", LADA_EMPLEADO=" + LADA_EMPLEADO + ", TEL_EMPLEADO=" + TEL_EMPLEADO + ", CORREO_EMPLEADO=" + CORREO_EMPLEADO + ", RFC_EMPLEADO=" + RFC_EMPLEADO + ", ROL_EMPLEADO=" + ROL_EMPLEADO + ", EMPLEADO_SUCURSAL=" + EMPLEADO_SUCURSAL + ", EMPLEADO_DOMICILIO=" + EMPLEADO_DOMICILIO + '}';
    }
    
}

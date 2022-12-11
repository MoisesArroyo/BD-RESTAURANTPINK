
package com.emp.mx.test;



import com.emp.mx.bo.SucursalBO;
import com.emp.mx.entity.Sucursal;
import java.sql.SQLException;


public class Test {
    SucursalBO ebo = new SucursalBO();
    Sucursal emp = new Sucursal();
    String mensaje = "";

    public void insertar() throws SQLException{
        emp.setSUCURSAL_ID(0);
        emp.setNAME_SUCURSAL("moi");
        emp.setNUM_EXT(22);
        emp.setLADA_SUCURSAL(22);
        emp.setTEL_SUCURSAL(33);
        emp.setCORREO_SUCURSAL("J");
        emp.setSUCURSAL_HORARIO(2);
        emp.setSUCURSAL_DOMICILIO(1);
        mensaje = ebo.modifiSuc(emp);
        System.out.println(mensaje);
    }
   
    public static void main(String[] args) throws SQLException{
        Test te = new Test();
        te.insertar();
    }
}
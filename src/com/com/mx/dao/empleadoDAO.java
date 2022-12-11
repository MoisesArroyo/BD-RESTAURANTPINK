/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.com.mx.dao;
import com.emp.mx.entity.empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Moise
 */
public class empleadoDAO {
    private String mensaje = "";
    public String agregarEmple(Connection con, empleado emp){
        PreparedStatement pst = null;
        String sql ="INSERT INTO EMPLEADO(EMPLEADO_ID," +
                    "NAME_EMPLEADO," +
                    "APELLIDOP_EMPLEADO," +
                    "APELLIDOM_EMPLEADO," +
                    "LADA_EMPLEADO," +
                    "TEL_EMPLEADO," +
                    "CORREO_EMPLEADO," +
                    "RFC_EMPLEADO," +
                    "ROL_EMPLEADO," +
                    "EMPLEADO_SUCURSAL," +
                    "EMPLEADO_DOMICILIO)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,emp.getEMPLEADO_ID());
            pst.setString(2, emp.getNAME_EMPLEADO());
            pst.setString(3,emp.getAPELLIDOP_EMPLEADO());
            pst.setString(4,emp.getAPELLIDOM_EMPLEADO());
            pst.setInt(5,emp.getLADA_EMPLEADO());
            pst.setInt(6,emp.getTEL_EMPLEADO());
            pst.setString(7,emp.getCORREO_EMPLEADO());
            pst.setString(8,emp.getRFC_EMPLEADO());
            pst.setString(9,emp.getROL_EMPLEADO());
            pst.setInt(10,emp.getEMPLEADO_SUCURSAL());
            pst.setInt(11,emp.getEMPLEADO_DOMICILIO());
            mensaje = "Guardado Correctamente";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "Guardado Incorrectamente \n "+e.getMessage();
        }
        return mensaje;
    }
    public String modifiEmple(Connection con, empleado emp){
        PreparedStatement pst = null;
        String sql ="UPDATE EMPLEADO SET "
                + "NAME_EMPLEADO = ?, "
                + "APELLIDOP_EMPLEADO=?, "
                + "APELLIDOM_EMPLEADO=?, "
                + "LADA_EMPLEADO=?, "
                + "TEL_EMPLEADO = ?, "
                + "CORREO_EMPLEADO = ?, "
                + "RFC_EMPLEADO = ?, "
                + "ROL_EMPLEADO = ?,"
                + "EMPLEADO_SUCURSAL = ?,"
                + "EMPLEADO_DOMICILIO = ? "
                + "WHERE EMPLEADO_ID = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, emp.getNAME_EMPLEADO());
            pst.setString(2,emp.getAPELLIDOP_EMPLEADO());
            pst.setString(3,emp.getAPELLIDOM_EMPLEADO());
            pst.setInt(4,emp.getLADA_EMPLEADO());
            pst.setInt(5,emp.getTEL_EMPLEADO());
            pst.setString(6,emp.getCORREO_EMPLEADO());
            pst.setString(7,emp.getRFC_EMPLEADO());
            pst.setString(8,emp.getROL_EMPLEADO());
            pst.setInt(9,emp.getEMPLEADO_SUCURSAL());
            pst.setInt(10,emp.getEMPLEADO_DOMICILIO());
            pst.setInt(11,emp.getEMPLEADO_ID());
            mensaje = "Actualizado Correctamente";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "No se pudo  \n "+e.getMessage();
        }
        return mensaje;
    }
    public String eliminarEmple(Connection con, int id){
        PreparedStatement pst = null;
        String sql ="DELETE FROM EMPLEADO WHERE EMPLEADO_ID = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,id);
            
            mensaje = "Eliminado Correctamente";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "Eliminado Incorrectamente \n "+e.getMessage();
        }
        return mensaje;
    }
    public void ListarEmple(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"ID","NOMBRE","APELLIDO PATERNO", "APELLIDO MATERNO", "LADA","TELEFONO",
        "CORREO", "RFC", "ROL", "SUCURSAL", "DOMICILIO"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT * FROM EMPLEADO ORDER BY EMPLEADO_ID";
        String [] filas = new String[11];
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                for(int i =0; i<11; i++){
                    filas[i]=rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla");
        }
    }
}

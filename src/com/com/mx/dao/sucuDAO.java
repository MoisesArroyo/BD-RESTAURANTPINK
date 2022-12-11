/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.com.mx.dao;

import com.emp.mx.entity.Sucursal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**

/**
 *
 * @author Moise
 */
public class sucuDAO {
    private String mensaje = "";
    public String agregarSuc(Connection con, Sucursal suc){
        PreparedStatement pst = null;
         String sql = "INSERT INTO SUCURSAL (SUCURSAL_ID, NAME_SUCURSAL, NUM_EXT, LADA_SUCURSAL, TEL_SUCURSAL, CORREO_SUCURSAL, SUCURSAL_HORARIO, SUCURSAL_DOMICILIO)" +
        "VALUES (?,?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,suc.getSUCURSAL_ID());
            pst.setString(2, suc.getNAME_SUCURSAL());
            pst.setInt(3,suc.getNUM_EXT());
            pst.setInt(4,suc.getLADA_SUCURSAL());
            pst.setInt(5,suc.getTEL_SUCURSAL());
            pst.setString(6,suc.getCORREO_SUCURSAL());
            pst.setInt(7,suc.getSUCURSAL_HORARIO());
            pst.setInt(8,suc.getSUCURSAL_DOMICILIO());
            mensaje = "Guardado Correctamente";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "Guardado Incorrectamente \n "+e.getMessage();
        }
        return mensaje;
    }
    public String modifiSucu(Connection con, Sucursal suc){
        PreparedStatement pst = null;
        String sql ="UPDATE SUCURSAL SET "
                + "NAME_SUCURSAL = ?, "
                + "NUM_EXT=?, "
                + "LADA_SUCURSAL=?, "
                + "TEL_SUCURSAL = ?, "
                + "CORREO_SUCURSAL = ?, "
                + "SUCURSAL_HORARIO = ?, "
                + "SUCURSAL_DOMICILIO = ? "
                + "WHERE SUCURSAL_ID = ?";
        try {
             pst = con.prepareStatement(sql);
            pst.setString(1, suc.getNAME_SUCURSAL());
            pst.setInt(2,suc.getNUM_EXT());
            pst.setInt(3,suc.getLADA_SUCURSAL());
            pst.setInt(4,suc.getTEL_SUCURSAL());
            pst.setString(5,suc.getCORREO_SUCURSAL());
            pst.setInt(6,suc.getSUCURSAL_HORARIO());
            pst.setInt(7,suc.getSUCURSAL_DOMICILIO());
            pst.setInt(8,suc.getSUCURSAL_ID());
            mensaje = "Actualizado Correctamente";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "No se pudo  \n "+e.getMessage();
        }
        return mensaje;
    }
    public String eliminarSucu(Connection con, int id){
        PreparedStatement pst = null;
        String sql ="DELETE FROM SUCURSAL WHERE SUCURSAL_ID = ?";
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
    public void ListarSucu(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"ID","NOMBRE","EXT", "LADA","TELEFONO",
        "CORREO", "HORARIO", "DOMICILIO"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT * FROM SUCURSAL ORDER BY SUCURSAL_ID";
        String [] filas = new String[8];
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                for(int i =0; i<8; i++){
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

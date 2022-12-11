/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.com.mx.dao;

import com.emp.mx.entity.Producto;
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
public class produDAO {
    private String mensaje = "";
    public String agregarProdu(Connection con, Producto pro){
        PreparedStatement pst = null;
        String sql ="INSERT INTO PRODUCTO("
                    +"ID_PRODUCTO," +
                    "NAME_PRODUCTO," +
                    "DETALLES_PRODUCTO," +
                    "TIPO_PRODUCTO," +
                    "COSTO_PRODUCTO)"
                    + "VALUES(?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,pro.getID_PRODUCTO());
            pst.setString(2, pro.getNAME_PRODUCTO());
            pst.setString(3,pro.getDETALLES_PRODUCTO());
            pst.setString(4,pro.getTIPO_PRODUCTO());
            pst.setInt(5,pro.getCOSTO_PRODUCTO());
            mensaje = "Guardado Correctamente";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "Guardado Incorrectamente \n "+e.getMessage();
        }
        return mensaje;
    }
    public String modifiPro(Connection con, Producto pro){
        PreparedStatement pst = null;
        String sql ="UPDATE PRODUCTO SET " +
                    "NAME_PRODUCTO=?," +
                    "DETALLES_PRODUCTO=?," +
                    "TIPO_PRODUCTO=?," +
                    "COSTO_PRODUCTO=?" +
                    "WHERE ID_PRODUCTO = ?";
        try {
            pst = con.prepareStatement(sql);
            pst = con.prepareStatement(sql);
            ;
            pst.setString(1, pro.getNAME_PRODUCTO());
            pst.setString(2,pro.getDETALLES_PRODUCTO());
            pst.setString(3,pro.getTIPO_PRODUCTO());
            pst.setInt(4,pro.getCOSTO_PRODUCTO());
            pst.setInt(5,pro.getID_PRODUCTO());
            mensaje = "Actualizado Correctamente";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "No se pudo  \n "+e.getMessage();
        }
        return mensaje;
    }
    public String eliminarProdu(Connection con, int id){
        PreparedStatement pst = null;
        String sql ="DELETE FROM PRODUCTO WHERE ID_PRODUCTO = ?";
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
    public void ListarPro(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"ID","NOMBRE","DETALLES PRODUCTO", "TIPO", "COSTO"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT * FROM PRODUCTO ORDER BY ID_PRODUCTO";
        String [] filas = new String[5];
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                for(int i =0; i<5; i++){
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

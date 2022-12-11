/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.com.mx.dao;

import com.emp.mx.entity.DetalleProducto;
import com.emp.mx.entity.Pedidos;
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
public class DetaProDAO {
    private String mensaje = "";
    public String agregarDeta(Connection con, DetalleProducto ped){
        PreparedStatement pst = null;
         String sql = "INSERT INTO DETALLES_INGREDIENTES (DETA_PRODUCTO_ID, DETA_INGREDIENTE_ID, PORCION)" +
                       "VALUES (?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,ped.getDETA_PRODUCTO_ID());
            pst.setInt(2, ped.getDETA_INGREDIENTE_ID());
            pst.setInt(3,ped.getPORCION());
            mensaje = "Guardado Correctamente";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "Guardado Incorrectamente \n "+e.getMessage();
        }
        return mensaje;
    }
    public String modifiDeta(Connection con, DetalleProducto ped){
        PreparedStatement pst = null;
        String sql ="UPDATE DETALLES_INGREDIENTES SET "
                + "PORCION=? "
                + "WHERE DETA_PRODUCTO_ID = ? AND DETA_INGREDIENTE_ID = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,ped.getPORCION());
            pst.setInt(2,ped.getDETA_PRODUCTO_ID());
            pst.setInt(3, ped.getDETA_INGREDIENTE_ID());
            mensaje = "Actualizado Correctamente";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "No se pudo  \n "+e.getMessage();
        }
        return mensaje;
    }
    public String eliminarDeta(Connection con, int id1, int id2){
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql ="DELETE FROM DETALLES_INGREDIENTES WHERE DETA_PRODUCTO_ID = ? AND DETA_INGREDIENTE_ID = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,id1);
            pst.setInt(2,id2);
            rs = pst.executeQuery();
            if(rs.next()){
              mensaje = "Eliminado Correctamente";
                pst.execute();
                pst.close();  
            }
        } catch (SQLException e) {
            mensaje = "Eliminado Incorrectamente \n "+e.getMessage();
        }
        return mensaje;
    }
    public void ListarDeta(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"PRODUCTO","INGREDIENTE","PORCION G"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT * FROM DETALLES_INGREDIENTES ORDER BY DETA_PRODUCTO_ID";
        String [] filas = new String[3];
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                for(int i =0; i<3; i++){
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

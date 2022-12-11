/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.com.mx.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Moise
 */
public class Select3 {
    public void ListarSel3(Connection con, JTable tabla, String id) throws SQLException{
        DefaultTableModel model;
        PreparedStatement pst = null;
        String [] columnas = {"PRODUCTO","INGREDIENTE"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT NAME_PRODUCTO, NAME_INGREDIENTE FROM DETALLES_INGREDIENTES JOIN PRODUCTO ON DETALLES_INGREDIENTES.DETA_PRODUCTO_ID = PRODUCTO.ID_PRODUCTO JOIN INGREDIENTES ON DETALLES_INGREDIENTES.DETA_INGREDIENTE_ID = INGREDIENTES.ID_INGREDIENTES WHERE NAME_PRODUCTO = ? ";
        
        pst = con.prepareStatement(sql);
        pst.setString(1, id);
        String [] filas = new String[2];
        
        ResultSet rs = null;
        try {
            rs = pst.executeQuery();
            while(rs.next()){
                for(int i =0; i<2; i++){
                    filas[i]=rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla"+e);
        }
    }
}

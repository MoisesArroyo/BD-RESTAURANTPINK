/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.com.mx.dao;

/**
 *
 * @author Moise
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Select5 {
    public void ListarSel5(Connection con, JTable tabla, String id) throws SQLException{
        DefaultTableModel model;
        PreparedStatement pst = null;
        String [] columnas = {"CANTIDAD","MES"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT COUNT(PEDIDO_ID), TO_CHAR(PEDIDO_FECHA, 'MONTH') FROM PEDIDO WHERE EXTRACT(YEAR FROM PEDIDO_FECHA) = ? GROUP BY TO_CHAR(PEDIDO_FECHA, 'MONTH')";
        
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

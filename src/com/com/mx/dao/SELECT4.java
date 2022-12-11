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

/**
 *
 * @author Moise
 */
public class SELECT4 {
    public void ListarSel4(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"CANTIDAD","NOMBRE "};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT COUNT(DETALLEPEDIDO_PEDIDO)*MAX(CANTIDAD_PEDIDO) AS PRODUCTO_ESTRELLA, NAME_PRODUCTO FROM DETALLE_PEDIDO JOIN PRODUCTO ON DETALLE_PEDIDO.DETALLEPEDIDO_PRODUCTOS = PRODUCTO.ID_PRODUCTO GROUP BY NAME_PRODUCTO ORDER BY PRODUCTO_ESTRELLA DESC FETCH FIRST ROW ONLY";
        String [] filas = new String[2];
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
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

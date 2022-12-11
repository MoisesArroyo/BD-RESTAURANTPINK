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
public class Select2 {
    public void ListarSel2(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"NAME_EMPLEADO","PEDIDO_ID"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT NAME_EMPLEADO, COUNT(PEDIDO_ID) AS TOTAL FROM PEDIDO JOIN EMPLEADO ON PEDIDO.PEDIDO_EMPLEADO = EMPLEADO.EMPLEADO_ID GROUP BY NAME_EMPLEADO ORDER BY TOTAL DESC FETCH FIRST ROW ONLY";
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

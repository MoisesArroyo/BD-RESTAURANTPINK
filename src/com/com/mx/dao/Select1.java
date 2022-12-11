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
import com.emp.mx.entity.Sucursal;
import com.emp.mx.entity.Pedidos;


public class Select1 {
    public void ListarSel1(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"PEDIDO ID","NOMBRE SUCURSAL"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT COUNT(PEDIDO_ID), NAME_SUCURSAL FROM PEDIDO JOIN EMPLEADO ON PEDIDO.PEDIDO_EMPLEADO = EMPLEADO.EMPLEADO_ID JOIN SUCURSAL ON EMPLEADO.EMPLEADO_SUCURSAL = SUCURSAL.SUCURSAL_ID GROUP BY NAME_SUCURSAL";
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.com.mx.dao;

import com.emp.mx.entity.Cliente;
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
public class pediDAO {
    private String mensaje = "";
    public String agregarPed(Connection con, Pedidos ped){
        PreparedStatement pst = null;
         String sql = "INSERT INTO PEDIDO(PEDIDO_ID, NUM_MESA, PEDIDO_FECHA, PEDIDO_EMPLEADO, PEDIDO_METODO_PAGO, PEDIDO_CLIENTE)\n" +
"VALUES (?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,ped.getPEDIDO_ID());
            pst.setInt(2, ped.getNUM_MESA());
            pst.setDate(3,ped.getPEDIDO_FECHA());
            pst.setInt(4,ped.getPEDIDO_EMPLEADO());
            pst.setInt(5,ped.getPEDIDO_METODO_PAGO());
            pst.setInt(6,ped.getPEDIDO_CLIENTE());
            mensaje = "Guardado Correctamente";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "Guardado Incorrectamente \n "+e.getMessage();
        }
        return mensaje;
    }
    public String modifiPed(Connection con, Pedidos ped){
        PreparedStatement pst = null;
        String sql ="UPDATE PEDIDO SET "
                + "NUM_MESA = ?, "
                + "PEDIDO_FECHA=?, "
                + "PEDIDO_EMPLEADO=?, "
                + "PEDIDO_METODO_PAGO = ?, "
                + "PEDIDO_CLIENTE = ? "
                + "WHERE PEDIDO_ID = ?";
        try {
            pst = con.prepareStatement(sql);
            pst = con.prepareStatement(sql);
            
            pst.setInt(1, ped.getNUM_MESA());
            pst.setDate(2,ped.getPEDIDO_FECHA());
            pst.setInt(3,ped.getPEDIDO_EMPLEADO());
            pst.setInt(4,ped.getPEDIDO_METODO_PAGO());
            pst.setInt(5,ped.getPEDIDO_CLIENTE());
            pst.setInt(6,ped.getPEDIDO_ID());
            mensaje = "Actualizado Correctamente";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "No se pudo  \n "+e.getMessage();
        }
        return mensaje;
    }
    public String eliminarPed(Connection con, int id){
        PreparedStatement pst = null;
        String sql ="DELETE FROM PEDIDO WHERE PEDIDO_ID = ?";
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
    public void ListarPed(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"ID","NO. MESA","FECHA","EMPLEADO" ,"METODO DE PAGO","PEDIDO CLIENTE"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT * FROM PEDIDO ORDER BY PEDIDO_ID";
        String [] filas = new String[6];
        Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                for(int i =0; i<6; i++){
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

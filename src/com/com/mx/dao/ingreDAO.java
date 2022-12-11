/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.com.mx.dao;

import com.emp.mx.entity.Ingredientes;
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
public class ingreDAO {
    private String mensaje = "";
    public String agregarIngre(Connection con, Ingredientes ingre){
        PreparedStatement pst = null;
        String sql ="INSERT INTO INGREDIENTES(ID_INGREDIENTES,NAME_INGREDIENTE)"
                    + "VALUES(?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,ingre.getID_INGREDIENTES());
            pst.setString(2, ingre.getNAME_INGREDIENTE());
           
            mensaje = "Guardado Correctamente";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "Guardado Incorrectamente \n "+e.getMessage();
        }
        return mensaje;
    }
    public String modifiIngre(Connection con, Ingredientes ingre){
        PreparedStatement pst = null;
        String sql ="UPDATE INGREDIENTES SET NAME_INGREDIENTE = ?"
                + "WHERE ID_INGREDIENTES = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, ingre.getNAME_INGREDIENTE());
            pst.setInt(2,ingre.getID_INGREDIENTES());
            mensaje = "Actualizado Correctamente";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "No se pudo  \n "+e.getMessage();
        }
        return mensaje;
    }
    public String eliminarIngre(Connection con, int id){
        PreparedStatement pst = null;
        String sql ="DELETE FROM INGREDIENTES WHERE ID_INGREDIENTES = ?";
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
    public void ListarIngre(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"ID_INGREDIENTES","NAME_INGREDIENTE"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT * FROM INGREDIENTES ORDER BY ID_INGREDIENTES";
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
            JOptionPane.showMessageDialog(null, "No se puede mostrar la tabla");
        }
    }
}

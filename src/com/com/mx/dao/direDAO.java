/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.com.mx.dao;

import com.emp.mx.entity.Direccion;
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
public class direDAO {
    private String mensaje = "";
    public String agregarDire(Connection con, Direccion dire){
        PreparedStatement pst = null;
        String sql ="INSERT INTO DOMICILIO(DOMICILIO_ID," +
                    "CALLE," +
                    "NUM_EXT," +
                    "NUM_INT," +
                    "COLONIA," +
                    "MUNICIPIO," +
                    "CP_DOMICILIO," +
                    "DOM_ESTADO_ID)" 
                    + "VALUES(?,?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,dire.getDOMICILIO_ID());
            pst.setString(2, dire.getCALLE());
            pst.setInt(3,dire.getNUM_EXT());
            pst.setInt(4,dire.getNUM_INT());
            pst.setString(5,dire.getCOLONIA());
            pst.setString(6,dire.getMUNICIPIO());
            pst.setInt(7,dire.getCP_DOMICILIO());
            pst.setInt(8,dire.getDOM_ESTADO_ID());
            
            mensaje = "Guardado Correctamente";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "Guardado Incorrectamente \n "+e.getMessage();
        }
        return mensaje;
    }
    public String modifiDire(Connection con, Direccion dire){
        PreparedStatement pst = null;
        String sql ="UPDATE DOMICILIO SET "
                + "CALLE = ?, "
                + "NUM_EXT=?, "
                + "NUM_INT=?, "
                + "COLONIA=?, "
                + "MUNICIPIO = ?, "
                + "CP_DOMICILIO = ?, "
                + "DOM_ESTADO_ID = ? "
                + "WHERE DOMICILIO_ID = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, dire.getCALLE());
            pst.setInt(2,dire.getNUM_EXT());
            pst.setInt(3,dire.getNUM_INT());
            pst.setString(4,dire.getCOLONIA());
            pst.setString(5,dire.getMUNICIPIO());
            pst.setInt(6,dire.getCP_DOMICILIO());
            pst.setInt(7,dire.getDOM_ESTADO_ID());
            pst.setInt(8,dire.getDOMICILIO_ID());
            mensaje = "Actualizado Correctamente";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "No se pudo  \n "+e.getMessage();
        }
        return mensaje;
    }
    public String eliminarDire(Connection con, int id){
        PreparedStatement pst = null;
        String sql ="DELETE FROM DOMICILIO WHERE DOMICILIO_ID = ?";
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
    public void ListarDire(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"ID","CALLE","EXT", "INT", "COLONIA","MUNICIPIO",
        "CP", "ESTADO"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT * FROM DOMICILIO ORDER BY DOMICILIO_ID";
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

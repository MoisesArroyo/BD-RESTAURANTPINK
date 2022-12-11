/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.com.mx.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.emp.mx.entity.Cliente;

/**
 *
 * @author Moise
 */
public class clienDAO {
    private String mensaje = "";
    public String agregarCli(Connection con, Cliente cli){
        PreparedStatement pst = null;
         String sql = "INSERT INTO CLIENTE (ID_CLIENTE, NAME_CLIENTE, APELLIDOP_CLIENTE, APELLIDOM_CLIENTE, LADA_CLIENTE, TEL_CLIENTE, CORREO_CLIENTE, CUMPLEANIOS_CLIENTE)" +
"VALUES (?,?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,cli.getID_CLIENTE());
            pst.setString(2, cli.getNAME_CLIENTE());
            pst.setString(3,cli.getAPELLIDOP_CLIENTE());
            pst.setString(4,cli.getAPELLIDOM_CLIENTE());
            pst.setInt(5,cli.getLADA_CLIENTE());
            pst.setInt(6,cli.getTEL_CLIENTE());
            pst.setString(7,cli.getCORREO_CLIENTE());
            pst.setDate(8,cli.getCUMPLEANIOS_CLIENTE());
            mensaje = "Guardado Correctamente";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "Guardado Incorrectamente \n "+e.getMessage();
        }
        return mensaje;
    }
    public String modifiCli(Connection con, Cliente cli){
        PreparedStatement pst = null;
        String sql ="UPDATE CLIENTE SET "
                + "NAME_CLIENTE = ?, "
                + "APELLIDOP_CLIENTE=?, "
                + "APELLIDOM_CLIENTE=?, "
                + "LADA_CLIENTE = ?, "
                + "TEL_CLIENTE = ?, "
                + "CORREO_CLIENTE = ?, "
                + "CUMPLEANIOS_CLIENTE = ? "
                + "WHERE ID_CLIENTE = ?";
        try {
             pst = con.prepareStatement(sql);
            pst.setString(1, cli.getNAME_CLIENTE());
            pst.setString(2,cli.getAPELLIDOP_CLIENTE());
            pst.setString(3,cli.getAPELLIDOM_CLIENTE());
            pst.setInt(4,cli.getLADA_CLIENTE());
            pst.setInt(5,cli.getTEL_CLIENTE());
            pst.setString(6,cli.getCORREO_CLIENTE());
            pst.setDate(7,cli.getCUMPLEANIOS_CLIENTE());
            pst.setInt(8,cli.getID_CLIENTE());
            mensaje = "Actualizado Correctamente";
            pst.execute();
            pst.close();
            
        } catch (SQLException e) {
            mensaje = "No se pudo  \n "+e.getMessage();
        }
        return mensaje;
    }
    public String eliminarCli(Connection con, int id){
        PreparedStatement pst = null;
        String sql ="DELETE FROM CLIENTE WHERE ID_CLIENTE = ?";
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
    public void ListarCli(Connection con, JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"ID","NOMBRE","APELIDOP","APELLIDOM" ,"LADA","TELEFONO",
        "CORREO", "CUMPLEAÑOS"};
        model = new DefaultTableModel(null, columnas);
        
        String sql = "SELECT * FROM CLIENTE ORDER BY ID_CLIENTE";
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

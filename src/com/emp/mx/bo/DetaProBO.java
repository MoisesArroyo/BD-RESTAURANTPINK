/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emp.mx.bo;

import com.com.mx.dao.DetaProDAO;
import com.emp.mx.db.Conexion;
import com.emp.mx.entity.DetalleProducto;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author Moise
 */
public class DetaProBO {
    private String mensaje = "";
    private DetaProDAO cliendao = new DetaProDAO();
    
    public String agregarDeta(DetalleProducto cli) throws SQLException{
        Connection conn = Conexion.getConnection();
        try {
            mensaje = cliendao.agregarDeta(conn, cli);
            conn.commit();
        } catch (Exception e) {
            mensaje = mensaje + " " +e.getMessage();
            conn.rollback();
        }finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " +e.getMessage();
            }
        }
        return mensaje;
    }
    public String modifiDeta(DetalleProducto cli) throws SQLException{
         Connection conn = Conexion.getConnection();
        try {
            mensaje = cliendao.modifiDeta(conn, cli);
            conn.commit();
        } catch (Exception e) {
            mensaje = mensaje + " " +e.getMessage();
            conn.rollback();
        }finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " +e.getMessage();
            }
        }
        return mensaje;
    }
    public String eliminarDeta(int id, int id1) throws SQLException{
         Connection conn = Conexion.getConnection();
        try {
            mensaje = cliendao.eliminarDeta(conn, id, id1);
            conn.commit();
        } catch (Exception e) {
            mensaje = mensaje + " " +e.getMessage();
            conn.rollback();
        }finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " +e.getMessage();
            }
        }
        return mensaje;
    }
    public void ListarDeta(JTable tabla){
        Connection conn = Conexion.getConnection();
        cliendao.ListarDeta(conn,tabla);
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

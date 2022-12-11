/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emp.mx.bo;

import com.com.mx.dao.direDAO;
import com.com.mx.dao.empleadoDAO;
import com.emp.mx.db.Conexion;
import com.emp.mx.entity.Direccion;
import com.emp.mx.entity.empleado;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author Moise
 */
public class DireccionBO {
    private String mensaje = "";
    private direDAO edao = new direDAO();
    
    public String agregarDire(Direccion dire) throws SQLException{
        Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.agregarDire(conn, dire);
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
    public String modifiDire(Direccion dire) throws SQLException{
         Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.modifiDire(conn, dire);
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
    public String eliminarDire(int id) throws SQLException{
         Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.eliminarDire(conn, id);
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
    public void ListarDire(JTable tabla){
        Connection conn = Conexion.getConnection();
        edao.ListarDire(conn,tabla);
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

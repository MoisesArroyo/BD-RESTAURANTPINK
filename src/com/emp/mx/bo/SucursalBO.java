/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emp.mx.bo;

import com.com.mx.dao.empleadoDAO;
import com.com.mx.dao.sucuDAO;
import com.emp.mx.db.Conexion;
import com.emp.mx.entity.Sucursal;
import com.emp.mx.entity.empleado;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author Moise
 */
public class SucursalBO {
    private String mensaje = "";
    private sucuDAO sucdao = new sucuDAO();
    
    public String agregarSuc(Sucursal suc) throws SQLException{
        Connection conn = Conexion.getConnection();
        try {
            mensaje = sucdao.agregarSuc(conn, suc);
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
    public String modifiSuc(Sucursal suc) throws SQLException{
         Connection conn = Conexion.getConnection();
        try {
            mensaje = sucdao.modifiSucu(conn, suc);
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
    public String eliminarSuc(int id) throws SQLException{
         Connection conn = Conexion.getConnection();
        try {
            mensaje = sucdao.eliminarSucu(conn, id);
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
    public void ListarSucu(JTable tabla){
        Connection conn = Conexion.getConnection();
        sucdao.ListarSucu(conn,tabla);
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

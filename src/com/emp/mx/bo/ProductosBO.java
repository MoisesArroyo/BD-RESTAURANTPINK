/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emp.mx.bo;

import com.com.mx.dao.ingreDAO;
import com.com.mx.dao.produDAO;
import com.emp.mx.db.Conexion;
import com.emp.mx.entity.Ingredientes;
import com.emp.mx.entity.Producto;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author Moise
 */
public class ProductosBO {
    private String mensaje = "";
    private produDAO produdao = new produDAO();
    
    public String agregarProdu(Producto produ) throws SQLException{
        Connection conn = Conexion.getConnection();
        try {
            mensaje = produdao.agregarProdu(conn, produ);
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
    public String modifiPro(Producto produ) throws SQLException{
         Connection conn = Conexion.getConnection();
        try {
            mensaje = produdao.modifiPro(conn, produ);
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
    public String eliminarProdu(int id) throws SQLException{
         Connection conn = Conexion.getConnection();
        try {
            mensaje = produdao.eliminarProdu(conn, id);
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
    public void ListarPro(JTable tabla){
        Connection conn = Conexion.getConnection();
        produdao.ListarPro(conn,tabla);
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

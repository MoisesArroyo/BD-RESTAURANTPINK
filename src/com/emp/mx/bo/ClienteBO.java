/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emp.mx.bo;

import com.com.mx.dao.clienDAO;
import com.emp.mx.db.Conexion;
import com.emp.mx.entity.Cliente;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author Moise
 */
public class ClienteBO {
    private String mensaje = "";
    private clienDAO cliendao = new clienDAO();
    
    public String agregarCli(Cliente cli) throws SQLException{
        Connection conn = Conexion.getConnection();
        try {
            mensaje = cliendao.agregarCli(conn, cli);
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
    public String modifiCli(Cliente cli) throws SQLException{
         Connection conn = Conexion.getConnection();
        try {
            mensaje = cliendao.modifiCli(conn, cli);
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
    public String eliminarCli(int id) throws SQLException{
         Connection conn = Conexion.getConnection();
        try {
            mensaje = cliendao.eliminarCli(conn, id);
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
    public void ListarCli(JTable tabla){
        Connection conn = Conexion.getConnection();
        cliendao.ListarCli(conn,tabla);
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

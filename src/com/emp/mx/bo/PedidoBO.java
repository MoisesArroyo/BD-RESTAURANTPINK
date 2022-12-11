/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emp.mx.bo;


import com.com.mx.dao.pediDAO;
import com.emp.mx.db.Conexion;
import com.emp.mx.entity.Pedidos;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author Moise
 */
public class PedidoBO {
    private String mensaje = "";
    private pediDAO edao = new pediDAO();
    
    public String agregarPed(Pedidos ped) throws SQLException{
        Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.agregarPed(conn, ped);
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
    public String modifiPed(Pedidos ped) throws SQLException{
         Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.modifiPed(conn, ped);
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
    public String eliminarPed(int id) throws SQLException{
         Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.eliminarPed(conn, id);
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
    public void ListarPed(JTable tabla){
        Connection conn = Conexion.getConnection();
        edao.ListarPed(conn,tabla);
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

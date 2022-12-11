
package com.emp.mx.bo;

import com.com.mx.dao.empleadoDAO;
import com.emp.mx.db.Conexion;
import com.emp.mx.entity.empleado;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EmpleadoBO {
    private String mensaje = "";
    private empleadoDAO edao = new empleadoDAO();
    
    public String agregarEmple(empleado emp) throws SQLException{
        Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.agregarEmple(conn, emp);
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
    public String modifiEmple(empleado emp) throws SQLException{
         Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.modifiEmple(conn, emp);
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
    public String eliminarEmple(int id) throws SQLException{
         Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.eliminarEmple(conn, id);
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
    public void ListarEmple(JTable tabla){
        Connection conn = Conexion.getConnection();
        edao.ListarEmple(conn,tabla);
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
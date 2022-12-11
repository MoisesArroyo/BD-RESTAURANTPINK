/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emp.mx.bo;
import com.com.mx.dao.ingreDAO;
import com.emp.mx.db.Conexion;
import com.emp.mx.entity.Ingredientes;
import com.emp.mx.entity.empleado;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Moise
 */
public class IngredientesBO {
    private String mensaje = "";
    private ingreDAO ingredao = new ingreDAO();
    
    public String agregarIngre(Ingredientes ingre) throws SQLException{
        Connection conn = Conexion.getConnection();
        try {
            mensaje = ingredao.agregarIngre(conn, ingre);
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
    public String modifiIngre(Ingredientes ingre) throws SQLException{
         Connection conn = Conexion.getConnection();
        try {
            mensaje = ingredao.modifiIngre(conn, ingre);
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
    public String eliminarIngre(int id) throws SQLException{
         Connection conn = Conexion.getConnection();
        try {
            mensaje = ingredao.eliminarIngre(conn, id);
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
    public void ListarIngre(JTable tabla){
        Connection conn = Conexion.getConnection();
        ingredao.ListarIngre(conn,tabla);
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

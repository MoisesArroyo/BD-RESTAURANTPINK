/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emp.mx.bo;

import com.com.mx.dao.Select3;
import com.emp.mx.db.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author Moise
 */
public class Select3BO {
    private Select3 sec = new Select3();
    public void ListarSel3(JTable tabla, String id) throws SQLException{
        Connection conn = Conexion.getConnection();
        sec.ListarSel3(conn,tabla,id);
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emp.mx.bo;

import com.com.mx.dao.Select3;
import com.com.mx.dao.Select5;
import com.emp.mx.db.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author Moise
 */
public class Select5BO {
    private Select5 sec = new Select5();
    public void ListarSel5(JTable tabla, String id) throws SQLException{
        Connection conn = Conexion.getConnection();
        sec.ListarSel5(conn,tabla,id);
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

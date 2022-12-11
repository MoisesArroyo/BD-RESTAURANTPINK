/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emp.mx.bo;

import com.com.mx.dao.SELECT4;
import com.com.mx.dao.Select2;
import com.emp.mx.db.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author Moise
 */
public class Select4BO {
    private SELECT4 sec = new SELECT4();
    public void ListarSel4(JTable tabla){
        Connection conn = Conexion.getConnection();
        sec.ListarSel4(conn,tabla);
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

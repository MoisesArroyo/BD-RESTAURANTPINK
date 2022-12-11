/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emp.mx.bo;

import com.com.mx.dao.Select1;
import com.emp.mx.db.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author Moise
 */
public class Select1BO {
    private Select1 sec = new Select1();
    public void ListarSucu(JTable tabla){
        Connection conn = Conexion.getConnection();
        sec.ListarSel1(conn,tabla);
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

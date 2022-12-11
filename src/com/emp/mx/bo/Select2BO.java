/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emp.mx.bo;

import com.com.mx.dao.Select1;
import com.com.mx.dao.Select2;
import com.emp.mx.db.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;



public class Select2BO {
    private Select2 sec = new Select2();
    public void ListarSel2(JTable tabla){
        Connection conn = Conexion.getConnection();
        sec.ListarSel2(conn,tabla);
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

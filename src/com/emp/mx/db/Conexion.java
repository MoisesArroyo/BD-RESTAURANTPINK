
package com.emp.mx.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    public Connection con = null;
    public String sentenciaSQL;
    private static Connection conn = null;
    private static String login = "USR_EMP";
    private static String contra = "PASSEMP";
    private static String url = "jdbc:oracle:thin:@//localhost:1521/xepdb1";
    
    public static Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, login, contra);
            conn.setAutoCommit(false);
            if(conn != null){
                System.out.println("Conexion Exitosa");
            }else{
                System.out.println("Conexion Erronea");
            }
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Conexión Erronea "+e.getMessage());
        }
        return conn;
    }
    
    public void desconection(){
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Error al desconectar"+e.getMessage());
        }
    }
    public static void main(String[] args){
        Conexion c = new Conexion();
        c.getConnection();
    }
}

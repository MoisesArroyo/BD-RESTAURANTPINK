/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emp.mx.db;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.SimpleFileResolver;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Moise
 */
public class Reporte3View extends Conexion{
    
    public JRViewer getReport(String id){
        Conexion c = new Conexion();
        Conexion y = new Conexion();
        y.getConnection();
        
        try{
           // Lee el archivo de reporte
           JasperDesign desing = JRXmlLoader.load(getClass().getResource("/reportes/REPORT3.jrxml").getPath());
           // Compila el reporte
           JasperReport jr = JasperCompileManager.compileReport(desing);
           // Paramatros del reporte, manda el ID de la renta para generar el reporte
           Map<String, Object> parametros = new HashMap<>();
           parametros.put("NOMBRE",id);
           // Ruta de las imagenes que usa el reporte
           String reportsDirPath = getClass().getResource("/reportes").getPath();
           File reportsDir = new File(reportsDirPath);
           // Configuracíón del parametro
           parametros.put(JRParameter.REPORT_FILE_RESOLVER, new SimpleFileResolver(reportsDir));
           // Genera el reporte
           JasperPrint jp = JasperFillManager.fillReport(jr, parametros,c.getConnection());
           // Muestra el reporte graficamente se usa la clase MyJRViewer en lugar de JRViewer para 
           // que solo guarde PDF´s
           MyJRViewer myjrv = new MyJRViewer(jp);
           JRViewer jrv = myjrv;           
           return jrv;
       }
       catch (JRException ex){
           System.out.println("Error " + ex.getMessage() + 
                    "\n\n" + sentenciaSQL + "\n\nUbicación: " + "getReport"+ex.getMessage());
          
           return null;
       }
    }
}

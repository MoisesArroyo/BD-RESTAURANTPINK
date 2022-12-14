/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emp.mx.db;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.SimpleFileResolver;

/**
 *
 * @author Moise
 */
public class Reporte5PDF extends Conexion{
    public void genReport(String id){
        
        // Conecta a la base de datos
       Conexion c = new Conexion();
       try{
           // Lee el archivo de reporte y compila el reporte
           JasperReport report = JasperCompileManager.compileReport(getClass().getResource("/Reportes/REPORT5.jrxml").getPath());
           // Paramatros del reporte, aun que no se le mandan parametros, es necesario para las imagenes 
           // que usa el reporte
           Map<String, Object> parametros = new HashMap<>();
           System.out.println("here?1");
           parametros.put("MES",id);
           System.out.println("here?2");
           // Ruta de las imagenes que usa el reporte   
           String reportsDirPath = getClass().getResource("/Reportes").getPath(); 
           File reportsDir = new File(reportsDirPath); 
           // Configuracíón del parametro
           System.out.println("here?3");
           parametros.put(JRParameter.REPORT_FILE_RESOLVER, new SimpleFileResolver(reportsDir));
           // Genera el reporte       
           System.out.println("here?4");
           JasperPrint print = JasperFillManager.fillReport(report,parametros,c.getConnection());
           // Exporta el reporte con el nombre Archivo.PDF
           JasperExportManager.exportReportToPdfFile(print, "Archivo.PDF");
           // Crea un file con el reporte para poder abrirlo
           File path = new File ("Archivo.PDF");
           // abre el reporte 
           Desktop.getDesktop().open(path);
       }
       catch (JRException ex){
           System.out.println("Entre aquí1");
           System.out.println("Error " + ex.getMessage() + 
                    "\n\n" + sentenciaSQL + "\n\nUbicación: " + "getReport");
       }
       catch (IOException ex){
           System.out.println("Entre aquí2");
           System.out.println("Error " + ex.getMessage() + 
                    "\n\n" + sentenciaSQL + "\n\nUbicación: " + "getReport");
       } 
      
    }
}

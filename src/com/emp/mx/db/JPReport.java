/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emp.mx.db;

/**
 *
 * @author Moise
 */
import java.util.Locale;
import java.util.ResourceBundle;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.swing.JRViewerToolbar;
import net.sf.jasperreports.view.JRSaveContributor;
import net.sf.jasperreports.view.save.JRPdfSaveContributor;

public class JPReport extends JRViewer{
    //define the constructor that you use
    public JPReport(JasperPrint jasperPrint) {
        super(jasperPrint);
    }
    @Override
    protected JRViewerToolbar createToolbar() {
        JRViewerToolbar toolbar = super.createToolbar();
        Locale locale = viewerContext.getLocale();
        ResourceBundle resBundle = viewerContext.getResourceBundle();
        // PDF
        JRPdfSaveContributor pdf = new JRPdfSaveContributor(locale, resBundle);
        toolbar.setSaveContributors(new JRSaveContributor[] {pdf});
        return toolbar;
    } 

    
    
}

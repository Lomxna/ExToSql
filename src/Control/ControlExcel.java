/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import View.ViewExcel;
import Model.ModelExcel;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author arlom
 */
public class ControlExcel implements ActionListener {
ModelExcel modelE = new ModelExcel();
    ViewExcel viewE = new ViewExcel();
    JFileChooser selecArchivo = new JFileChooser();
    File archivo;
    int cAction = 0;
    
    public ControlExcel(ViewExcel viewE, ModelExcel modelE ){
        this.viewE = viewE;
        this.modelE = modelE;
        this.viewE.btnImport.addActionListener(this);
    }
    
    public void addFilter(){
        selecArchivo.setFileFilter(new FileNameExtensionFilter("Excel (*.xls)", "xls"));
         selecArchivo.setFileFilter(new FileNameExtensionFilter("Excel (*.xlsx)", "xlsx"));
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
                cAction++;
        if(cAction==1)addFilter();
       
        if(e.getSource() == viewE.btnImport){
            if(selecArchivo.showDialog(null, "Seleccionar archivo")==JFileChooser.APPROVE_OPTION){
                archivo=selecArchivo.getSelectedFile();
                if(archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")){
                JOptionPane.showMessageDialog(null, modelE.Importar(archivo, viewE.jtDatos));
            }else{
                  JOptionPane.showMessageDialog(null, "The file must be in xls or xslsx format");  
                }
            }
        }
    }
    
}

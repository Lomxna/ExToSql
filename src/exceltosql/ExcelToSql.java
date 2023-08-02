/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceltosql;
import Model.ModelExcel;
import View.ViewExcel;
import Control.ControlExcel;
import Login.LoginExcel;
import Conexionsql.Conexion;
import View.ViewExcel;
import Control.ControlExcel;
import Model.ModelExcel;
import Users.CreateUsers;
import Login.LoginExcel;
import Menu.MenuAdmin;
/**
 *
 * @author arlom
 */
public class ExcelToSql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginExcel LE= new LoginExcel();
        ModelExcel modeloE = new ModelExcel();
        ViewExcel vistaE = new ViewExcel();
        ControlExcel contraControladorExcel = new ControlExcel(vistaE, modeloE);
        
        
        
        
       LE.setVisible(true);
       LE.setLocationRelativeTo(null);
       
       
    }
    
}

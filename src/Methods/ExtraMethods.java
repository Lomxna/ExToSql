/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;
import java.sql.*;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import Conexionsql.Conexion;
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author arlom
 */

public class ExtraMethods {
   Conexion cone = new Conexion(); 
   
   public DefaultComboBoxModel periodsproc(){

        //Agregar uin primer elemento el cual el usuario sepa que debe seleccionar
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Select FP");

        try {
            //Cargarmos los datos en el combobox
            Connection con = cone.obtenerconexion();
            CallableStatement cmd = con.prepareCall("{CALL CargarFicalPeriod}");

            ResultSet rs = cmd.executeQuery();

            while (rs.next()) {
                //El 2 representa la posicion que tiene en la tabla
                modelo.addElement(rs.getString(1));
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e);

        }
        return modelo;
    }
}

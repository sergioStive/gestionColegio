/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import utilidades.Conexion;

/**
 *
 * @author Sergio
 */
public class AsignaturaDAO {
    
    Connection cnn;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public AsignaturaDAO(){
        cnn=Conexion.getInstance();
    }
    
    
            
    
}

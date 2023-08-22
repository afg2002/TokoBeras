/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.JDBCType;
import java.sql.SQLDataException;

/**
 *
 * @author iikhi
 */
public class konek {
    static final String DB_URL = "jdbc:mysql://localhost/db_tokoberas";
    static final String DB_USER  = "root";
    static final String DB_PASS = "";
    
    private Connection koneksi;
    
    public  Connection connect() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Berhasil koneksi");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(konek.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
            koneksi = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
            System.out.println("Berhasil Koneksi Database");
        } catch (SQLException ex) {
            Logger.getLogger(konek.class.getName()).log(Level.SEVERE, null, ex);
        }
        return koneksi;
    }
}    
   

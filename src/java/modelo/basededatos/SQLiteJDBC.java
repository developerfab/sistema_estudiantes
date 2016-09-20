/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.basededatos;

import java.sql.* ;  // for standard JDBC programs
import java.math.* ; // for BigDecimal and BigInteger support
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabricio
 */
public class SQLiteJDBC {
    
    private static SQLiteJDBC conexion = null;
    // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:postgresql://localhost/condor";

   //  Database credentials
   private static final String USER = "postgres";
   private static final String PASS = "medellin";
   private Connection conn = null;
   private Statement stmt = null;
   
    
    private SQLiteJDBC(){
        try {
            
            Class.forName("org.postgresql.Driver");
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQLiteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SQLiteJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //METODOS
    public static SQLiteJDBC getInstance(){
        if(conexion==null){
            conexion = new SQLiteJDBC();
        }
        return conexion;
    }
    
    public boolean guardarEstudiante(String nombre, int documento, String carrera, String nivel){
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(SQLiteJDBC.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        String sql = "INSERT INTO \"Persona\"(nombre, documento, tipo, carrera, nivel, area) VALUES ('"+nombre+"', "+documento+", 'estudiante', '"+carrera+"', '"+nivel+"', '')";
        
        try {
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQLiteJDBC.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean guardarProfesor(String nombre, int documento, String area){
        try {
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(SQLiteJDBC.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        String sql = "INSERT INTO \"Persona\"(nombre, documento, tipo, carrera, nivel, area) VALUES ('"+nombre+"', "+documento+", 'profesor', '', 10, '"+area+"')";
        
        try {
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQLiteJDBC.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
    public boolean guardarMateria(String nombre, int nivel){
        String sql = "SELECT * FROM \"Materia\" ORDER BY id DESC LIMIT 1";
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            int id = 1;
            if(rs.next()){
                id = rs.getInt("id") +1 ;
            }
            
            sql = "INSERT INTO \"Materia\"(nombre, nivel, id) VALUES ('"+nombre+"', "+nivel+", "+id+")";
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQLiteJDBC.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
   
    }
}

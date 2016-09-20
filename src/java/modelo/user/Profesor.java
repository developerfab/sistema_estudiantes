/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.user;

import java.util.ArrayList;
import modelo.Curso;
import modelo.basededatos.SQLiteJDBC;

/**
 *
 * @author fabricio
 */
public class Profesor extends Persona {
    
    //ATRIBUTOS
    protected String area;
    
    //CONSTRUCTOR
    public Profesor(){
        
    }

    //METODOS
    

    @Override
    public int[] verNotas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Curso> verCursos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean guardar(){
        boolean rta = false;
        SQLiteJDBC peticion = SQLiteJDBC.getInstance();
        if(peticion.guardarProfesor(this.nombre, this.documento, this.area)){
            rta = true;
            System.out.println("guardado exitosamente");
        }
        return rta;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
    
}

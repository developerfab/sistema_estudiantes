/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.user;

/**
 *
 * @author fabricio
 */
public class Estudiante extends Persona {
    
    //ATRIBUTOS
    protected String carrera;
    protected int semeste;
    
    //CONSTRUCTOR
    public Estudiante(){
        
    }

    //METODOS
    @Override
    public String[] verCursos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[] verNotas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

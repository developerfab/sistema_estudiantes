/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.user;

import java.util.ArrayList;
import modelo.Curso;

/**
 *
 * @author fabricio
 */
public abstract class Persona implements InterfacePersona{
    
    //ATRIBUTOS
    protected String nombre;
    protected int documento;
    protected String tipo;
    
    //CONSTRUCTOR
    public Persona(){
        
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
    
    
}

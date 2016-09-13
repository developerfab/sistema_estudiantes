/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import modelo.user.Estudiante;
import modelo.user.Profesor;

/**
 *
 * @author fabricio
 */
public class Curso {
    
    //ATRIBUTOS
    protected Materia materia;
    protected Profesor profesor;
    protected int nivel;
    
    //CONSTRUCTOR
    public Curso(){
        
    }
    
    //METODOS
    
    /** asignarMateria
     * Metodo que permite asignar una materia especifica para el curso
     * @param materia
     * @return 
     */
    public boolean asignarMateria(Materia materia){
        return true;
    }
    
    /** asignarProfesor
     * Metodo que permite asignar un profesor al curso
     * @param profesor
     * @return 
     */
    public boolean asignarProfesor(Profesor profesor){
        return true;
    }
    
    /** asignarEstudiante
     * Metodo que permite asignar uno o muchos estudiantes al curso
     * @param estudiante
     * @return 
     */
    public boolean asignarEstudiante(Estudiante estudiante){
        return true;
    }
    
    /** getListaEstudiantes
     * Método que retorna una lista de objetos de tipo estudiante, los cuales
     * pertenecen al curso.
     * @return 
     */
    public ArrayList<Estudiante> getListaEstudiantes(){
        ArrayList<Estudiante> lista = null;
        return lista;
    }
    
}

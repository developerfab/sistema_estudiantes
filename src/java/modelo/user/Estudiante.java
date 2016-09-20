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
public class Estudiante extends Persona {
    
    //ATRIBUTOS
    protected String carrera;
    protected int semestre;
    
    //CONSTRUCTOR
    public Estudiante(){
        this.semestre = 1;
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
        String nivel = Integer.toString(this.semestre);
        if(peticion.guardarEstudiante(this.nombre, this.documento, this.carrera, nivel)){
            rta = true;
            System.out.println("guardado exitosamente");
        }
        return rta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
}

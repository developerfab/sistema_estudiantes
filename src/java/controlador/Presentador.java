/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.user.Estudiante;
import modelo.user.Profesor;

/** Presentador
 * Clase que hace las veces de Presentador dentro del modelo
 * arquitectura MVP
 * @author fabricio
 */
public class Presentador {

    //ATRIBUTOS
    private InterfaceContrato contrato;
    
    //CONSTRUCTOR
    public Presentador(InterfaceContrato icontrato){
        this.contrato = icontrato;
    }
    
    //METODOS
    
    /** createEstudiante
     * Metodo que crea el estudiante y se comunica con el modelo para almacenarlo
     * en la base de datos.
     * @param nombre
     * @param documento
     * @param carrera
     * @return 
     */
    public boolean createEstudiante(String nombre, String documento, String carrera){
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(nombre);
        estudiante.setCarrera(carrera);
        estudiante.setDocumento(Integer.parseInt(documento));
        boolean state = estudiante.guardar();
        return state;
    }
    
    /** createProfesor
     * Metodo que crea el profesor y se comunica con el modelo para almacenarlo
     * en la base de datos.
     * @param nombre
     * @param documento
     * @param area
     * @return 
     */
    public boolean createProfesor(String nombre, String documento, String area){
        Profesor profesor = new Profesor();
        profesor.setNombre(nombre);
        profesor.setDocumento(Integer.parseInt(documento));
        profesor.setArea(area);
        boolean state = profesor.guardar();
        return state;
    }
    
}

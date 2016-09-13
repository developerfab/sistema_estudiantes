/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Curso;
import modelo.user.Persona;

/**
 *
 * @author fabricio
 */
public class Tools {
    
    //CONSTRUCTOR
    public Tools(){
    
    }
    
    //METODOS
    
    /** showCursos
     * Metodo que retorna los cursos de un objeto tipo persona
     * @return 
     */
    public ArrayList<Curso> showCursos(Persona persona){
        ArrayList<Curso> personaCursor = persona.verCursos();
        return personaCursor;
    }
}

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
public interface InterfacePersona {
    
    public ArrayList<Curso> verCursos();
    
    public int[] verNotas();
}

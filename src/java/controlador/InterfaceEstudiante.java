/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author fabricio
 */
public interface InterfaceEstudiante extends InterfaceContrato {
    
    void setCarrera(String carrera);
    
    String getCarrera();
}

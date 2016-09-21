/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/** InterfaceContrator
 * Contrato que sera implementado por las vistas y referenciado por el 
 * presentador.
 * @author fabricio
 */
public interface InterfaceContrato {
    
    void setNombre();   
    String getNombre();
    
    void setDocumento();
    String getDocumento();
}

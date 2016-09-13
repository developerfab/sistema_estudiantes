/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author fabricio
 */
public class Materia {
    
    //ATRIBUTOS
    private String nombre;
    private int nivel;
    
    //CONSTRUCTOR
    public Materia(){
        
    }
    
    //METODOS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    /** crearMateria
     * Este metodo guarda la materia nueva en la base de datos
     * @return 
     */
    public boolean crearMateria(){
        return true;
    }
    
}

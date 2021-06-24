/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciapersona;

import javax.swing.JOptionPane;

/**
 *
 * @author NHerrera
 */
public class Persona {
    String nombre, apellido;
    int documento;
    
    public Persona (int documento, String nombre, String apellido){
        this.documento=documento;
        this.nombre=nombre;
        this.apellido=apellido;  
    }
   
    public void VerDatos(){
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciapersona;

//import javax.swing.JOptionPane;

/**
 *
 * @author Implementacion
 */
public class HerenciaPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        String nombreEstudiante=null, apellidoEstudiante="", nombreCarrera="Ingenieria", nombreSede=null;
        int documento, semestre;
        
        documento = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de documento del estudiante","Documento Estudiante",2));
        nombreEstudiante = JOptionPane.showInputDialog(null,"Digite el nombre del estudiante","Nombre Estudiante",2);
        apellidoEstudiante = JOptionPane.showInputDialog(null,"Digite el apellido del estudiante","Apellido Estudiante",2);
        nombreCarrera = JOptionPane.showInputDialog(null,"Digite el nombre de la carrera del estudiante","Nombre Carrera Estudiante",2);
        semestre = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de semestre del estudiante","Documento Estudiante",2));
        nombreSede = JOptionPane.showInputDialog(null,"Digite el numero de documento del estudiante","Documento Estudiante",2);

        Estudiante Est = new Estudiante(documento, nombreEstudiante, apellidoEstudiante, nombreCarrera, semestre, nombreSede);
        Est.VerDatos();
         */
        
    //instanciar un formulario java para capturar los datos de un estudiante
        FormularioMenu FM = new FormularioMenu();
        FM.setVisible(true);
    }
}

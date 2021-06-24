/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciapersona;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author NHerrera
 */
public class Estudiante extends Persona {
    String carrera, sede;
    int semestre;
    
    public Estudiante(int documento, String nombre, String apellido, String carrera, int semestre, String sede) {
        super(documento,nombre,apellido);
        this.carrera=carrera;
        this.semestre=semestre;
        this.sede=sede;
    }

    public void VerDatosEstudiante(){
    
        JOptionPane.showMessageDialog(null, "\nDocumento: "+documento+
                                            "\nnombre: "+nombre+
                                            "\napellido: "+apellido+
                                            "\ncarrera: "+carrera+
                                            "\nsede: "+sede+
                                            "\nsemestre: "+semestre+"\n\n", "Datos del Estudiante",1);
    
        try{
            FileWriter FW = new FileWriter("C:\\Users\\ASPIRE  -56AW\\Documents\\NetBeansProjects1\\HerenciaPersona\\Estudiante.txt",true);
            BufferedWriter BW = new BufferedWriter(FW);
            String datosEstudiante = documento + ";" + nombre + ";" + apellido + ";" + carrera + ";" + sede + ";" + semestre + ";";
            BW.write(datosEstudiante);
            BW.newLine();
            BW.close();
            JOptionPane.showMessageDialog(null, "Estudiante Registrado Correctamente");
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Archivo Estudiante.txt No Guardado = " + e);
        }
    }
    
    //Llamado Botón para guardar el archivo
    public void DatosEstudiante(){
    
        JOptionPane.showMessageDialog(null, "\nDocumento: "+documento+
                                            "\nnombre: "+nombre+
                                            "\napellido: "+apellido+
                                            "\ncarrera: "+carrera+
                                            "\nsede: "+sede+
                                            "\nsemestre: "+semestre+"\n\n", "Datos del estudiante",1);
        
        JFileChooser ruta = new JFileChooser();
                        //Nombre por default asignado al archivo
                        ruta.setSelectedFile(new File("JFileChoosser-Estudiante.txt"));
                        int estado = ruta.showSaveDialog(null);

        //Verifica si la ruta de guardado es válida
        if (estado == JFileChooser.APPROVE_OPTION) {
            File guardar =ruta.getSelectedFile();
            try{
                FileWriter FW = new FileWriter(guardar,true);
                try (BufferedWriter BW = new BufferedWriter(FW)) {
                    String datosEstudiante = documento + ";" + nombre + ";" + apellido + ";" + carrera + ";" + sede + ";" + semestre + ";";
                    BW.write(datosEstudiante);
                    BW.newLine();
                }
                JOptionPane.showMessageDialog(null, "Registro Guardado Correctamente");
            }catch(IOException e){
                JOptionPane.showMessageDialog(null, "Archivo No Guardado = " + e);
            }
         
        } else {
            //Sin selección de ruta para guardar archivo
            JOptionPane.showMessageDialog(null,"No seleccionó ningun directorio, el archivo no sera guardado. ");
        }
    }
}

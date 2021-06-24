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
public class Docente extends Persona {
    String programa, profesion, contrato;
    
    public Docente (int documento, String nombre, String apellido, String programa, String profesion, String contrato) {
        super(documento,nombre,apellido);
        this.programa=programa;
        this.profesion=profesion;
        this.contrato=contrato;
    }
    
    public void VerDatosDocente(){
    
        JOptionPane.showMessageDialog(null, "\nDocumento: "+documento+
                                            "\nnombre: "+nombre+
                                            "\napellido: "+apellido+
                                            "\nprograma: "+programa+
                                            "\nprofesion: "+profesion+
                                            "\ncontrato: "+contrato+"\n\n", "Datos del Docente",1);
        
        try{
            FileWriter FW = new FileWriter("C:\\Users\\ASPIRE  -56AW\\Documents\\NetBeansProjects1\\HerenciaPersona\\Docente.txt",true);
            BufferedWriter BW = new BufferedWriter(FW);
            String datosDocente = documento + ";" + nombre + ";" + apellido + ";" + programa + ";" + profesion + ";" + contrato + ";";
            BW.write(datosDocente);
            BW.newLine();
            BW.close();
            JOptionPane.showMessageDialog(null, "Docente Registrado Correctamente");
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Archivo Docente.txt No Guardado = " + e);
        }   
    }

    //Llamado Botón para guardar el archivo
    public void DatosDocente(){
        
        JOptionPane.showMessageDialog(null, "\nDocumento: "+documento+
                                            "\nnombre: "+nombre+
                                            "\napellido: "+apellido+
                                            "\nprograma: "+programa+
                                            "\nprofesion: "+profesion+
                                            "\ncontrato: "+contrato+"\n\n", "Datos del Docente",1);
        
        JFileChooser ruta = new JFileChooser();  
                        //Nombre por default asignado al archivo
                        ruta.setSelectedFile(new File("JFileChoosser-Docente.txt"));
                        int estado = ruta.showSaveDialog(null);
                        
        //Verifica si la ruta de guardado es válida
        if (estado == JFileChooser.APPROVE_OPTION) {
            File guardar =ruta.getSelectedFile();
            try{
                FileWriter FW = new FileWriter(guardar,true);
                try (BufferedWriter BW = new BufferedWriter(FW)) {
                    String datosDocente = documento + ";" + nombre + ";" + apellido + ";" + programa + ";" + profesion + ";" + contrato + ";";
                    BW.write(datosDocente);
                    BW.newLine();
                }
                JOptionPane.showMessageDialog(null, "Registro Guardado Correctamente");
            }catch(IOException e){
                JOptionPane.showMessageDialog(null, "Archivo No Guardado = " + e);
            }
         
        } else {
            //Sin selección de ruta para guardar archivo
            JOptionPane.showMessageDialog(null,"Selección no válida, archivo no Guardado");
        }
    }
}

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
public class Administrativo extends Persona {
    String area, cargo, sede;
    
    public Administrativo (int documento, String nombre, String apellido, String area, String cargo, String sede) {
        super(documento,nombre,apellido);
        this.area=area;
        this.cargo=cargo;
        this.sede=sede;
    }
    
		  
    public void VerDatosAdministrativo(){
    
        JOptionPane.showMessageDialog(null, "\nDocumento: "+documento+
                                            "\nnombre: "+nombre+
                                            "\napellido: "+apellido+
                                            "\narea: "+area+
                                            "\ncargo: "+cargo+
                                            "\nsede: "+sede+"\n\n", "Datos del administrativo",1);
        
        try{
            FileWriter FW = new FileWriter("C:\\Users\\ASPIRE  -56AW\\Documents\\NetBeansProjects1\\HerenciaPersona\\Administrativo.txt",true);
            BufferedWriter BW = new BufferedWriter(FW);
            String datosAdministrativo = documento + ";" + nombre + ";" + apellido + ";" + area + ";" + cargo + ";" + sede + ";";
            BW.write(datosAdministrativo);
            BW.newLine();
            BW.close();
            JOptionPane.showMessageDialog(null, "Administrativo Registrado Correctamente");
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Archivo Administrativo.txt No Guardado = " + e);
        }   
    }

    //Llamado Botón para guardar el archivo
    public void DatosAdministrativo(){
        
        JOptionPane.showMessageDialog(null, "\nDocumento: "+documento+
                                            "\nnombre: "+nombre+
                                            "\napellido: "+apellido+
                                            "\narea: "+area+
                                            "\ncargo: "+cargo+
                                            "\nsede: "+sede+"\n\n", "Datos del administrativo",1);
        
																																  
        JFileChooser ruta = new JFileChooser();  
                        //Nombre por default asignado al archivo
                        ruta.setSelectedFile(new File("JFileChoosser-Administrativo.txt"));																				
                        int estado = ruta.showSaveDialog(null);
                        
        //Verifica si la ruta de guardado es válida																			
        if (estado == JFileChooser.APPROVE_OPTION) {											   
            File guardar =ruta.getSelectedFile();
            try{
                FileWriter FW = new FileWriter(guardar,true);
                try (BufferedWriter BW = new BufferedWriter(FW)) {
                    String datosAdministrativo = documento + ";" + nombre + ";" + apellido + ";" + area + ";" + cargo + ";" + sede + ";";
                    BW.write(datosAdministrativo);
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

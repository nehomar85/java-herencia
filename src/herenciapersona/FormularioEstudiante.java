/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciapersona;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author NHerrera
 */
public class FormularioEstudiante extends javax.swing.JFrame {

    /**
     * Creates new form FormularioEstudiante
     */
    
    public FormularioEstudiante() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBotonSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextDocumento = new javax.swing.JTextField();
        jTextNombres = new javax.swing.JTextField();
        jTextApellidos = new javax.swing.JTextField();
        jLabelSemestre = new javax.swing.JLabel();
        jTextSemestre = new javax.swing.JTextField();
        jLabelCarrera = new javax.swing.JLabel();
        jTextCarrera = new javax.swing.JTextField();
        jLabelSede = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBoxSede = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Estudiantes");
        setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        setLocationByPlatform(true);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario Estudiante");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jBotonSalir.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jBotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/herenciapersona/exit2.png"))); // NOI18N
        jBotonSalir.setText("Salir");
        jBotonSalir.setToolTipText("");
        jBotonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonSalirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Documento:");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Nombres:");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Apellidos:");

        jTextDocumento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextDocumentoFocusLost(evt);
            }
        });

        jLabelSemestre.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabelSemestre.setText("Semestre:");

        jTextSemestre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextSemestreFocusLost(evt);
            }
        });

        jLabelCarrera.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabelCarrera.setText("Carrera:");

        jLabelSede.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabelSede.setText("Sede:");

        jButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/herenciapersona/Folder.png"))); // NOI18N
        jButton1.setText("Guardar (Ruta)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBoxSede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bogotá DC", "Mosquera" }));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel5.setText("Guardar (ruta fija)");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel6.setText("Guardar (seleccione ruta)");

        jButton2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/herenciapersona/Save.png"))); // NOI18N
        jButton2.setText("Guardar Registro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButtonConsultar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.setToolTipText("");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonEliminar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setToolTipText("");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonActualizar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.setToolTipText("");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonLimpiar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.setToolTipText("");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel5))
                                    .addComponent(jButton2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(213, 213, 213)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1)
                                            .addComponent(jLabel6))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabelCarrera)
                                        .addComponent(jLabelSede))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(140, 140, 140)
                                            .addComponent(jLabelSemestre)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextSemestre, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                                        .addComponent(jTextNombres, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextDocumento, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextApellidos, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextCarrera, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBoxSede, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(23, 23, 23)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonConsultar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonActualizar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonLimpiar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jBotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCarrera))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSede)
                    .addComponent(jComboBoxSede, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSemestre)
                    .addComponent(jTextSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jBotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonSalirActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jBotonSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nombre, apellido, carrera, sede;
        int documento, semestre, posicion;
        
        documento = Integer.parseInt(jTextDocumento.getText());
        nombre = jTextNombres.getText();
        apellido = jTextApellidos.getText();
        semestre = Integer.parseInt(jTextSemestre.getText());
        carrera = jTextCarrera.getText();
        posicion = jComboBoxSede.getSelectedIndex();
        sede = jComboBoxSede.getItemAt(posicion);
        
        Estudiante E = new Estudiante(documento, nombre, apellido, carrera, semestre, sede);
        
        E.DatosEstudiante();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextDocumentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextDocumentoFocusLost
        // TODO add your handling code here:
        ValidarNumerico(); 
    }//GEN-LAST:event_jTextDocumentoFocusLost
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         // TODO add your handling code here:
        String nombre, apellido, carrera, sede;
        int documento, semestre, posicion;
        
        documento = Integer.parseInt(jTextDocumento.getText());
        nombre = jTextNombres.getText();
        apellido = jTextApellidos.getText();
        semestre = Integer.parseInt(jTextSemestre.getText());
        carrera = jTextCarrera.getText();
        posicion = jComboBoxSede.getSelectedIndex();
        sede = jComboBoxSede.getItemAt(posicion);
        
        Estudiante E = new Estudiante(documento, nombre, apellido, carrera, semestre, sede);
        
        E.VerDatosEstudiante();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextSemestreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextSemestreFocusLost
        // TODO add your handling code here:
        ValidarNumericoSem(); 
    }//GEN-LAST:event_jTextSemestreFocusLost

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        // TODO add your handling code here:
        int documento, semestre;
        String nombre, apellido, carrera,posicion,sede;
        String datosArchivo, documentoStr;
        boolean encontro = false;
        String vector[] = null;
        documentoStr = jTextDocumento.getText();

        try{
            FileReader FR = new FileReader("C:\\Users\\ASPIRE  -56AW\\Documents\\NetBeansProjects1\\HerenciaPersona\\Estudiante.txt");
            BufferedReader BR = new BufferedReader(FR);
            datosArchivo = BR.readLine();

            while (datosArchivo != null){
                vector = datosArchivo.split(";");

                if (documentoStr.equals(vector[0])){
                    encontro=true;
                    break;
                }else{
                    datosArchivo = BR.readLine();
                }
            }

            if (encontro){
                jTextDocumento.setEnabled(false);
                jTextNombres.setText(vector[1]);
                jTextApellidos.setText(vector[2]);
                jTextCarrera.setText(vector[3]);
                jComboBoxSede.setSelectedItem(vector[4]);
                jTextSemestre.setText(vector[5]);
                JOptionPane.showMessageDialog(null, "Registro del Estudiante encontrado");
            }else{
                JOptionPane.showMessageDialog(null, "No se encontró registro del Estudiante en el archivo");
                //jButtonConsultar.setEnabled(false);
                //jTextDocumento.setEnabled(false);
                limpiarDatos();
            }
            BR.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "No es posible consultar el archivo");
        }
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        String documentoEliminar, datosRegistro;
        String [] datosEstudiante;
        boolean encontro = false;
        
        documentoEliminar = jTextDocumento.getText();

        try {
            File original = new File("C:\\Users\\ASPIRE  -56AW\\Documents\\NetBeansProjects1\\HerenciaPersona\\Estudiante.txt");
            File temporal = new File("C:\\Users\\ASPIRE  -56AW\\Documents\\NetBeansProjects1\\HerenciaPersona\\Estudiante-tmp.txt");
            
            FileReader FR = new FileReader(original);
            BufferedReader BR = new BufferedReader(FR);
            
            FileWriter FW = new FileWriter(temporal);
            BufferedWriter BW = new BufferedWriter(FW);

            datosRegistro = BR.readLine();  //se lee el registro del archivo
            
            while (datosRegistro != null){
                datosEstudiante = datosRegistro.split(";");
                
                if (documentoEliminar.equals(datosEstudiante[0])){  //validar si existe el documento
                    encontro = true;
                } else {
                    BW.write(datosRegistro);    //Graba en el archivo temporal
                    BW.newLine();
                }
                
                datosRegistro = BR.readLine();
            }
            
            BR.close();
            BW.close();
            
            if (encontro){
                original.delete();              //Se borra el archivo original
                temporal.renameTo(original);    //renombra el tmp por el original            
                JOptionPane.showMessageDialog(null, "Registro de Estudiante eliminado");
                limpiarDatos();
            } else {
                temporal.delete();
                JOptionPane.showMessageDialog(null, "Registro de Estudiante no eliminado");
            }
            
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No es posible abrir el archivo");
        } catch (IOException | IOError ex) {
            JOptionPane.showMessageDialog(null, "No es posible leer el archivo");
        }
        
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        // TODO add your handling code here:
        String documentoEliminar, datosRegistro;
        String [] datosEstudiante;
        boolean encontro = false;
        
        documentoEliminar = jTextDocumento.getText();

        try {
            File original = new File("C:\\Users\\ASPIRE  -56AW\\Documents\\NetBeansProjects1\\HerenciaPersona\\Estudiante.txt");
            File temporal = new File("C:\\Users\\ASPIRE  -56AW\\Documents\\NetBeansProjects1\\HerenciaPersona\\Estudiante-tmp.txt");
            
            FileReader FR = new FileReader(original);
            BufferedReader BR = new BufferedReader(FR);
            
            FileWriter FW = new FileWriter(temporal);
            BufferedWriter BW = new BufferedWriter(FW);

            datosRegistro = BR.readLine();  //se lee el registro del archivo
            
            while (datosRegistro != null){
                datosEstudiante = datosRegistro.split(";");
                
                if (documentoEliminar.equals(datosEstudiante[0])){  //validar si existe el documento
                    String datosEstudianteUpd, nombre, apellido, carrera, sede;
                    int documento, semestre, posicion;

                    documento = Integer.parseInt(jTextDocumento.getText());
                    jTextDocumento.setEnabled(false);
                    nombre = jTextNombres.getText();
                    apellido = jTextApellidos.getText();
                    semestre = Integer.parseInt(jTextSemestre.getText());
                    carrera = jTextCarrera.getText();
                    posicion = jComboBoxSede.getSelectedIndex();
                    sede = jComboBoxSede.getItemAt(posicion);
                    
                    datosEstudianteUpd  = documento + ";" + nombre + ";" + apellido + ";" + carrera + ";" + sede + ";" + semestre + ";";
                    BW.write(datosEstudianteUpd);
                    BW.newLine();

                    encontro = true;
                } else {
                    BW.write(datosRegistro);    //Graba en el archivo temporal
                    BW.newLine();
                }
                
                datosRegistro = BR.readLine();
            }
            
            BR.close();
            BW.close();
            
            if (encontro){
                original.delete();              //Se borra el archivo original
                temporal.renameTo(original);    //renombra el tmp por el original            
                JOptionPane.showMessageDialog(null, "Registro de Estudiante Actualizado");
            } else {
                temporal.delete();
                JOptionPane.showMessageDialog(null, "Registro de Estudiante no Actualizado");
            }
            
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No es posible abrir el archivo");
        } catch (IOException | IOError ex) {
            JOptionPane.showMessageDialog(null, "No es posible leer el archivo");
        }
        
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarDatos();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    //Validación Dato Numérico Documento
    public void ValidarNumerico(){
        int documento=0;
        try{
            documento=Integer.parseInt(jTextDocumento.getText());
        }catch(NumberFormatException e){
            //JOptionPane.showMessageDialog(null,"Error! Debe ingresar sólo datos numéricos");
            jTextDocumento.setText(null);
            jTextDocumento.grabFocus();
        }   
        
    }
    
    //Validación Dato Numérico Semestre
    public void ValidarNumericoSem(){
        int semestre=0;
        try{
            semestre=Integer.parseInt(jTextSemestre.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error! Debe ingresar sólo datos numéricos");
            jTextSemestre.setText(null);
            jTextSemestre.grabFocus();
        }   
        
    }
    
    //Limpiar Datos
    public void limpiarDatos(){
        jTextDocumento.setEnabled(true);
        jTextDocumento.setText(null);
        jTextNombres.setText(null);
        jTextApellidos.setText(null);
        jTextCarrera.setText(null);
        jComboBoxSede.setSelectedIndex(0);
        jTextSemestre.setText(null);
        jButtonConsultar.setEnabled(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JComboBox<String> jComboBoxSede;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelCarrera;
    private javax.swing.JLabel jLabelSede;
    private javax.swing.JLabel jLabelSemestre;
    private javax.swing.JTextField jTextApellidos;
    private javax.swing.JTextField jTextCarrera;
    private javax.swing.JTextField jTextDocumento;
    private javax.swing.JTextField jTextNombres;
    private javax.swing.JTextField jTextSemestre;
    // End of variables declaration//GEN-END:variables
}

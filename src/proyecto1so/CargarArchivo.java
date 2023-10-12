/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto1so;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author dianasilvadeornelas
 */
public class CargarArchivo extends javax.swing.JFrame {

    /**
     * Creates new form CargarArchivo
     */
    int auxDuracionDia;
    static int auxDiasDespacho;
    
    int auxDriveMaxGuiones;
    int auxDriveMaxNiveles;
    int auxDriveMaxSprites;
    int auxDriveMaxSistemas;
    int auxDriveMaxDLC;
    
    int auxMaxDevelopersGuiones;
    int auxMaxDevelopersNiveles;
    int auxMaxDevelopersSprites;
    int auxMaxDevelopersSistemas;
    int auxMaxDevelopersDLC;
    
    int auxDevelopersGuiones;
    int auxDevelopersNiveles;
    int auxDevelopersSprites;
    int auxDevelopersSistemas;
    int auxDevelopersDLC;
   
    int auxIntegradores;
    
    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    Archivo a = new Archivo();
    Interfaz i;

    public CargarArchivo(Interfaz i) {
        initComponents();
        this.setResizable(false);
        this.setTitle("Archivos");
        this.i=i;
    }
    
    


    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Abrir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Abrir.setText("Abrir Archivo");
        Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirActionPerformed(evt);
            }
        });
        jPanel1.add(Abrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 140, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed
        // TODO add your handling code here:
        
        if (seleccionado.showDialog(this, "Abrir Archivo") == JFileChooser.APPROVE_OPTION) {

            archivo = seleccionado.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {

                    String contenido = a.Abrir(archivo);
                    jTextArea1.setText(contenido);

                    try {

                        BufferedReader bf = new BufferedReader(new FileReader(seleccionado.getSelectedFile().toString()));
                        String aux;
                        String bfRead = bf.readLine();
                        aux = bfRead; //linea
                        
                        while (aux != null) {

                            if (aux.equalsIgnoreCase("Developers Guiones")) {
                                do {
                                    aux = bf.readLine();
                                    if (!aux.equalsIgnoreCase("Developers Niveles")) {
                                         
                                        auxDevelopersGuiones = Integer.parseInt(aux);
                                        i.developersGuiones = this.auxDevelopersGuiones;
                                        i.txtGuiones.setText(Integer.toString(i.developersGuiones));
                                        auxDriveMaxGuiones = 25; 
                                        i.txtMaxDriveGuiones.setText(Integer.toString(this.auxDriveMaxGuiones));
                                        

                                    }

                                } while (!aux.equalsIgnoreCase("Developers Niveles"));

                            }
                                if (aux.equalsIgnoreCase("Developers Niveles")) {
                                do {

                                    aux = bf.readLine();
                                    if (!aux.equalsIgnoreCase("Developers Sprites")) {
                                     
                                        auxDevelopersNiveles = Integer.parseInt(aux);
                                        i.developersNiveles = this.auxDevelopersNiveles;
                                        i.txtNiveles.setText(Integer.toString(i.developersNiveles));
                                        auxDriveMaxNiveles = 20; 
                                        i.txtMaxDriveNiveles.setText(Integer.toString(this.auxDriveMaxNiveles));

                                    }

                                } while (!aux.equalsIgnoreCase("Developers Sprites"));

                            }
                                if (aux.equalsIgnoreCase("Developers Sprites")) {
                                do {
                                    aux = bf.readLine();
                                    if (!aux.equalsIgnoreCase("Developers Sistemas")) {
                                        auxDevelopersSprites = Integer.parseInt(aux);
                                        i.developersSprites = this.auxDevelopersSprites;
                                        i.txtSprites.setText(Integer.toString(i.developersSprites));
                                        auxDriveMaxSprites = 55; 
                                        i.txtMaxDriveSprites.setText(Integer.toString(this.auxDriveMaxSprites));
                                    }
                                } while (!aux.equalsIgnoreCase("Developers Sistemas"));
  
                            }
                                if (aux.equalsIgnoreCase("Developers Sistemas")) {
                                do {
                                    aux = bf.readLine();
                                    if (!aux.equalsIgnoreCase("Developers DLC")) {
                                        auxDevelopersSistemas = Integer.parseInt(aux);
                                        i.developersSistemas = this.auxDevelopersSistemas;
                                        i.txtSistemas.setText(Integer.toString(i.developersSistemas));
                                        auxDriveMaxSistemas = 35; 
                                        i.txtMaxDriveSistemas.setText(Integer.toString(this.auxDriveMaxSistemas));
                                    }
                                } while (!aux.equalsIgnoreCase("Developers DLC"));
                                 
                            }
                                 if (aux.equalsIgnoreCase("Developers DLC")) {
                                do {
                                    aux = bf.readLine();
                                    if (!aux.equalsIgnoreCase("Duracion dia")) {
                                        auxDevelopersDLC = Integer.parseInt(aux);
                                        i.developersDLC = this.auxDevelopersDLC;
                                        i.txtDLC.setText(Integer.toString(i.developersDLC));
                                        auxDriveMaxDLC = 10; 
                                        i.txtMaxDriveDLC.setText(Integer.toString(this.auxDriveMaxDLC));
                                    }
                                } while (!aux.equalsIgnoreCase("Duracion dia"));
                            }
                                 if (aux.equalsIgnoreCase("Duracion Dia")) {
                                do {
                                    aux = bf.readLine();
                                    if (!"Dias para Despacho".equalsIgnoreCase(aux)) {
                                     
                                        auxDuracionDia = Integer.parseInt(aux);
                                        i.diaDuracion = 1000 * this.auxDuracionDia;
                                    }
                                } while (!"Dias para Despacho".equalsIgnoreCase(aux));
                            }
                                 
                                 if (aux.equalsIgnoreCase("Dias para Despacho")) {
                                do {
                                    aux = bf.readLine();
                                    if (!"Integradores".equalsIgnoreCase(aux)) {
                                      
                                        auxDiasDespacho = Integer.parseInt(aux);
                                        i.diasDespacho = CargarArchivo.auxDiasDespacho;

                                        i.txtDiasDespacho.setText(Integer.toString(i.diasDespacho));
                                    }
                                } while (!"Integradores".equalsIgnoreCase(aux));
                            }
                                 if (aux.equalsIgnoreCase("Integradores")) {
                                do {
                                    aux = bf.readLine();
                                    if (aux != null) {
                                       
                                        auxIntegradores = Integer.parseInt(aux);
                                        i.integrador = this.auxIntegradores;
                                        i.txtCantIntegradores.setText(Integer.toString(i.integrador));

                                     }
                                } while (aux != null);
                            }
                            aux = bf.readLine();
                        }
                         this.i.cargado=true;
                        this.i.home.chequearArchivos();

                    } catch (IOException | NumberFormatException e) {

                        JOptionPane.showMessageDialog(this, "No se pudo leer el archivo. Vuelva a Intentarlo");
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Por favor seleccione un archivo de texto");
                }
                
                if ((auxIntegradores + auxDevelopersGuiones + auxDevelopersNiveles + auxDevelopersSprites + auxDevelopersSistemas + auxDevelopersDLC) >= 16){
                    JOptionPane.showMessageDialog(null, "Error: La suma es mayor o igual a 16", "Error", JOptionPane.ERROR_MESSAGE);
                    
                }

            }

        }

         
        
    }//GEN-LAST:event_AbrirActionPerformed

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
            java.util.logging.Logger.getLogger(CargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarArchivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
         
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abrir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

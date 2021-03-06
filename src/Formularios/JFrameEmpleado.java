/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Archivos.ArchivoEmpleado;
import Identidades.Empleado;
import Listas.ListaEmpleado;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author estefania
 */
public class JFrameEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form JFrameEmpleado
     */
    private ListaEmpleado le;
    private Empleado e;
    private Date fechaNacimiento;
    private Date fechaTitulacion;
    private Date fechaContratacion;
    private ArchivoEmpleado ae;

    public JFrameEmpleado() {
        fechaNacimiento = new Date();
        fechaTitulacion = new Date();
        fechaContratacion = new Date();
        
        this.setVisible(true);
        initComponents();
        /*
         jdFechaNacimiento.setDate(null);
         jdFechaTitulacion.setDate(null);
         jdFechaContratacion.setDate(null);
         */
        le = new ListaEmpleado();
        ae= new ArchivoEmpleado(le);
        ae.abrir();
        ae.listar();
        le= ae.getLe();
        
        
        e = new Empleado();
        this.validacionCampos();
        repaint();

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
        jlDocumento = new javax.swing.JLabel();
        jlPrimerNombre = new javax.swing.JLabel();
        jlPrimerApellido = new javax.swing.JLabel();
        jlTipoSangre = new javax.swing.JLabel();
        jlTipoDocumento = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlFactorRH = new javax.swing.JLabel();
        jtDocumento = new javax.swing.JTextField();
        jtPrimerNombre = new javax.swing.JTextField();
        jtSegundoNombre = new javax.swing.JTextField();
        jtPrimerApellido = new javax.swing.JTextField();
        jtSegundoApellido = new javax.swing.JTextField();
        jcTipoDocumento = new javax.swing.JComboBox();
        jcTipoSangre = new javax.swing.JComboBox();
        cjFactorRH = new javax.swing.JComboBox();
        jlFechaNacimiento = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtCiudadNacimiento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtDepartamento = new javax.swing.JTextField();
        jdFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jlDireccion = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jlCorreo = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtCorreo = new javax.swing.JTextField();
        jtMovil = new javax.swing.JTextField();
        jtDireccion = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jlProfesion = new javax.swing.JLabel();
        jlFechaTitulacion = new javax.swing.JLabel();
        jtProfesion = new javax.swing.JTextField();
        jdFechaTitulacion = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jlCargo = new javax.swing.JLabel();
        jlFechaContrato = new javax.swing.JLabel();
        jlTipoContrato = new javax.swing.JLabel();
        jtCargo = new javax.swing.JTextField();
        jcTipoContrato = new javax.swing.JComboBox();
        jdFechaContratacion = new com.toedter.calendar.JDateChooser();
        jbGuardar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbListar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbActivar = new javax.swing.JButton();
        jbVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestionar Empleado");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1300, 520));
        setPreferredSize(new java.awt.Dimension(1300, 520));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Personales"));
        jPanel1.setLayout(null);

        jlDocumento.setText("*Documento");
        jPanel1.add(jlDocumento);
        jlDocumento.setBounds(20, 30, 100, 20);

        jlPrimerNombre.setText("*Primer Nombre");
        jPanel1.add(jlPrimerNombre);
        jlPrimerNombre.setBounds(20, 60, 110, 20);

        jlPrimerApellido.setText("*Primer Apellido");
        jPanel1.add(jlPrimerApellido);
        jlPrimerApellido.setBounds(20, 100, 120, 20);

        jlTipoSangre.setText("*Tipo de Sangre");
        jPanel1.add(jlTipoSangre);
        jlTipoSangre.setBounds(20, 190, 120, 20);

        jlTipoDocumento.setText("*Tipo de Documento");
        jPanel1.add(jlTipoDocumento);
        jlTipoDocumento.setBounds(317, 30, 120, 14);

        jLabel6.setText("Segundo Nombre");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(317, 64, 110, 20);

        jLabel7.setText("Segundo Apellido");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(317, 102, 110, 20);

        jlFactorRH.setText("*Factor RH");
        jPanel1.add(jlFactorRH);
        jlFactorRH.setBounds(320, 190, 90, 20);
        jPanel1.add(jtDocumento);
        jtDocumento.setBounds(180, 20, 120, 30);
        jPanel1.add(jtPrimerNombre);
        jtPrimerNombre.setBounds(180, 60, 120, 30);
        jPanel1.add(jtSegundoNombre);
        jtSegundoNombre.setBounds(449, 57, 140, 30);
        jPanel1.add(jtPrimerApellido);
        jtPrimerApellido.setBounds(180, 100, 120, 30);
        jPanel1.add(jtSegundoApellido);
        jtSegundoApellido.setBounds(449, 95, 140, 30);

        jcTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "C.C", "CE" }));
        jPanel1.add(jcTipoDocumento);
        jcTipoDocumento.setBounds(449, 17, 140, 30);

        jcTipoSangre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "O", "AB" }));
        jPanel1.add(jcTipoSangre);
        jcTipoSangre.setBounds(180, 190, 120, 30);

        cjFactorRH.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "POSITIVO(+)", "NEGATIVO(-)" }));
        jPanel1.add(cjFactorRH);
        cjFactorRH.setBounds(450, 190, 140, 30);

        jlFechaNacimiento.setText("*Fecha de Nacimiento");
        jPanel1.add(jlFechaNacimiento);
        jlFechaNacimiento.setBounds(20, 140, 150, 20);

        jLabel10.setText("Ciudad de Nacimiento");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(317, 138, 130, 20);
        jPanel1.add(jtCiudadNacimiento);
        jtCiudadNacimiento.setBounds(449, 131, 140, 30);

        jLabel11.setText("Departamento");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 240, 100, 20);
        jPanel1.add(jtDepartamento);
        jtDepartamento.setBounds(180, 240, 120, 30);
        jPanel1.add(jdFechaNacimiento);
        jdFechaNacimiento.setBounds(180, 140, 120, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 620, 280);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Contacto", 0, 0, null, new java.awt.Color(51, 51, 51)));
        jPanel2.setLayout(null);

        jlDireccion.setText("*Direccion");
        jPanel2.add(jlDireccion);
        jlDireccion.setBounds(16, 30, 80, 14);

        jLabel13.setText("Telefono Fijo");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(16, 68, 90, 14);

        jlCorreo.setText("*Correo Electronico");
        jPanel2.add(jlCorreo);
        jlCorreo.setBounds(270, 30, 110, 14);

        jLabel15.setText("Telefono Movil");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(280, 70, 90, 14);
        jPanel2.add(jtCorreo);
        jtCorreo.setBounds(390, 20, 180, 30);
        jPanel2.add(jtMovil);
        jtMovil.setBounds(390, 60, 180, 30);

        jtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDireccionActionPerformed(evt);
            }
        });
        jPanel2.add(jtDireccion);
        jtDireccion.setBounds(100, 20, 150, 30);

        jtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTelefonoActionPerformed(evt);
            }
        });
        jPanel2.add(jtTelefono);
        jtTelefono.setBounds(100, 60, 150, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(660, 10, 590, 130);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Formacion Academica"));
        jPanel3.setLayout(null);

        jlProfesion.setText("*Profesión");
        jPanel3.add(jlProfesion);
        jlProfesion.setBounds(16, 30, 80, 14);

        jlFechaTitulacion.setText("*Fecha de Titulación");
        jPanel3.add(jlFechaTitulacion);
        jlFechaTitulacion.setBounds(250, 30, 140, 14);
        jPanel3.add(jtProfesion);
        jtProfesion.setBounds(105, 27, 130, 30);
        jPanel3.add(jdFechaTitulacion);
        jdFechaTitulacion.setBounds(390, 30, 150, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(670, 160, 560, 120);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Laborales"));
        jPanel4.setLayout(null);

        jlCargo.setText("*Cargo");
        jPanel4.add(jlCargo);
        jlCargo.setBounds(16, 30, 100, 14);

        jlFechaContrato.setText("*Fecha de Contratación");
        jPanel4.add(jlFechaContrato);
        jlFechaContrato.setBounds(319, 30, 140, 14);

        jlTipoContrato.setText("*Tipo de Contrato");
        jPanel4.add(jlTipoContrato);
        jlTipoContrato.setBounds(10, 60, 130, 14);
        jPanel4.add(jtCargo);
        jtCargo.setBounds(185, 17, 120, 30);

        jcTipoContrato.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DEFINIDO", "INDEFINIDO", "LABOR", "APRENDIZAJE" }));
        jPanel4.add(jcTipoContrato);
        jcTipoContrato.setBounds(185, 65, 95, 20);
        jPanel4.add(jdFechaContratacion);
        jdFechaContratacion.setBounds(465, 17, 170, 30);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(20, 320, 660, 120);

        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/save.png"))); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jbGuardar);
        jbGuardar.setBounds(700, 300, 120, 30);

        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/copy.png"))); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jbModificar);
        jbModificar.setBounds(850, 300, 120, 30);

        jbListar.setText("Listar");
        jbListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarActionPerformed(evt);
            }
        });
        getContentPane().add(jbListar);
        jbListar.setBounds(860, 360, 100, 30);

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/Search.png"))); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jbBuscar);
        jbBuscar.setBounds(990, 300, 120, 30);

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/remove.png"))); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jbEliminar);
        jbEliminar.setBounds(1120, 300, 110, 30);

        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/broom.png"))); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jbLimpiar);
        jbLimpiar.setBounds(990, 360, 120, 30);

        jbActivar.setText("Listar Todos");
        jbActivar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbActivarMouseEntered(evt);
            }
        });
        jbActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActivarActionPerformed(evt);
            }
        });
        getContentPane().add(jbActivar);
        jbActivar.setBounds(720, 360, 110, 30);

        jbVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/return.png"))); // NOI18N
        jbVolver.setText("Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jbVolver);
        jbVolver.setBounds(1120, 360, 110, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTelefonoActionPerformed

    private void jtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDireccionActionPerformed

    private void jbActivarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbActivarMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_jbActivarMouseEntered

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:

        if (!this.validacionObligatorios()) {
            if (validarEmail(jtCorreo.getText())) {
                int n = 6570;

                if (this.diferenciasDeFechas(jdFechaNacimiento.getDate(), new Date()) > n) {

                    if (!le.existe(jtDocumento.getText())) {
                        e = extraerDatos();
                        if (le.setEmpleado(e)) {
                            JOptionPane.showMessageDialog(this, "El Empleado a sido guardado");
                            limpiarCampos();
                        } else {
                            JOptionPane.showMessageDialog(this, "No se pudo guadar el empleado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "El empleado ya existe");

                    }
                } else {
                    JOptionPane.showMessageDialog(this, "El empleado debe ser mayor de edad");
                    jlFechaNacimiento.setForeground(Color.red);
                }
            } else {
                JOptionPane.showMessageDialog(this, "El Correo electronico no es valido");
                jlCorreo.setForeground(Color.red);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Complete o verifique los campos obligatorios");
        }

        repaint();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
        //String s= JOptionPane.showInputDialog(this,"Ingrese el documento del empleado");
        if (!this.validacionObligatorios()) {
            if (validarEmail(jtCorreo.getText())) {
                int n = 6570;
                if (this.diferenciasDeFechas(jdFechaNacimiento.getDate(), new Date()) > n) {
                    if (le.existe(jtDocumento.getText())) {
                        e = extraerDatos();
                        if (le.modificar(e)) {
                            JOptionPane.showMessageDialog(this, "El Empleado a sido modificado");
                            limpiarCampos();
                        } else {
                            JOptionPane.showMessageDialog(this, "No se pudo modificar el empleado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "El empleado no existe");

                    }
                } else {
                    JOptionPane.showMessageDialog(this, "El empleado debe ser mayor de edad");
                    jlFechaNacimiento.setForeground(Color.red);
                }
            } else {
                JOptionPane.showMessageDialog(this, "El Correo electronico no es valido");
                jlCorreo.setForeground(Color.red);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Complete los campos obligatorios");
        }
        repaint();


    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        String s = JOptionPane.showInputDialog(this, "Ingrese el documento del empleado");
        if (le.existe(s)) {
            e = le.getEmpleado(s);
            if (e != null) {
                this.llenarCampos(e);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontro el empleado");
            }
        } else {
            JOptionPane.showMessageDialog(this, "El empleado no existe");

        }
        repaint();


    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        String s = JOptionPane.showInputDialog(this, "Ingrese el documento del empleado");
        if (le.existe(s)) {

            if (le.eliminarEmpleado(s)) {
                JOptionPane.showMessageDialog(this, "El Empleado a sido eliminado");
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar el empleado");
            }
        } else {
            JOptionPane.showMessageDialog(this, "El empleado no existe");

        }
        repaint();

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
        this.limpiarCampos();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        // TODO add your handling code here:s
        int i = JOptionPane.showConfirmDialog(this, "¿Estas se guro que deseas salir?");
        if (i == 0) {
            ae.guardar(le);
            this.dispose();
        }
        

    }//GEN-LAST:event_jbVolverActionPerformed

    private void jbListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarActionPerformed
        // TODO add your handling code here:
         ListaEmpleado le;
        ArchivoEmpleado ae;
         le = new ListaEmpleado();
        ae= new ArchivoEmpleado(le);
        ae.abrir();
        ae.listar();
        le= ae.getLe();
        String s= JOptionPane.showInputDialog(this,"Ingresa el numero de documento para crear un reporte");
        if(le.existe(s))
        {
            new JFrameReporte(s);
        }
        else
        {
            JOptionPane.showMessageDialog(this,"El empleado no existe");
        }
    }//GEN-LAST:event_jbListarActionPerformed

    private void jbActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActivarActionPerformed
        // TODO add your handling code here:
        
        
        new JFrameReporte();
    }//GEN-LAST:event_jbActivarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cjFactorRH;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbActivar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbListar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JComboBox jcTipoContrato;
    private javax.swing.JComboBox jcTipoDocumento;
    private javax.swing.JComboBox jcTipoSangre;
    private com.toedter.calendar.JDateChooser jdFechaContratacion;
    private com.toedter.calendar.JDateChooser jdFechaNacimiento;
    private com.toedter.calendar.JDateChooser jdFechaTitulacion;
    private javax.swing.JLabel jlCargo;
    private javax.swing.JLabel jlCorreo;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlDocumento;
    private javax.swing.JLabel jlFactorRH;
    private javax.swing.JLabel jlFechaContrato;
    private javax.swing.JLabel jlFechaNacimiento;
    private javax.swing.JLabel jlFechaTitulacion;
    private javax.swing.JLabel jlPrimerApellido;
    private javax.swing.JLabel jlPrimerNombre;
    private javax.swing.JLabel jlProfesion;
    private javax.swing.JLabel jlTipoContrato;
    private javax.swing.JLabel jlTipoDocumento;
    private javax.swing.JLabel jlTipoSangre;
    private javax.swing.JTextField jtCargo;
    private javax.swing.JTextField jtCiudadNacimiento;
    private javax.swing.JTextField jtCorreo;
    private javax.swing.JTextField jtDepartamento;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtDocumento;
    private javax.swing.JTextField jtMovil;
    private javax.swing.JTextField jtPrimerApellido;
    private javax.swing.JTextField jtPrimerNombre;
    private javax.swing.JTextField jtProfesion;
    private javax.swing.JTextField jtSegundoApellido;
    private javax.swing.JTextField jtSegundoNombre;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables

    public void limpiarCampos() {
        jtCargo.setText("");
        jtCiudadNacimiento.setText("");
        jtCorreo.setText("");
        jtDepartamento.setText("");
        jtDireccion.setText("");
        jtDocumento.setText("");
        jtMovil.setText("");
        jtPrimerApellido.setText("");
        jtPrimerNombre.setText("");
        jtProfesion.setText("");
        jtSegundoApellido.setText("");
        jtSegundoNombre.setText("");
        jtTelefono.setText("");
        jtDocumento.setEnabled(true);
        jdFechaContratacion.setEnabled(true);
        jcTipoDocumento.setSelectedIndex(0);
        jcTipoSangre.setSelectedIndex(0);
        jcTipoContrato.setSelectedIndex(0);
        cjFactorRH.setSelectedIndex(0);
        jdFechaNacimiento.setDate(null);
        jdFechaTitulacion.setDate(null);
        jdFechaContratacion.setDate(null);

        repaint();
    }

    public void llenarCampos(Empleado e) {
        jtCargo.setText(e.getCargo());
        jtCiudadNacimiento.setText(e.getCiudadNacimiento());
        jtCorreo.setText(e.getCorreo());
        jtDepartamento.setText(e.getDepartamento());
        jtDireccion.setText(e.getDireccion());
        jtDocumento.setText(e.getDocumento());
        jtMovil.setText(e.getMovil());
        jtPrimerApellido.setText(e.getPrimerApellido());
        jtPrimerNombre.setText(e.getPrimerNombre());
        jtProfesion.setText(e.getProfesion());
        jtSegundoApellido.setText(e.getSegundoApellido());
        jtSegundoNombre.setText(e.getSegundoNombre());
        jtTelefono.setText(e.getTelefono());
        jtDocumento.setEnabled(false);
        jcTipoDocumento.setSelectedItem(e.getTipoDocumento());
        jcTipoSangre.setSelectedItem(e.getTipoSangre());
        jcTipoContrato.setSelectedItem(e.getTipoContrato());
        cjFactorRH.setSelectedItem(e.getFactorRH());

        System.out.println(e.getFechaNacimiento());
        fechaNacimiento = this.deStringToDate(e.getFechaNacimiento());
        fechaTitulacion = this.deStringToDate(e.getFechaTitulo());
        fechaContratacion = this.deStringToDate(e.getFechaContratacion());

        jdFechaNacimiento.setDate(fechaNacimiento);
        jdFechaTitulacion.setDate(fechaTitulacion);
        jdFechaContratacion.setDate(fechaContratacion);

        jdFechaContratacion.setEnabled(false);
        repaint();
    }

    public Empleado extraerDatos() {
        Empleado e = new Empleado();
        e.setCiudadNacimiento(jtCiudadNacimiento.getText());
        e.setCorreo(jtCorreo.getText());
        e.setDepartamento(jtDepartamento.getText());
        e.setDireccion(jtDireccion.getText());
        e.setDocumento(jtDocumento.getText());
        e.setMovil(jtMovil.getText());
        e.setPrimerApellido(jtPrimerApellido.getText());
        e.setSegundoApellido(jtSegundoApellido.getText());
        e.setPrimerNombre(jtPrimerNombre.getText());
        e.setSegundoNombre(jtSegundoNombre.getText());
        e.setTelefono(jtTelefono.getText());
        e.setProfesion(jtProfesion.getText());
        e.setCargo(jtCargo.getText());
        e.setTipoDocumento(jcTipoDocumento.getSelectedItem().toString());
        e.setTipoSangre(jcTipoSangre.getSelectedItem().toString());
        e.setTipoContrato(jcTipoContrato.getSelectedItem().toString());
        e.setFactorRH(cjFactorRH.getSelectedItem().toString());

        //System.out.println(jdFechaNacimiento.getDate().toString());
        fechaNacimiento = jdFechaNacimiento.getDate();

        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        e.setFechaNacimiento(formateador.format(fechaNacimiento));

        fechaTitulacion = jdFechaTitulacion.getDate();
        e.setFechaTitulo(formateador.format(fechaTitulacion));

        fechaContratacion = jdFechaContratacion.getDate();
        e.setFechaContratacion(formateador.format(fechaContratacion));

        /*System.out.println(jdFechaNacimiento.getDate().toString());
         Date fecha= deStringToDate("12-10-2003");
         System.out.println(fecha.toString());
         jdFechaNacimiento.setDate(fecha);
         */
        return e;
    }

    public void inhabilitarCampos() {

        jtCargo.enable();
        jtCiudadNacimiento.setText(e.getCiudadNacimiento());
        jtCorreo.setText(e.getCorreo());
        jtDepartamento.setText(e.getDepartamento());
        jtDireccion.setText(e.getDireccion());
        jtDocumento.setText(e.getDocumento());
        jtMovil.setText(e.getMovil());
        jtPrimerApellido.setText(e.getPrimerApellido());
        jtPrimerNombre.setText(e.getPrimerNombre());
        jtProfesion.setText(e.getProfesion());
        jtSegundoApellido.setText(e.getSegundoApellido());
        jtSegundoNombre.setText(e.getSegundoNombre());
        jtTelefono.setText(e.getTelefono());
        jtDocumento.setEnabled(false);
        repaint();

    }

    public void validarLongitud(int l, JTextField j, java.awt.event.KeyEvent e) {

        if (j.getText().length() == l) {
            e.consume();
        }

    }

    public void soloNumeros(JTextField j, java.awt.event.KeyEvent e) {
        char caracter = e.getKeyChar();//lee el caracter presionado
        int numero = (int) (caracter);
        if (numero == 10)//para activar letra enter
        {
            j.requestFocus();
        }
        if (((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE) && (numero != 32)) {
            e.consume();  // ignorar el evento de teclado
        }
    }

    public void soloLetras(JTextField j, java.awt.event.KeyEvent e) {
        char caracter = e.getKeyChar(); // para leer el caracter correspondiente a la tecla
        int numero = (int) (caracter);
        if (numero == 10)// PARA LA TECLA ENTER
        {
            j.requestFocus();
        }
        if (((caracter < 'A') || (caracter > 'Z')) && ((caracter < 'a') || (caracter > 'z')) && (caracter != KeyEvent.VK_BACK_SPACE) && (numero != 32)) {
            e.consume();  // ignorar el evento de teclado
        }
    }

    private boolean validacionObligatorios() {
        boolean sw = false;
        JTextField vec[];
        vec = new JTextField[7];
        JLabel vec2[];
        vec2 = new JLabel[7];

        vec[0] = jtDocumento;
        vec[1] = jtPrimerNombre;
        vec[2] = jtPrimerApellido;
        vec[3] = jtDireccion;
        vec[4] = jtCorreo;
        vec[5] = jtProfesion;
        vec[6] = jtCargo;

        vec2[0] = jlDocumento;
        vec2[1] = jlPrimerNombre;
        vec2[2] = jlPrimerApellido;
        vec2[3] = jlDireccion;
        vec2[4] = jlCorreo;
        vec2[5] = jlProfesion;
        vec2[6] = jlCargo;

        for (int i = 0; i < vec.length; i++) {
            vec2[i].setForeground(Color.BLACK);
        }
        for (int i = 0; i < vec.length; i++) {
            if (vec[i].getText().equals("")) {
                vec2[i].setForeground(Color.red);
                repaint();
                sw = true;
            }
        }
        jlFechaNacimiento.setForeground(Color.BLACK);
        jlFechaTitulacion.setForeground(Color.BLACK);
        jlFechaContrato.setForeground(Color.BLACK);
        try {
            if (jdFechaNacimiento.getDate() == null) {
                jlFechaNacimiento.setForeground(Color.red);
                sw = true;
            }
            if (jdFechaTitulacion.getDate() == null) {
                jlFechaTitulacion.setForeground(Color.red);
                sw = true;
            }

            if (jdFechaContratacion.getDate() == null) {
                jlFechaContrato.setForeground(Color.red);
                sw = true;
            }
        } catch (NullPointerException ex) {
            sw = true;
            System.out.println("error al validar fechas");
        }

        repaint();
        return sw;
    }

    public boolean validarEmail(String email) {

        // Establecer el patron
        Pattern p = Pattern.compile("[-\\w\\.]+@\\w+\\.\\w+");

        // Asociar el string al patron
        Matcher m = p.matcher(email);

        // Comprobar si encaja
        return m.matches();

    }

    private void validacionCampos() {

        jtDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                validarLongitud(10, jtDocumento, e);
                soloNumeros(jtDocumento, e);
            }
        });

        jtPrimerNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                validarLongitud(20, jtPrimerNombre, e);
                soloLetras(jtPrimerNombre, e);
            }
        });
        jtSegundoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                validarLongitud(20, jtSegundoNombre, e);
                soloLetras(jtSegundoNombre, e);
            }
        });
        jtPrimerApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                validarLongitud(20, jtPrimerApellido, e);
                soloLetras(jtPrimerApellido, e);
            }
        });
        jtSegundoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                validarLongitud(20, jtSegundoApellido, e);
                soloLetras(jtSegundoApellido, e);
            }
        });
        jtCiudadNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                validarLongitud(30, jtCiudadNacimiento, e);
                soloLetras(jtCiudadNacimiento, e);
            }
        });
        jtDepartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                validarLongitud(30, jtDepartamento, e);
                soloLetras(jtDepartamento, e);
            }
        });
        jtProfesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                validarLongitud(30, jtProfesion, e);
                soloLetras(jtProfesion, e);
            }
        });
        jtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                validarLongitud(40, jtDireccion, e);

            }
        });
        jtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                validarLongitud(45, jtCorreo, e);
            }
        });
        jtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                validarLongitud(7, jtTelefono, e);
                soloNumeros(jtTelefono, e);
            }
        });
        jtMovil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                validarLongitud(10, jtMovil, e);
                soloNumeros(jtMovil, e);
            }
        });
        /*
         jtHorario.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyTyped(java.awt.event.KeyEvent e) {
         validarLongitud(10, jtHorario, e);
         soloLetras(jtHorario, e);
         }
         });
         */
        jtCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent e) {
                validarLongitud(50, jtCargo, e);
                soloLetras(jtCargo, e);
            }
        });
        /*
         jcTipoDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyTyped(java.awt.event.KeyEvent e) {
         validarLongitud(30, jcTipoDocumento, e);
         soloLetras(jcTipoDocumento, e);
         }
         });
        
        
         jtFechaNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyTyped(java.awt.event.KeyEvent e) {
         validarLongitud(10, jtFechaNacimiento, e);

         }
         });
         */
    }

    public int diferenciasDeFechas(Date fechaInicial, Date fechaFinal) {

        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        String fechaInicioString = df.format(fechaInicial);
        System.out.println(fechaInicioString);
        try {
            fechaInicial = df.parse(fechaInicioString);
        } catch (ParseException ex) {
        }

        String fechaFinalString = df.format(fechaFinal);
        try {
            fechaFinal = df.parse(fechaFinalString);
        } catch (ParseException ex) {
        }

        long fechaInicialMs = fechaInicial.getTime();
        long fechaFinalMs = fechaFinal.getTime();
        long diferencia = fechaFinalMs - fechaInicialMs;
        double dias = Math.floor(diferencia / (1000 * 60 * 60 * 24));
        return ((int) dias);
    }

    public Date deStringToDate(String fecha) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaEnviar = null;
        try {
            fechaEnviar = formatoDelTexto.parse(fecha);
            return fechaEnviar;
        } catch (ParseException ex) {
            ex.printStackTrace();
            return null;
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Archivos.ArchivoEmpleado;
import Identidades.Usuario;
import Listas.ListaEmpleado;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Estefania
 */
public class JFrameMenu extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMenu
     */
    
    public JFrameMenu() {
        initComponents();
        
    }

    public JFrameMenu(Usuario u) {
        this.setVisible(true);
         initComponents();
         if(u.getTipoUsuario().equals("ADMINISTRADOR"))
         {
             this.validarAdministrador();
             jlUsuario.setText(u.getDocumento());
             jlTipo.setText(u.getTipoUsuario());
         }
         else
         {
             if(u.getTipoUsuario().equals("EMPLEADO"))
             {
                 this.validarEmpleado();
                 jlUsuario.setText(u.getDocumento());
                 jlTipo.setText(u.getTipoUsuario());
             }
             
         }
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jlUsuario = new javax.swing.JLabel();
        jlTipo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmUsuario = new javax.swing.JMenuItem();
        jmEmpleados = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmCerdo = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jmPartos = new javax.swing.JMenuItem();
        jmDatos = new javax.swing.JMenuItem();
        jmEtapas = new javax.swing.JMenuItem();
        jmJaulas = new javax.swing.JMenuItem();
        jmAnimal = new javax.swing.JMenuItem();
        jmAyuda = new javax.swing.JMenu();
        jmManuales = new javax.swing.JMenuItem();
        jmAcerca = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jmrAnimales = new javax.swing.JMenuItem();
        jmrPartos = new javax.swing.JMenuItem();
        jmrMortalidad = new javax.swing.JMenuItem();
        jmrPersonas = new javax.swing.JMenuItem();
        jmrPeso = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem4.setText("jMenuItem4");

        jMenu3.setText("jMenu3");

        jMenu5.setText("jMenu5");

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Principal");
        setMinimumSize(new java.awt.Dimension(976, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 410, 70, 14);

        jlUsuario.setText("...");
        getContentPane().add(jlUsuario);
        jlUsuario.setBounds(100, 410, 100, 14);

        jlTipo.setText("...");
        getContentPane().add(jlTipo);
        jlTipo.setBounds(190, 410, 180, 14);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/LOGO_TRANS.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 0, 920, 400);

        jLabel6.setText("Version 1.0");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 380, 60, 20);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/file.png"))); // NOI18N
        jMenu1.setText("Archivo");

        jmUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\ye\\Documents\\NetBeansProjects\\ProyectoPorcicultura-2014-06-05\\images\\user.png")); // NOI18N
        jmUsuario.setText("Registrar Usuarios");
        jmUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jmUsuario);

        jmEmpleados.setIcon(new javax.swing.ImageIcon("C:\\Users\\ye\\Documents\\NetBeansProjects\\ProyectoPorcicultura-2014-06-05\\images\\person.png")); // NOI18N
        jmEmpleados.setText("Registrar Empleados");
        jmEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEmpleadosActionPerformed(evt);
            }
        });
        jMenu1.add(jmEmpleados);

        jMenuBar2.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/pig2.png"))); // NOI18N
        jMenu2.setText("Animal");

        jmCerdo.setIcon(new javax.swing.ImageIcon("C:\\Users\\ye\\Documents\\NetBeansProjects\\ProyectoPorcicultura-2014-06-05\\images\\cerdo.png")); // NOI18N
        jmCerdo.setText("Cerdos");

        jMenuItem7.setText("Mortalidad");
        jmCerdo.add(jMenuItem7);

        jMenuItem6.setText("Peso Animal");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jmCerdo.add(jMenuItem6);

        jmPartos.setText("Partos");
        jmCerdo.add(jmPartos);

        jmDatos.setText("Datos Generales");
        jmCerdo.add(jmDatos);

        jMenu2.add(jmCerdo);

        jmEtapas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/c1.png"))); // NOI18N
        jmEtapas.setText("Etapas");
        jMenu2.add(jmEtapas);

        jmJaulas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/Jail.png"))); // NOI18N
        jmJaulas.setText("Jaulas");
        jmJaulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmJaulasActionPerformed(evt);
            }
        });
        jMenu2.add(jmJaulas);

        jmAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/c2.png"))); // NOI18N
        jmAnimal.setText("Razas");
        jMenu2.add(jmAnimal);

        jmAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/help.png"))); // NOI18N
        jmAyuda.setText("Ayuda");

        jmManuales.setText("Manuales");
        jmAyuda.add(jmManuales);

        jmAcerca.setText("A cerca de...");
        jmAyuda.add(jmAcerca);

        jMenu2.add(jmAyuda);

        jMenuBar2.add(jMenu2);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/reporte3.png"))); // NOI18N
        jMenu6.setText("Reportes");

        jmrAnimales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/Reporte.png"))); // NOI18N
        jmrAnimales.setText("Animales");
        jMenu6.add(jmrAnimales);

        jmrPartos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/reporce.png"))); // NOI18N
        jmrPartos.setText("Partos");
        jMenu6.add(jmrPartos);

        jmrMortalidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/repor3.png"))); // NOI18N
        jmrMortalidad.setText("Mortalidad");
        jMenu6.add(jmrMortalidad);

        jmrPersonas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/reportemp.png"))); // NOI18N
        jmrPersonas.setText("Empleados");
        jmrPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmrPersonasActionPerformed(evt);
            }
        });
        jMenu6.add(jmrPersonas);

        jmrPeso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Formularios/reporpes.png"))); // NOI18N
        jmrPeso.setText("Peso");
        jMenu6.add(jmrPeso);

        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jmJaulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmJaulasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmJaulasActionPerformed

    private void jmrPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmrPersonasActionPerformed
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
    }//GEN-LAST:event_jmrPersonasActionPerformed

    private void jmUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmUsuarioActionPerformed
       // TODO add your handling code here:
        new JFrameUsuario();

    }//GEN-LAST:event_jmUsuarioActionPerformed

    private void jmEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEmpleadosActionPerformed
        // TODO add your handling code here:
        new JFrameEmpleado();
    }//GEN-LAST:event_jmEmpleadosActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JLabel jlTipo;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JMenuItem jmAcerca;
    private javax.swing.JMenuItem jmAnimal;
    private javax.swing.JMenu jmAyuda;
    private javax.swing.JMenu jmCerdo;
    private javax.swing.JMenuItem jmDatos;
    private javax.swing.JMenuItem jmEmpleados;
    private javax.swing.JMenuItem jmEtapas;
    private javax.swing.JMenuItem jmJaulas;
    private javax.swing.JMenuItem jmManuales;
    private javax.swing.JMenuItem jmPartos;
    private javax.swing.JMenuItem jmUsuario;
    private javax.swing.JMenuItem jmrAnimales;
    private javax.swing.JMenuItem jmrMortalidad;
    private javax.swing.JMenuItem jmrPartos;
    private javax.swing.JMenuItem jmrPersonas;
    private javax.swing.JMenuItem jmrPeso;
    // End of variables declaration//GEN-END:variables

    public void validarEmpleado() {
        jmAcerca.setEnabled(true);
        jmAnimal.setEnabled(true);
        jmAyuda.setEnabled(true);
        jmCerdo.setEnabled(true);
        jmDatos.setEnabled(true);
        jmEmpleados.setEnabled(true);
        jmEtapas.setEnabled(true);
        jmJaulas.setEnabled(true);
        jmManuales.setEnabled(true);
        jmPartos.setEnabled(true);
        jmUsuario.setEnabled(true);
        jmrAnimales.setEnabled(true);
        jmrMortalidad.setEnabled(true);
        jmrPartos.setEnabled(true);
        jmrPersonas.setEnabled(true);
        jmrPeso.setEnabled(true);

    }

    public void validarAdministrador() {
         jmAcerca.setEnabled(true);
        jmAnimal.setEnabled(true);
        jmAyuda.setEnabled(true);
        jmCerdo.setEnabled(true);
        jmDatos.setEnabled(true);
        jmEmpleados.setEnabled(true);
        jmEtapas.setEnabled(true);
        jmJaulas.setEnabled(true);
        jmManuales.setEnabled(true);
        jmPartos.setEnabled(true);
        jmUsuario.setEnabled(true);
        jmrAnimales.setEnabled(true);
        jmrMortalidad.setEnabled(true);
        jmrPartos.setEnabled(true);
        jmrPersonas.setEnabled(true);
        jmrPeso.setEnabled(true);
        
    }

}

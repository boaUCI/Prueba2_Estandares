/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Archivos.ArchivoUsuario;
import Listas.ListaUsuario;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import javax.swing.JOptionPane;

/**
 *
 * @author estefania
 */
public class JdEnviarCorreo extends javax.swing.JDialog {

    /**
     * Creates new form EnviarCorreo
     */
    String[] sw = new String[2];
    ListaUsuario lu = new ListaUsuario();
    ArchivoUsuario au = new ArchivoUsuario(lu);

    public JdEnviarCorreo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setVisible(true);
        initComponents();
        au.abrir();
        au.listar();
        lu = au.getLe();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbEnviar = new javax.swing.JButton();

        setTitle("Enviar Correo");

        jLabel1.setText("Numero de Documento");

        jbEnviar.setText("Enviar!");
        jbEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48)
                        .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jbEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jbEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEnviarActionPerformed
        // TODO add your handling code here:
        if (lu.existe(jtId.getText())) {

            if (enviarEmail()) {
                JOptionPane.showMessageDialog(null, "Mensaje enviado!");

            } else {
                JOptionPane.showMessageDialog(null, "Error al enviar mensaje.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "El empleado no existe");
        }

    }//GEN-LAST:event_jbEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(JdEnviarCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JdEnviarCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JdEnviarCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JdEnviarCorreo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JdEnviarCorreo dialog = new JdEnviarCorreo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbEnviar;
    private javax.swing.JTextField jtId;
    // End of variables declaration//GEN-END:variables
/*
     captura datos y envia el email mediante un server smtp.gmail.com
    
     */
    private boolean enviarEmail() {
        try {
            // Propiedades de la conexión

            //Recoger los datos
            String s[] = lu.getEmail(this.jtId.getText());
            if (s != null) {
                Properties props = new Properties();
                props.setProperty("mail.smtp.host", "smtp.gmail.com");
                props.setProperty("mail.smtp.starttls.enable", "true");
                props.setProperty("mail.smtp.port", "587");
                props.setProperty("mail.smtp.auth", "true");

                // Preparamos la sesion
                Session session = Session.getDefaultInstance(props);

                String str_De = "deportesmaxsistema@gmail.com";
                String str_PwRemitente = "DeportesM";
                String str_Para = s[0];
                String str_Asunto = "PORCICOLA “Wilbur” 'Confiramcion de password '";
                String str_Mensaje = "Los datos para ingresar al aplicativo son: \n\n"
                        + "Numero de documento: " + jtId.getText() + "\n"
                        + "Password: " + s[1] + "\n"
                        + "Si el problema persiste comuniquese con el administrador del sistema\n"
                        + "Gracias!";
                //Obtenemos los destinatarios
                String destinos[] = str_Para.split(",");

                // Construimos el mensaje
                MimeMessage message = new MimeMessage(session);

                message.setFrom(new InternetAddress(str_De));

                //Otra forma de especificar las direcciones de email 
                //a quienes se enviar el correo electronico
                //Forma 1
                //Address [] receptores = new Address []{
                //      new InternetAddress ("fuerenio@gmail.com"),
                //      new InternetAddress ("gonzasilve@gmail.com")
                //  };
                //Forma 2
                // Address[] receptores = new Address[]{
                //   new InternetAddress(str_De)
                //};
                //Forma 3
                Address[] receptores = new Address[destinos.length];
                int j = 0;
                while (j < destinos.length) {
                    receptores[j] = new InternetAddress(destinos[j]);
                    j++;
                }

                //receptores.
                message.addRecipients(Message.RecipientType.TO, receptores);
                message.setSubject(str_Asunto);
                message.setText(str_Mensaje);

                // Lo enviamos.
                Transport t = session.getTransport("smtp");
                t.connect(str_De, str_PwRemitente);
                t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));

                // Cierre de la conexion.
                t.close();
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "El Usuario no existe");
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

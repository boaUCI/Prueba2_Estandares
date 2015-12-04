/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Archivos.ArchivoEmpleado;
import Identidades.Empleado;
import Listas.ListaEmpleado;
import Listas.ListaUsuario;
import Nodos.NodoEmpleado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author estefania
 */
public class JFrameReporte extends JFrame implements ActionListener {

    //Container contenedor;
    ListaEmpleado le;
    ArchivoEmpleado ae;

    JTable tabla;//tabla
    JButton btn_imprimir, btn_volver;//botones
    JScrollPane scroll;//scroll se usa cuando la tabla es demasiado grande y para 
    int Ficha;
	//String matriz[][]={{"hola","bb"},{"que","mas"}};

    //se sobrecarga el constructor para que este me sirva para mostrar cualquier reguistro del sistema
    /**
     * *****************************************************Cliente****************************************
     */
    public JFrameReporte(String doc) {
        super("Reporte Usuario");

        le = new ListaEmpleado();
        ae = new ArchivoEmpleado(le);
        ae.abrir();
        ae.listar();
        le = ae.getLe();
        JScrollPane caja;
        JLabel lbtitulo;
        DefaultTableModel modelo;
        String Identificadores[] = new String[13];
        String Secundarios[] = new String[13];

        NodoEmpleado temp = le.getPrimero();
        //se busca el nodo esacto y se alamacena la informacion en el vector Secundarios y 
        //los nombres de los campos en el vector Identificadores
        if (existe(doc)) {
            while (temp != null) {

                if (temp.getEmpleado().getDocumento().equals(doc)) {
                    Empleado e = temp.getEmpleado();
                    Identificadores[0] = "Documento";
                    Identificadores[1] = "Tipo Documento";
                    Identificadores[2] = "Nombre";
                    Identificadores[3] = "Apellido";
                    Identificadores[4] = "Ciudad";
                    Identificadores[5] = "Departamento";
                    Identificadores[6] = "Cargo";
                    Identificadores[7] = "Fecha de Contratacion";
                    Identificadores[8] = "Dirección";
                    Identificadores[9] = "Correo";
                    Identificadores[10] = "Profesión";
                    Identificadores[11] = "Telefono";
                    Identificadores[12] = "Fecha de Reporte";

                    Secundarios[0] = e.getDocumento();
                    Secundarios[1] = e.getTipoDocumento();
                    Secundarios[2] = e.getPrimerNombre();
                    Secundarios[3] = e.getPrimerApellido();
                    Secundarios[4] = e.getCiudadNacimiento();
                    Secundarios[5] = e.getDepartamento();
                    Secundarios[6] = e.getCargo();
                    Secundarios[7] = e.getFechaContratacion();
                    Secundarios[8] = e.getDireccion();
                    Secundarios[9] = e.getCorreo();
                    Secundarios[10] = e.getProfesion();
                    Secundarios[11] = e.getTelefono();

                    Secundarios[12] = this.getFechaActual() + " - " + this.getHoraActual();

                    break;
                }
                temp = temp.getLiga();
            }

            lbtitulo = new JLabel("Empleado:" + Secundarios[0]);
            lbtitulo.reshape(20, 10, 200, 25);
            getContentPane().add(lbtitulo);

            //imprimir
            btn_imprimir = new JButton("Exportar");
            btn_imprimir.addActionListener(this);
            btn_imprimir.reshape(100, 250, 100, 25);

            //vovler
            btn_volver = new JButton("Volver");
            btn_volver.addActionListener(this);
            btn_volver.reshape(210, 250, 100, 25);

            //modelo 
            modelo = new DefaultTableModel();//inicializa
            for (int i = 0; i <= 12; i++) //añaden columnas
            {
                modelo.addColumn(Identificadores[i]);
            }
            modelo.addRow(Secundarios);//se añade el registro al modelo

            tabla = new JTable(modelo);//se añade el modelo a la tabla

            caja = new JScrollPane(tabla);//se añade la tabla al scroll (contenedor)
            caja.reshape(50, 50, 1100, 170);//dimensiones
            getContentPane().add(caja);//se añade el scroll(caja) al contenedor principal(ventana)

            getContentPane().add(btn_imprimir);//se añade el boton imprimir
            getContentPane().add(btn_volver);//se añade el boton eliminat

            setLayout(null);
            Ficha = 0;
            this.setSize(1200, 325);
            this.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "El documento no existe");
            repaint();
        }

        repaint();
    }

    public JFrameReporte() {
        super("Reporte Usuario");
        boolean sw = false;
        le = new ListaEmpleado();
        ae = new ArchivoEmpleado(le);
        ae.abrir();
        ae.listar();
        le = ae.getLe();
        JScrollPane caja;
        JLabel lbtitulo;
        DefaultTableModel modelo;
        modelo = new DefaultTableModel();//inicializa
        String Identificadores[] = new String[13];
        String Secundarios[] = new String[13];

        NodoEmpleado temp = le.getPrimero();
        //se busca el nodo esacto y se alamacena la informacion en el vector Secundarios y 
        //los nombres de los campos en el vector Identificadores

        if (temp != null) {
            Identificadores[0] = "Documento";
            Identificadores[1] = "Tipo Documento";
            Identificadores[2] = "Nombre";
            Identificadores[3] = "Apellido";
            Identificadores[4] = "Ciudad";
            Identificadores[5] = "Departamento";
            Identificadores[6] = "Cargo";
            Identificadores[7] = "Fecha de Contratacion";
            Identificadores[8] = "Dirección";
            Identificadores[9] = "Correo";
            Identificadores[10] = "Profesión";
            Identificadores[11] = "Telefono";
            Identificadores[12] = "Fecha de Reporte";
            for (int i = 0; i < Identificadores.length; i++) //añaden columnas
            {
                modelo.addColumn(Identificadores[i]);
            }
            while (temp != null) {

                Empleado e = temp.getEmpleado();

                Secundarios[0] = e.getDocumento();
                Secundarios[1] = e.getTipoDocumento();
                Secundarios[2] = e.getPrimerNombre();
                Secundarios[3] = e.getPrimerApellido();
                Secundarios[4] = e.getCiudadNacimiento();
                Secundarios[5] = e.getDepartamento();
                Secundarios[6] = e.getCargo();
                Secundarios[7] = e.getFechaContratacion();
                Secundarios[8] = e.getDireccion();
                Secundarios[9] = e.getCorreo();
                Secundarios[10] = e.getProfesion();
                Secundarios[11] = e.getTelefono();

                Secundarios[12] = this.getFechaActual() + " - " + this.getHoraActual();
                modelo.addRow(Secundarios);//se añade el registro al modelo
                repaint();
                System.out.println("pasocon" + e.getDocumento());
                sw = true;

                temp = temp.getLiga();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay ningun dato");
            repaint();
        }

        lbtitulo = new JLabel("Empleado:" + Secundarios[0]);
        lbtitulo.reshape(20, 10, 200, 25);
        getContentPane().add(lbtitulo);

        //imprimir
        btn_imprimir = new JButton("Exportar");
        btn_imprimir.addActionListener(this);
        btn_imprimir.reshape(100, 250, 100, 25);

        //vovler
        btn_volver = new JButton("Volver");
        btn_volver.addActionListener(this);
        btn_volver.reshape(210, 250, 100, 25);

        //modelo 
        tabla = new JTable(modelo);//se añade el modelo a la tabla

        caja = new JScrollPane(tabla);//se añade la tabla al scroll (contenedor)
        caja.reshape(50, 50, 1100, 170);//dimensiones
        getContentPane().add(caja);//se añade el scroll(caja) al contenedor principal(ventana)

        getContentPane().add(btn_imprimir);//se añade el boton imprimir
        getContentPane().add(btn_volver);//se añade el boton eliminat

        setLayout(null);
        Ficha = 0;
        this.setSize(1200, 325);
        this.setVisible(true);

        repaint();
    }

    public boolean existe(String d) {
        boolean sw = false;
        NodoEmpleado temp = le.getPrimero();
        while (temp != null) {
            if (temp.getEmpleado().getDocumento().equals(d)) {
                sw = true;
            }
            temp = temp.getLiga();
        }

        return sw;

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_imprimir) {

            try {
                // el valor de la variable ficha indica el titulo del reporte que se generara

                MessageFormat headerFormat = new MessageFormat("--> Ficha de Empleado <--");
                MessageFormat FooterFormat = new MessageFormat("--"+getFechaActual()+"--");
                tabla.print(JTable.PrintMode.FIT_WIDTH, headerFormat, FooterFormat);

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
        if (e.getSource() == btn_volver) {
            int salir = JOptionPane.showConfirmDialog(this, "seguro que desea salir?", "salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (salir == 0) {
                this.dispose();

            }
        }

    }

    //fecha actual 
    public static String getFechaActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        return formateador.format(ahora);
    }

    //hora actual
    public static String getHoraActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("hh:mm:ss");
        return formateador.format(ahora);
    }

}

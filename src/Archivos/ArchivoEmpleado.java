/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Identidades.Empleado;
import Listas.ListaEmpleado;
import Listas.ListaUsuario;
import Nodos.NodoEmpleado;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Estefania
 */
public class ArchivoEmpleado {

    private DataOutputStream salida;
    private DataInputStream entrada;
    private ListaEmpleado le;

    public ArchivoEmpleado(ListaEmpleado le)
    {
        this.le= le;
    }

    public ListaEmpleado getLe() {
        return le;
    }

    public void setLe(ListaEmpleado le) {
        this.le = le;
    }

    public void abrir() {
        try {
            salida = new DataOutputStream(new FileOutputStream("Empleado.dad", true));
        } catch (IOException e) {
            System.out.println("nos se pudo abrir el archivo");
            System.exit(1);
        }
    }

    public void listar() {

        try {
            salida.flush();
            entrada = new DataInputStream(new FileInputStream("Empleado.dad"));
        } catch (IOException e) {
            System.out.println("No se pudo abrir el archivo para lectura");
            System.exit(1);
        }
        try {

            while (true) {

                Empleado e = new Empleado();
                e.setCiudadNacimiento(entrada.readUTF());
                e.setCorreo(entrada.readUTF());
                e.setDepartamento(entrada.readUTF());
                e.setDireccion(entrada.readUTF());
                e.setDocumento(entrada.readUTF());
                e.setMovil(entrada.readUTF());
                e.setPrimerApellido(entrada.readUTF());
                e.setSegundoApellido(entrada.readUTF());
                e.setPrimerNombre(entrada.readUTF());
                e.setSegundoNombre(entrada.readUTF());
                e.setTelefono(entrada.readUTF());
                e.setProfesion(entrada.readUTF());
                e.setCargo(entrada.readUTF());
                e.setTipoDocumento(entrada.readUTF());
                e.setTipoSangre(entrada.readUTF());
                e.setTipoContrato(entrada.readUTF());
                e.setFactorRH(entrada.readUTF());
                e.setFechaNacimiento(entrada.readUTF());
                e.setFechaTitulo(entrada.readUTF());
                e.setFechaContratacion(entrada.readUTF());
                le.setEmpleado(e);

            }
        } catch (EOFException e) {
            // SE DISPARA CUANDO SE TERMINA DE LEER EL ARCHIVO

        } catch (IOException e) {
            System.out.println("error al listar el archivo");
            System.exit(1);
        }
    }

    //guarda todos los archivos almacenados en la lista
    public void guardar( ListaEmpleado le ) {
        this.le= le;
        NodoEmpleado temp = le.getPrimero();
        try {
            salida.flush();
            salida = new DataOutputStream(new FileOutputStream("Empleado.dad"));
        } catch (IOException e) {
            System.out.println("nos se pudo abrir el archivo");
            System.exit(1);
        }

        try {
            Empleado et = null;
            while (temp != null) {
                et = temp.getEmpleado();
                salida.writeUTF(et.getCiudadNacimiento());
                salida.writeUTF(et.getCorreo());
                salida.writeUTF(et.getDepartamento());
                salida.writeUTF(et.getDireccion());
                salida.writeUTF(et.getDocumento());
                salida.writeUTF(et.getMovil());
                salida.writeUTF(et.getPrimerApellido());
                salida.writeUTF(et.getSegundoApellido());
                salida.writeUTF(et.getPrimerNombre());
                salida.writeUTF(et.getSegundoNombre());
                salida.writeUTF(et.getTelefono());
                salida.writeUTF(et.getProfesion());
                salida.writeUTF(et.getCargo());
                salida.writeUTF(et.getTipoDocumento());
                salida.writeUTF(et.getTipoSangre());
                salida.writeUTF(et.getTipoContrato());
                salida.writeUTF(et.getFactorRH());
                salida.writeUTF(et.getFechaNacimiento());
                salida.writeUTF(et.getFechaTitulo());
                salida.writeUTF(et.getFechaContratacion());
              
                temp = temp.getLiga();
            }

        } catch (IOException e) {
 
            System.out.println("error al escribir en el archivo");
            System.exit(1);
        }

    }

}

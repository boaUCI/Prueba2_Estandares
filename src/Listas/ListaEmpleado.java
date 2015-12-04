/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Archivos.ArchivoUsuario;
import Identidades.Empleado;
import Nodos.NodoEmpleado;
import Nodos.NodoUsuario;

/**
 *
 * @author estefania
 */
public class ListaEmpleado {

    private NodoEmpleado primero;
    private NodoEmpleado ultimo;

    public ListaEmpleado() {
        primero = null;
        ultimo = null;
    }

    public boolean setEmpleado(Empleado e) {
        boolean sw = false;
        NodoEmpleado p = new NodoEmpleado();
        p.setEmpleado(e);

        if (primero == null) {
            primero = p;
            ultimo = p;
            primero.setLiga(null);
            sw = true;
        } else {
            ultimo.setLiga(p);
            ultimo = p;
            sw = true;
        }

        return sw;
    }

    public Empleado getEmpleado(String documento) {
        boolean sw = false;
        NodoEmpleado p = primero;
        Empleado result = null;
        while (p != null) {
            if (p.getEmpleado().getDocumento().equals(documento)) {
                result = p.getEmpleado();
            }
            p = p.getLiga();
        }

        return result;
    }

    public boolean eliminarEmpleado(String documento) {
        boolean sw = false;

        NodoEmpleado p = primero;
        NodoEmpleado ant = primero;
        while (p != null) {
            if (p.getEmpleado().getDocumento().equals(documento)) {
                if (p == primero) {
                    primero = primero.getLiga();
                } else {
                    if (p == ultimo) {
                        ultimo = ant;
                    }
                    ant.setLiga(p.getLiga());
                    

                }
                sw=true;
            }
            ant = p;
            p = p.getLiga();
        }
        
         
        ListaUsuario lu = new ListaUsuario();
        ArchivoUsuario au = new ArchivoUsuario(lu);
        au.abrir();
        au.listar();
        lu = au.getLe();
        NodoUsuario q;
        NodoUsuario usuarioPrimero= lu.getPrimero();
        NodoUsuario usuairoUltimo= lu.getUltimo();
        q = lu.getPrimero();
        NodoUsuario antq= lu.getPrimero();
        while (q != null) {
            if (q.getU().getDocumento().equals(documento)) {
                if (q == usuarioPrimero) {
                    usuarioPrimero = usuarioPrimero.getLiga();
                } else {
                    if (q == usuairoUltimo) {
                        usuairoUltimo = antq;
                    }
                    antq.setLiga(q.getLiga());
                    

                }
                sw=true;
            }
            antq = q;
            q = q.getLiga();
        }
        au.guardar(lu);

        return sw;

    }
    public boolean modificar(Empleado e)
    {
        boolean sw= false;
        NodoEmpleado p= primero;
        
        while(p!=null)
        {
            if(p.getEmpleado().getDocumento().equals(e.getDocumento()))
            {
                p.setEmpleado(e);
                sw=true;
            }
            p=p.getLiga();
        }
        return sw;
    }
    public boolean existe(String documento)
    {
        boolean sw=false;
        NodoEmpleado p= primero;
        while(p!=null)
        {
            if(p.getEmpleado().getDocumento().equals(documento))
            {
                sw=true;
            }
            p=p.getLiga();
        }
        return sw;
    }

    public NodoEmpleado getPrimero() {
        return primero;
    }

    public void setPrimero(NodoEmpleado primero) {
        this.primero = primero;
    }

    public NodoEmpleado getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoEmpleado ultimo) {
        this.ultimo = ultimo;
    }
    
}

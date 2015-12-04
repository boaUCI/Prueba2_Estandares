
package Listas;

import Archivos.ArchivoEmpleado;
import Identidades.Usuario;
import Nodos.NodoEmpleado;
import Nodos.NodoUsuario;

/**
 *
 * @author estefania
 */
public class ListaUsuario {

    private NodoUsuario primero;
    private NodoUsuario ultimo;

    public ListaUsuario() {
        primero = null;
        ultimo = null;
    }

    public boolean setUsuario(Usuario e) {
        boolean sw = false;
        NodoUsuario p = new NodoUsuario();
        p.setU(e);

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

    public Usuario getUsuario(String documento) {
        boolean sw = false;
        NodoUsuario p = primero;
        Usuario result = null;
        while (p != null) {
            if (p.getU().getDocumento().equals(documento)) {
                result = p.getU();
            }
            p = p.getLiga();
        }

        return result;
    }

    public boolean eliminarUsuario(String documento) {
        boolean sw = false;

        NodoUsuario p = primero;
        NodoUsuario ant = primero;
        while (p != null) {
            if (p.getU().getDocumento().equals(documento)) {
                if (p == primero) {
                    primero = primero.getLiga();
                } else {
                    if (p == ultimo) {
                        ultimo = ant;
                    }
                    ant.setLiga(p.getLiga());
                

                }
                sw = true;
            }
            ant = p;
            p = p.getLiga();
        }

        return sw;

    }

    public boolean modificar(Usuario e) {
        boolean sw = false;
        NodoUsuario p = primero;

        while (p != null) {
            if (p.getU().getDocumento().equals(e.getDocumento())) {
                p.setU(e);
                sw = true;
            }
            p = p.getLiga();
        }
        return sw;
    }

    public boolean existe(String documento) {
        boolean sw = false;
        NodoUsuario p = primero;
        while (p != null) {
            if (p.getU().getDocumento().equals(documento)) {
                sw = true;
            }
            p = p.getLiga();
        }
        return sw;
    }

    public boolean existeEmpleado(String e) {
        boolean sw = false;
        ListaEmpleado le = new ListaEmpleado();
        ArchivoEmpleado ae = new ArchivoEmpleado(le);
        ae.abrir();
        ae.listar();
        le = ae.getLe();
        NodoEmpleado p = le.getPrimero();
        while (p != null) {
            if (p.getEmpleado().getDocumento().equals(e)) {
                sw = true;
            }

            p = p.getLiga();
        }

        return sw;
    }
    public String[] getEmail(String e) {
        String []sw = new String[2];
        ListaEmpleado le = new ListaEmpleado();
        ArchivoEmpleado ae = new ArchivoEmpleado(le);
        ae.abrir();
        ae.listar();
        le = ae.getLe();
        NodoEmpleado p = le.getPrimero();
        while (p != null) {
            if (p.getEmpleado().getDocumento().equals(e)) {
                sw[0] = p.getEmpleado().getCorreo();//correo
                sw[1] = this.getUsuario(e).getClave();//email
            }

            p = p.getLiga();
        }

        return sw;
    }
    
    public Usuario login(Usuario u)
    {
        Usuario sw=null;
       
        NodoUsuario p = primero;
        while (p != null) {
            if (p.getU().getDocumento().equals(u.getDocumento())&&p.getU().getClave().equals(u.getClave())) {
                sw =p.getU();
            }
            p = p.getLiga();
        }
        
        return sw;
    }

    public NodoUsuario getPrimero() {
        return primero;
    }

    public void setPrimero(NodoUsuario primero) {
        this.primero = primero;
    }

    public NodoUsuario getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoUsuario ultimo) {
        this.ultimo = ultimo;
    }

}

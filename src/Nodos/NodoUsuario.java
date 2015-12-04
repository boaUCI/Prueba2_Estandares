

package Nodos;

import Identidades.Usuario;


public class NodoUsuario {
    
    private NodoUsuario liga;
    private Usuario u;
    public NodoUsuario()
    {
        liga=null;
    }

    public NodoUsuario getLiga() {
        return liga;
    }

    public void setLiga(NodoUsuario liga) {
        this.liga = liga;
    }

    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }
    
            
    
}

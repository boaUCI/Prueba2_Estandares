/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nodos;

import Identidades.Empleado;

/**
 *
 * @author estefania
 */
public class NodoEmpleado {
    private Empleado empleado;
    private NodoEmpleado liga;
    public void NodoEmpleado()
    {
        liga=null;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public NodoEmpleado getLiga() {
        return liga;
    }

    public void setLiga(NodoEmpleado liga) {
        this.liga = liga;
    }
    
}

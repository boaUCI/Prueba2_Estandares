/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Identidades;

/**
 *
 * @author estefania
 */
public class Usuario {
    private String documento;
    private String clave;
    private String tipoUsuario;
    private Usuario liga;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario getLiga() {
        return liga;
    }

    public void setLiga(Usuario liga) {
        this.liga = liga;
    }
    
}

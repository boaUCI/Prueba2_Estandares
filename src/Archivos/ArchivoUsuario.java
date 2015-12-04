

package Archivos;


import Identidades.Usuario;
import Listas.ListaUsuario;
import Nodos.NodoUsuario;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class ArchivoUsuario {
    


    private DataOutputStream salida;
    private DataInputStream entrada;
    private ListaUsuario le;

    public ArchivoUsuario(ListaUsuario le)
    {
        this.le= le;
    }

    public ListaUsuario getLe() {
        return le;
    }

    public void setLe(ListaUsuario le) {
        this.le = le;
    }

    public void abrir() {
        try {
            salida = new DataOutputStream(new FileOutputStream("Usuario.dad", true));
        } catch (IOException e) {
            System.out.println("nos se pudo abrir el archivo");
            System.exit(1);
        }
    }

    public void listar() {

        try {
            salida.flush();
            entrada = new DataInputStream(new FileInputStream("Usuario.dad"));
        } catch (IOException e) {
            System.out.println("No se pudo abrir el archivo para lectura");
            System.exit(1);
        }
        try {

            while (true) {

                Usuario e = new Usuario();
                e.setDocumento(entrada.readUTF());
                e.setClave(entrada.readUTF());
                e.setTipoUsuario(entrada.readUTF());
                le.setUsuario(e);

            }
        } catch (EOFException e) {
            // SE DISPARA CUANDO SE TERMINA DE LEER EL ARCHIVO

        } catch (IOException e) {
            System.out.println("error al listar el archivo");
            System.exit(1);
        }
    }

    //guarda todos los archivos almacenados en la lista
    public void guardar( ListaUsuario le ) {
        this.le= le;
        NodoUsuario temp = le.getPrimero();
        try {
            salida.flush();
            salida = new DataOutputStream(new FileOutputStream("Usuario.dad"));
        } catch (IOException e) {
            System.out.println("nos se pudo abrir el archivo");
            System.exit(1);
        }

        try {
            Usuario et = null;
            while (temp != null) {
                et = temp.getU();
                salida.writeUTF(et.getDocumento());
                salida.writeUTF(et.getClave());
                salida.writeUTF(et.getTipoUsuario());
                
              
                temp = temp.getLiga();
            }

        } catch (IOException e) {
 
            System.out.println("error al escribir en el archivo");
            System.exit(1);
        }

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos2;

/**
 *
 * @author Samuel
 */
public class Persoal {
    private int telefono;
    private String correo;

    public Persoal(int telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }

    public Persoal() {
    }

    @Override
    public String toString() {
        return "Persoal{" + "telefono=" + telefono + ", correo=" + correo + '}';
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
}

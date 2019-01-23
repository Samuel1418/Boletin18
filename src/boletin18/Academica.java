/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

import alumnos2.Persoal;

/**
 *
 * @author Samuel
 */
public class Academica {
    private static int numReferencia=2018;
    private String nome;
    private float nota;
    private Persoal per= new Persoal();  // Asi creo el espacio para que no sea solo una referencia

    public Academica(int numReferencia, String nome, float nota, String persoalAlum) {
        this.numReferencia = numReferencia;
        this.nome = nome;
        this.nota = nota;
    }

    public Academica(){}
    
    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public static int getNumReferencia() {
        return numReferencia;
    }

    
    
    public String getNome() {
        return nome;
    }

    public float getNota() {
        return nota;
    }

    public Persoal getPer() {
        return per;
    }

    public void setTelefono(int telefono) {
        per.setTelefono(telefono);
    }

    public void setCorreo(String correo){
    per.setCorreo(correo);
    }
    
    public int getTelefono() {
       return per.getTelefono();
    }
    
    public String getCorreo() {
       return per.getCorreo();
    }
    
    @Override
    public String toString() {
        return "Academica{" + "nome=" + nome + ", nota=" + nota + ", per=" + per + '}';
    }

    
}